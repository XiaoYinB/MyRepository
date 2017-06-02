package com.yin.shoppmall.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;
import java.sql.SQLException;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class ShoppMallTest {
	
	@Autowired
    private DataSource dataSource;
	
	@Test
	public void testDataSource() throws SQLException {
	System.out.println(dataSource.getConnection());
			
	}
	@Test
	public void test(){



	}
	
	
	

}
