
public class Cow {
Cow(){
	System.out.println("C1");
}
Cow(int i){
	this(2.4);
	System.out.println("C2");
}
Cow(double r){
	this();
	System.out.println("C3");
}
}
