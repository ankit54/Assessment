package com.manthan.hotelbilling.dao;

import java.util.List;

import com.manthan.hotelbilling.bean.ItemInfoBean;

public interface ItemDao {
	public List<ItemInfoBean> showAll();
	public boolean addFoodItem(ItemInfoBean itemInfoBean);
	public boolean removeFoodItem(int itemCode);
	public boolean modifyFoodItem(int itemCode,String foodName,double price);
	public double generateTotalPrice(List<Integer> orderedItems);
	public List<ItemInfoBean> generateBill(List<Integer> orderedItems);
}
