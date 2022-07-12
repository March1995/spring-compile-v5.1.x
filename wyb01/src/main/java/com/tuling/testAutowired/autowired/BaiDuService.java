package com.tuling.testAutowired.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BaiDuService {

	//@Qualifier(value = "tulingDao5")
	@Autowired
	private TulingDao tulingDao2;

	@Override
	public String toString() {
		return "BaiDuService{" +
				"tulingDao=" + tulingDao2 +
				'}';
	}

	public TulingDao getTulingDao() {
		return tulingDao2;
	}

	public void setTulingDao(TulingDao tulingDao2) {
		this.tulingDao2 = tulingDao2;
	}
}
