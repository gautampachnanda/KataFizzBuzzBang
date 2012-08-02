package org.pachnanda.katta.fizzbuzzbang;

import static org.junit.Assert.*;

import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class TestFizzPlayer implements SoundPlayer{

    private SoundPlayer soundPlayer;

	@Test
	public void givenWhenPlayIsCalledFizzIsReturned() {
		this.soundPlayer=new FizzPlayer();
		assertThat("Player sound is ", this.soundPlayer.play(0), equalTo("Fizz"));
	}

	@Override
	public String play(int count) {
		return null;
	}

}
