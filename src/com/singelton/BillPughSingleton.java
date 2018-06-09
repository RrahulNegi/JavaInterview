package com.singelton;

/*
 * private inner static class contaims the instance of singleton.
 * So when singelton class is loaded SingeltonHelper.class is not loaded in memory
 * Its load only when someone call getInstance()
 */

public class BillPughSingleton {
	private BillPughSingleton() {
	}

	private static class SingeltonHelper {
		private static final BillPughSingleton instance = new BillPughSingleton();
	}

	public static BillPughSingleton getInstance() {
		return SingeltonHelper.instance;
	}
}
