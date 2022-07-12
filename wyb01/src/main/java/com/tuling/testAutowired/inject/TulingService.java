package com.tuling.testAutowired.inject;

import org.springframework.stereotype.Service;

import javax.inject.Inject;

@Service
public class TulingService {

	@Inject
	private TulingDao tulingDao;

	@Override
	public String toString() {
		return "TulingService{" +
				"tulingDao=" + tulingDao +
				'}';
	}

	public TulingDao getTulingDao2() {
		return tulingDao;
	}

	public void setTulingDao(TulingDao tulingDao) {
		this.tulingDao = tulingDao;
	}
}
