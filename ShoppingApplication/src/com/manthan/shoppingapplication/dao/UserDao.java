package com.manthan.shoppingapplication.dao;

import com.manthan.shoppingapplication.bean.UserInfoBean;

public interface UserDao {
	public boolean registerUser(UserInfoBean userInfoBean);
	public UserInfoBean authenticateUser(String email,String password);
}
