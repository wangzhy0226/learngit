package com.effective.test.staticfactorymethod;

import java.util.Date;

public class Test {

	public static Food getFood(String foodName) throws Exception {
		if("finish".equals(foodName)) {
			return new Finish();
		}else if("fruit".equals(foodName)) {
			return new Fruit();
		}else {
			throw new Exception("没有找到对应的食物！");
		}
	}
	
	public static void main(String[] args) throws Exception {
		Food fruit = Test.getFood("fruit");
		fruit.introduce();
		Food finish = Test.getFood("finish");
		finish.introduce();
	}
}
