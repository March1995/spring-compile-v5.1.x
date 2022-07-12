package com.tuling.testAutowired.autowired;


public class TulingDao {

	private int flag = 1;

	public int getFlag() {
		return flag;
	}

	public void setFlag(int flag) {
		this.flag = flag;
	}

	@Override
	public String toString() {
		return "TulingDao{" +
				"flag=" + flag +
				'}';
	}
}
