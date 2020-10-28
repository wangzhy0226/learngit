package com.effective.java;

import java.util.Date;

/**
 * 考虑使用静态工厂方法替代构造方法
 * 		静态工厂方法的优点
 * 			1. 相对于构造方法，静态工厂方法是有名称的  （ java.util.Date 的构造方法 ）
 * 					可能一个类中有多个构造方法，只是参数的类型的顺序不同，这个对使用者不友好，只有在看过API之后，才能
 * 					正确的调用，但是使用静态工厂方法的时候，可以根据方法名来正确调用。
 * 			2. 不需要在每次调用的时候都创建一个对象
 * 					在重复调用的时候，返回相同实例。
 * 			3. 可以返回其返回类型的任何子类的对象
 * 			4. 返回的对象可以根据输入的参数不同而不同
 * @author wangzhy
 * @since 2020年10月28日
 */
public class Code01 {
	public static void main(String[] args) {
		// 根据下面的代码，很难判断出这几个构造方法的区别
		Date date = new Date();
		Date date1 = new Date(1);
		Date date2 = new Date(1,1,1);
		Date date3 = new Date(1,1,1,1,1);
		Date date4 = new Date(1,1,1,1,1,1);
		// 参考文章：https://www.jianshu.com/p/ceb5ec8f1174
	}
}
