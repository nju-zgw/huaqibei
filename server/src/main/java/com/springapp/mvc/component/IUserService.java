package com.springapp.mvc.component;

import com.springapp.mvc.db.entities.UserEntity;

/**
 * Created by zgw on 2015/7/29.
 */
public interface IUserService {
    public UserEntity getUserDetail(Integer id);
}
