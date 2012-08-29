package org.pachnanda.katta.fizzbuzzbang;

public class CounterFactory {

	public static Counter buildCounter() {
		return new Counter();
	}

	public static Counter buildCounterWithTenCount() {
		Counter counter = new Counter();
		counter.updateCount(10);
		return counter;
	}

}
