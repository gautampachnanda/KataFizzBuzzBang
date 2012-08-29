package org.pachnanda.katta.fizzbuzzbang;

import static org.junit.Assert.*;

import org.junit.Test;
import org.pachnanda.katta.fizzbuzzbang.Counter;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;


public class TestFizz {

	@Test
	public void verifyPlaysFizzWhenThreeOrContainsThree() {
		Counter counter = CounterFactory.buildCounter();
		counter.updateCount(3);
		assertThat("Correct sound played is ",counter.play(), equalTo("Fizz"));
	}
	
	@Test
	public void verifyPlaysOnqWhenNumberIsOne() {
		Counter counter = new Counter();
		counter.updateCount(1);
		assertThat("Correct sound played is ",counter.play(), equalTo("1"));
	}	

}
