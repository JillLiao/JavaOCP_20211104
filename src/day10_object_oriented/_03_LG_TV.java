package day10_object_oriented;

public class _03_LG_TV implements _01_TV{

	private int volumn;
	private boolean power;
	private int channel;
	
	@Override
	public String getResolution() {
		return "8K";
	}

	@Override
	public void setVolume(int vol) {
		if(power) {
			volumn += (vol * 2);
		}
	}

	@Override
	public int getVolume() {
		return volumn;
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
