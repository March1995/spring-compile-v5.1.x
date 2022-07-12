package com.tuling.circularDependencies;


//@Component
public class InstanceB {


	private InstanceA instanceA;

	public InstanceA getInstanceA() {
		return instanceA;
	}


	public void setInstanceA(InstanceA instanceA) {
		this.instanceA = instanceA;
	}


	public InstanceB(InstanceA instanceA) {
		this.instanceA = instanceA;
	}

	public InstanceB() {
		System.out.println("InstanceB实例化");
	}
}
