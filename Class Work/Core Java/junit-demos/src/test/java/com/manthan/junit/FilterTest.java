package com.manthan.junit;
import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.mantan.junit.DBUtil;
import com.mantan.junit.DBUtilImpl;
import com.mantan.junit.Filter;

class FilterTest {

	@Test
	void testMyFilter() {
		DBUtil db=mock(DBUtil.class);
		Filter f=new Filter(db);
		
		when(db.getList()).thenReturn(Arrays.asList("Ankit","Sushil","Ankur"));
		
		List<String> list=f.myFilter();
		assertEquals(2, list.size());
	}

}
