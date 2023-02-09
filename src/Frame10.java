
public class Frame10 implements IFrame{
	
	private int throw1;
	private int throw2;
	private int throw3;
	
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
	public int getThrow3() {
		return throw3;
	}
	public void setThrow3(int throw3) {
		this.throw3 = throw3;;
	}
	public int getPoints() {
		return throw1 + throw2 + throw3;
	}

}
