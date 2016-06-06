package cn.zc.testnexus.service;

import cn.zc.testnexus.model.User;

public interface UserService {
	public void add(User user);
	
	public void delete(String name);
	
	public User load(String name);
	
	public User login(String name,String password);
}
