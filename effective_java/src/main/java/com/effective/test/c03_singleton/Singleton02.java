package com.effective.test.c03_singleton;

/**
 * 使用enum来实现单例
 * 
 * 	《Effective Java》 第三点说，enum 是实现单例的最好方法	
 * 
 * @author wangzhy
 * @since 2020年10月29日
 */
public enum Singleton02 {
	INSTANCE;
	
	private String name;

	/**  
	 * 获取name  
	 * @return name name  
	 */
	public String getName() {
		return name;
	}

	/**  
	 * 设置name  
	 * @param name name  
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	public static void main(String[] args) {
		
		Singleton02 instance = Singleton02.INSTANCE;
		
	}
	
}
