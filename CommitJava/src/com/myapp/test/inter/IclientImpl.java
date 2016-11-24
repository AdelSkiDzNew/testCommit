package com.myapp.test.inter;

import java.util.List;

public class IclientImpl implements IClient {

	@Override
	public void add(int x) {
		System.out.println(x);
		System.out.println("changement02");
		
	}

	@Override
	public void add2(String x) {
		System.out.println(x+x);
		
	}

	@Override
	public List<Integer> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
