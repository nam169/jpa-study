package com.namnh.common;

public interface IBaseService {

	public <T> T create( T t);
	
	public <T> T save( T t);
	
	public <T> T update( T t);
	
	public <T> T delete( T t);
	
}
