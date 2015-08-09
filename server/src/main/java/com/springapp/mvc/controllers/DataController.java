package com.springapp.mvc.controllers;

/**
 * Created by zgw on 2015/7/29.
 */


import com.springapp.mvc.component.IUserService;
import com.springapp.mvc.db.entities.UserEntity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/data")
public class DataController {

    @Autowired
    private IUserService personService;

    @RequestMapping(value = "/person.json", method= RequestMethod.GET)
    public @ResponseBody
    UserEntity getPersonDetail(@RequestParam int id) {

        UserEntity p = personService.getUserDetail(id);
        return p;
    }
}

