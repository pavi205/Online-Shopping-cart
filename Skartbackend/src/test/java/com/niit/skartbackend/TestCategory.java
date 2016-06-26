package com.niit.skartbackend;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.skartbackend.dao.Categorydao;
import com.niit.skartbackend.model.Category;


public class TestCategory {

	static AnnotationConfigApplicationContext context;
	
	public static void main(String args[])

		{
		
		context = new AnnotationConfigApplicationContext();
		 
		context.scan("com.niit.skartbackend.config");
		
		context.refresh();

		Categorydao categorydao = (Categorydao) context.getBean("categoryDao");
		
		List<Category> li = new ArrayList<Category>();
		li = categorydao.list();
		for (Category c : li) {
			System.out.println(c.getId() + ":" + c.getName() + ":" + c.getDescription());
		
		
		}

	}

}
