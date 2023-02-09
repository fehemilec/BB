import java.util.ArrayList;

public class User {

	private String name;
	private ArrayList<IFrame> frames;
	
	public User(String name) {
		this.name = name;
		
		Frame10 frame10 = new Frame10();
		frames = new ArrayList<IFrame>();
		
		for(int i=0;i<9;i++) {
			Frame fr = new Frame();
			frames.add(fr);
			
		}
		frames.add(frame10);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public IFrame getFrame(int num) {
		return  frames.get(num);
	}


	
	
	
	
}
