package Week08_3;

public class Audio implements RemoteControl{
	private int Volume;
	
	public void turnOn() {
		System.out.println("오디오를 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("오디오를 끕니다.");
	}
	
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {
			this.Volume = RemoteControl.MAX_VOLUME;
		} else if(volume<RemoteControl.MIN_VOLUME) {
			this.Volume = RemoteControl.MIN_VOLUME;
		} else {
			this.Volume = volume;
		}
		System.out.println("현재 오디오 볼륨: " + this.Volume);
	}
}
