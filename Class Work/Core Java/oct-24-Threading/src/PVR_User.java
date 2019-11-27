
public class PVR_User extends Thread{
PVR pvr;

public PVR_User(PVR ref) {
	pvr = ref;
}
 
public void run() {
	pvr.confirm();
}

}
