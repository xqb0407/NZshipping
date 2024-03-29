package org.nzy.sso.service;

import org.nzy.pojo.FjnyResult;

public interface UserLoginService {
	//登录
	FjnyResult login(String username,String password);
	//获取用户缓存
	FjnyResult getUserByToken(String token);
	//注册
	FjnyResult doReg(String username, String password, String phone, String email);
	//修改密码
	FjnyResult updatePass(Long id, String password, String oldpass);
	
}
