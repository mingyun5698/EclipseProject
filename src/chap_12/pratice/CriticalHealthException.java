package chap_12.pratice;

public class CriticalHealthException extends Exception{
	public String getMessage() {
		return "운동을 시켜 건강점수를 30점 이상으로 올려야 합니다.";
	}
}
