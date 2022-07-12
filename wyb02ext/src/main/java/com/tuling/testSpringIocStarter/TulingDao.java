package com.tuling.testSpringIocStarter;

import org.springframework.stereotype.Repository;

@Repository
//@Scope(value = "prototype")
public class TulingDao {

	private TulingDataSource tulingDataSource;


	public TulingDao(TulingDataSource tulingDataSource) {
		this.tulingDataSource = tulingDataSource;
		System.out.println("本类的DataSource" + this.tulingDataSource);
	}

}
