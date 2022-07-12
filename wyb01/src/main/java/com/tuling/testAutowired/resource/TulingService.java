package com.tuling.testAutowired.resource;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class TulingService {

	/**
	 * @resource 是不支持@Primary的
	 */
	@Resource
	private TulingDao tulingDao;

	@Override
	public String toString() {
		return "TulingService{" + "tulingDao=" + tulingDao + '}';
	}

	public TulingDao getTulingDao() {
		return tulingDao;
	}

	public void setTulingDao(TulingDao tulingDao) {
		this.tulingDao = tulingDao;
	}
}
