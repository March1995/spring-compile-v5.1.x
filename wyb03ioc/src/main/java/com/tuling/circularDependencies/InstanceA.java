package com.tuling.circularDependencies;


//@Component
public class InstanceA {


	private InstanceB instanceB;

	public InstanceB getInstanceB() {
		return instanceB;
	}

	public void setInstanceB(InstanceB instanceB) {
		this.instanceB = instanceB;
	}


	public InstanceA(InstanceB instanceB) {
		this.instanceB = instanceB;
	}

	public InstanceA() {
		System.out.println("InstanceA实例化");
	}


}
