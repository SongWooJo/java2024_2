package Homework5;

public interface Service {
	private void log() {
		System.out.println("처리가 시작됩니다.");
	}
	
	default void process() {
		this.log();
	}
}
