package com.tuling.testCreateBeanInst;

public class TulingAspect {

	private TulingLog tulingLog;

	public TulingLog getTulingLog() {
		return tulingLog;
	}

	public void setTulingLog(TulingLog tulingLog) {
		this.tulingLog = tulingLog;
	}

	@Override
	public String toString() {
		return "TulingAspect{" +
				"tulingLog=" + tulingLog +
				'}';
	}
}
