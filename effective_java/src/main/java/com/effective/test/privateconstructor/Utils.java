package com.effective.test.privateconstructor;

/**
 * 当类中只有静态方法和静态变量时，应该保证这个类不会被实例化。应该将构造器私有化。
 * @author wangzhy
 * @since 2020年10月29日
 */
public class Utils {
	
	/**
	 * 私有化构造方法，避免被实例化
	 */
	private Utils() {
		// 避免在内部被实例化 
		throw new RuntimeException();
	}

	public static int num;
	
	public static void add() {
		num++;
	}
	
}
