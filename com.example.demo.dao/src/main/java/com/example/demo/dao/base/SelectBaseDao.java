package com.example.demo.dao.base;

import java.util.List;

public interface SelectBaseDao<T> {
	
	T selectByPrimaryKey(Object primaryKey);
	
	List<T> selectByPrimaryKeys(Object ...primaryKey);
	
	List<T> selectPageByStartRow(T entry, Long startRow, Long limit);
	
	List<T> selectPageByStartPrimaryKey(T entry, Object startPrimaryKey, Integer limit);
	
	long selectCount(T entry);
	
	List<T> selectAll();
	
	List<T> selectByEntry(T entry);

}
