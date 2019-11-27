
public class PVR {
	int seats=5;
	
	synchronized public void confirm() {
			
		
		seats=seats-1;
		System.out.println(seats);
	}
}
