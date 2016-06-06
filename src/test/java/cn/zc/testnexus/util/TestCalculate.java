package cn.zc.testnexus.util;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestCalculate {

	Calculate cal;
	@Before
	public void setUp(){
		cal=new Calculate();
	}

	@Test
	public void testAdd() {
		assertEquals("add is not right",24, cal.add(12, 12));
	}
	
	@Test
	public void testDivide() {
		assertEquals("divide is not right",1, cal.divide(12, 12));
		assertEquals("divide is not right",0, cal.divide(11, 12));
	}
	
	/*
	 * ���������Ӧ���׳��쳣�����ڲ����쳣
	 */
	@Test(expected=ArithmeticException.class)
	public void testDivideException() {
		assertEquals("divide is not throws",1, cal.divide(12, 0));
		
	}
	
	
	/*
	 * �������ܣ��ò���Ҫ��ָ��ʱ����ִ�����
	 */
	@Test(timeout=300)
	public void testTimeout(){
		
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

	@Test
	public void testHamcrest(){
		assertThat(50, allOf(greaterThan(20),lessThan(60)));
		
		assertThat("abc.txt",endsWith("txt"));
		
		
	}
}
