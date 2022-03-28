package day10_object_oriented;

public class _02_SonyTV implements _01_TV {
	private int volume;
	private boolean power;
	private int channel;
	
	@Override
	public String getResolution() {
		return "4K";
	}

	@Override
	public void setVolume(int vol) {
		if(power) {
			volume += vol;
		}
	}

	@Override
	public int getVolume() {
		return volume;
	}

	@Override
	public void powerOn() {
		power = true;
	}

	@Override
	public void powerOff() {
		power = false;
	}

	@Override
	public void setChannel(int no) {
		if(power) {
			channel = no;
		}
	}

	@Override
	public int getChannel() {
		return channel;
	}
}
