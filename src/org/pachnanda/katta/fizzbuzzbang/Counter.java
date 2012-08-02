package org.pachnanda.katta.fizzbuzzbang;

public class Counter{
	
	private int count;
	private SoundPlayer player;

	public void updateCount(int count){
		this.count=count;
	}
	
	public String play() {
		player = new CountPlayer();
		
		if(count==3)
			player=new FizzPlayer();
		
		return player.play(count);
	}

}
