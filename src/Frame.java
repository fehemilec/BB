
public class Frame implements IFrame {

	private int throw1;
	private int throw2;
	
	
	public int getThrow1() {
		return throw1;
	}
	public void setThrow1(int throw1) {
		this.throw1 = throw1;
	}
	public int getThrow2() {
		return throw2;
	}
	public void setThrow2(int throw2) {
		this.throw2 = throw2;
	}
	public int getPoints() {
		return throw1 + throw2;
	}
	
}
