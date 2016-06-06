package cn.zc.testnexus.service;

import org.junit.Before;
import org.junit.Test;

import cn.zc.testnexus.model.User;
import cn.zc.testnexus.model.UserException;

import static org.junit.Assert.*;

public class TestUserService {
	private UserService userService;
	private User baseUser;
	
	@Before
	public void setUp(){
		baseUser=new User("daf","123");
	}
	
	@Test
	public void testAdd(){
		User u=baseUser;
		
		userService.add(u);
		
		User tu=userService.load("daf");
		
		assertNotNull(tu);
		assertEquals(tu.getName(), u.getName());
		assertEquals(tu.getPassword(), u.getPassword());
	}
	
	@Test(expected=UserException.class)
	public void testAddExistUsername(){
		userService.add(baseUser);
		User tu=new User("daf","ddd");
		userService.add(tu);
	}
	
	@Test
	public void testDelete(){
		fail("�����delete���Դ���");
	}
	
	@Test
	public void testLoad(){
		fail("�����load���Դ���");
	}
	
	@Test
	public void testlogin(){
		fail("�����login���Դ���");
	}
	
	@Test
	public void testNotExistsUserlogin(){
		fail("�����login���Դ���");
	}
}
