package org.pachnanda.katta.fizzbuzzbang;

public class CountPlayer implements SoundPlayer {

	@Override
	public String play(int count) {
		return ""+count;
	}

}
