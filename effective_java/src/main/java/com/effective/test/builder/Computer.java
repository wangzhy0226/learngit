package com.effective.test.builder;

/**
 * 当参数过多时，使用builder模式
 * @author wangzhy
 * @since 2020年10月28日
 */
public class Computer {
	private final String CPU; // 必须 required

	private final String memory;// 必须 required

	private final String hardDisk; // 可选的  optional

	private final String keyBoard;// 可选的  optional

	private final String mouse;// 可选的  optional

	/**
	 * 静态内部类
	 * @author wangzhy
	 * @since 2020年10月28日
	 */
	public static class Builder {
		private final String CPU; // 必须 required

		private final String memory;// 必须 required

		private String hardDisk; // 可选的  optional

		private String keyBoard;// 可选的  optional

		private String mouse;// 可选的  optional

		public Builder(String cpu, String memory) {
			this.CPU = cpu;
			this.memory = memory;
		}

		public Builder hardDisk(String hardDisk) {
			this.hardDisk = hardDisk;
			return this;
		}

		public Builder keyBoard(String keyBoard) {
			this.keyBoard = keyBoard;
			return this;
		}

		public Builder mouse(String mouse) {
			this.mouse = mouse;
			return this;
		}

		public Computer build() {
			return new Computer(this);
		}
	}

	public Computer(Builder builder) {
		this.CPU = builder.CPU;
		this.memory = builder.memory;
		this.hardDisk = builder.hardDisk;
		this.keyBoard = builder.keyBoard;
		this.mouse = builder.mouse;
	}

	/**
	 * {@inheritDoc}   
	 */
	@Override
	public String toString() {
		return "Computer [CPU=" + CPU + ", memory=" + memory + ", hardDisk=" + hardDisk + ", keyBoard=" + keyBoard
				+ ", mouse=" + mouse + "]";
	}

	public static void main(String[] args) {
		Computer alienward = new Computer.Builder("i7", "16G").hardDisk("固态").keyBoard("酷冷至尊").mouse("罗技").build();
		System.out.println(alienward);
	}
}
