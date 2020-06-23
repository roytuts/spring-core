package com.roytuts.spring.postconstruct.predestroy.service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.roytuts.spring.postconstruct.predestroy.dao.FlagDao;

@Service
public class FlagService {

	@Autowired
	private FlagDao flagDao;

	public void doFlagWork() {
		System.out.println("Do Flag Work");
	}

	@PostConstruct // do some initialization work
	public void selectFlag() {
		System.out.println("@PostConstruct");
		String val = flagDao.getFlag();
		setDbFlag(val);
	}

	@PreDestroy // do some destruction work (like releasing pooled connections)
	public void cleanFlag() {
		System.out.println("@PreDestroy");
		System.setProperty("dbFlag", "false");
		System.out.println("DB Flag: " + System.getProperty("dbFlag"));
	}

	private void setDbFlag(String dbFlag) {
		System.setProperty("dbFlag", dbFlag);
		System.out.println("DB Flag: " + System.getProperty("dbFlag"));
	}

}
