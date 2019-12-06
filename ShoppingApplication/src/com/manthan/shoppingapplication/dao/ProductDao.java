package com.manthan.shoppingapplication.dao;

import com.manthan.shoppingapplication.bean.ProductInfoBean;

public interface ProductDao {
		public ProductInfoBean searchProduct(String productName);
}
