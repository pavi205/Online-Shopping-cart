package com.niit.skart.controller;

	import java.util.ArrayList;
	import java.util.List;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Controller;
	import org.springframework.web.bind.annotation.ModelAttribute;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RequestParam;
	import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;
import com.niit.skart.bean.Category;
import com.niit.skart.dao.Categorydao;

@Controller
	public class Categorycontroller{
	
@Autowired
		private Categorydao categorydao;
		
 @RequestMapping("/discount")
		public ModelAndView getAllCategories() {

	 System.out.println("am in category controller");
			
			List<Category> categoryList =  categorydao.getAllCategories();
			String obj;
			ModelAndView mv = new ModelAndView();
			Gson gson=new Gson();
			obj = gson.toJson(categoryList);
			mv.addObject("cate", obj);
            	System.out.println(obj);	
			return mv;
			
			
		}
		
		
		
		
	}

	

