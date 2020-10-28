package com.effective.test.staticfactorymethod;

/**
 * 水果
 * @author wangzhy
 * @since 2020年10月28日
 */
public class Fruit implements Food{

	public void introduce() {
		System.out.println("我是水果！");
	}
	
	public void otherMethod() {
		System.out.println("我是除introduce以外的方法！");
	}
}
