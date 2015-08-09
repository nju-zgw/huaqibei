package com.springapp.mvc.component;

import com.springapp.mvc.db.entities.UserEntity;
import org.springframework.stereotype.Component;

/**
 * Created by zgw on 2015/7/29.
 */
@Component
public class UserService implements IUserService{
    @Override
    public UserEntity getUserDetail(Integer id) {
        UserEntity p = new UserEntity();
        p.setId(id);
        p.setAge((byte)18);
        p.setName("Ram");
        return p;
    }
}
