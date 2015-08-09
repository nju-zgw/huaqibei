package com.springapp.mvc.controllers;

import com.springapp.mvc.User;
import com.springapp.mvc.db.DBConnection;
import com.springapp.mvc.db.entities.UserEntity;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by zgw on 2015/7/28.
 */

@Controller
public class UserController {
    @RequestMapping(value = "/users",method = RequestMethod.GET)
    public String showUser(ModelMap model){
        Session s = DBConnection.getSession();
        List<UserEntity> userList = s.createCriteria(UserEntity.class).addOrder(Order.desc("id")).list();
        model.addAttribute("users",userList);
        s.close();
        return "users";
    }
    @RequestMapping(value = "/add_user",method = RequestMethod.GET)
    public String addUser(ModelMap model){
        User u = new User();
        u.setName("zgw");
        model.addAttribute("user", u);
        return "adduser";
    }
    @RequestMapping(value = "/2",method = RequestMethod.POST)
    public String getURL(ModelMap model,@RequestParam String name,@RequestParam int age,HttpServletRequest request,HttpServletResponse response) {
        model.addAttribute("name", name);
        model.addAttribute("age",age);
        Session s = DBConnection.getSession();
        Transaction t = s.beginTransaction();

        UserEntity ue = new UserEntity();
        ue.setName(name);
        ue.setAge((byte) age);
        s.save(ue);
        t.commit();
        s.close();


        return "name";
    }
}
