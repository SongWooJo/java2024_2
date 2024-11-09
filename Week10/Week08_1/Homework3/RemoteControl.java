package Homework3;

public interface RemoteControl {
	public void turnOn();
	public void turnOff();
	
	default void mute() {
		System.out.println("무음 처리되었습니다.");
	}
}
