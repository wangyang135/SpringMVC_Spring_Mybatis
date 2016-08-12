package com.ssm.test;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.ssm.domain.ItemsCustom;
import com.ssm.mapper.ItemsMapperCustom;



public class ItemsTest {

	String resource = "spring/applicationContext-dao.xml";
	@Test
	public void testOrdersMapper() throws Exception {
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

		SqlSession sqlSession = sessionFactory.openSession();
		ItemsMapperCustom itemsCustom = sqlSession.getMapper(ItemsMapperCustom.class);
		List<ItemsCustom> customList = itemsCustom.findItemsList(null);
		System.out.println(customList);
		sqlSession.close();
		
	}
}
