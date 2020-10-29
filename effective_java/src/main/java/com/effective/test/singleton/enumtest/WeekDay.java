package com.effective.test.singleton.enumtest;

/**
 * enum 的构造方法
 * @author wangzhy
 * @since 2020年10月29日
 */
public enum WeekDay {
	Mon("Monday"), Tue("Tuesday"), Wed("Wednesday"), Thu("Thursday"), Fri("Friday"), Sat("Saturday"), Sun("Sunday");
	
	private final String name;

	private WeekDay(String name) {
		this.name = name;
		System.out.println(name);
	}

	public static void main(String[] args) {

	}
}
