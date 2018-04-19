package elso;

import com.sun.webkit.ThemeClient;

public class Number {

	double threshold=0.001;
	private double realNum;
	public Number(double realNum) {
		super();
		this.realNum = realNum;
	}
	


	public boolean isInThreshold(double num) {
		if (Math.abs(realNum-num)<threshold) {
			return true;
		}
		else return false;
	}

	public double getRealNum() {
		return realNum;
	}

	public void setRealNum(double realNum) {
		this.realNum = realNum;
	}
	
}
