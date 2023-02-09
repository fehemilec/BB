import java.util.ArrayList;

public class Game {

	private ArrayList<User> user;
	
	public void initialize() {
		
		user = new ArrayList<User>();
		User us1 = new User("John");
		User us2 = new User("Alice");
		
		user.add(us1);
		user.add(us2);
		
		
		
	}
	
	public void start() {
		
		for(int fr=0; fr<10; fr++) {
			
			for(User usr: user) {
				
				System.out.print(usr.getName()+" ");
				System.out.print(fr+" ");
				usr.getFrame(fr).setThrow1(3);
				usr.getFrame(fr).setThrow2(5);
				
				if(fr==9) {
					Frame10 fr10 = (Frame10) usr.getFrame(fr);
					fr10.setThrow3(1);
					
				}
				System.out.print(usr.getFrame(fr).getPoints()+" \n");


			}
		}
		
	}
		
	
}
