
public class Test_PVR {

	public static void main(String[] args) {
		PVR pvr=new PVR();
		PVR_User user1=new PVR_User(pvr);
		user1.start();
		PVR_User user2=new PVR_User(pvr);
		user2.start();

	}

}
