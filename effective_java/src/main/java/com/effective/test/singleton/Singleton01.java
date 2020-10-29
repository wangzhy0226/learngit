package com.effective.test.singleton;

/**
 * 通过私有化构造方法实现单例   使用静态工厂方法实现
 * 	此实例没有实现线程安全，并且可以通过反射来创建Singleton01对象
 * 	
 * @author wangzhy
 * @since 2020年10月28日
 */
public class Singleton01 {
	
	private static final Singleton01 INSTANCE = new Singleton01();
	
	private String property;
	
	/**
	 * 私有化构造方法
	 */
	private Singleton01() {
		
	}
	
	/**
	 * 获取该类的单例对象，没有考虑线程安全问题
	 * @return
	 */
	public static Singleton01 getInstance() {
		return INSTANCE;
	}

	/**  
	 * 获取property  
	 * @return property property  
	 */
	public String getProperty() {
		return property;
	}

	/**  
	 * 设置property  
	 * @param property property  
	 */
	public void setProperty(String property) {
		this.property = property;
	}
	
}
