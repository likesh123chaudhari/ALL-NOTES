package com.demo.service;

import java.util.List;

import com.demo.dao.CategoryDao;
import com.demo.dao.CategoryDaoImpl;
import com.demo.model.Category;

public class CategoryServiceImpl implements CategoryService{
  private CategoryDao cdao;

public CategoryServiceImpl() {
	super();
	cdao=new CategoryDaoImpl();
}

@Override
public List<Category> getAllCategory() {
	return cdao.findAllCategory();
}
}
