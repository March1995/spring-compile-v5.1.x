package com.tuling.testAutowired.autowired;


public class TulingService {

	private TulingDao tulingDao;

	public TulingDao getTulingDao() {
		return tulingDao;
	}

	public void setTulingDao(TulingDao tulingDao) {
		this.tulingDao = tulingDao;
	}

	@Override
	public String toString() {
		return "TulingService{" +
				"tulingDao=" + tulingDao +
				'}';
	}


}
