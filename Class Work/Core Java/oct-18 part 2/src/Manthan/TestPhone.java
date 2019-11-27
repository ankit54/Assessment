package Manthan;

public class TestPhone {
public static void main(String[] args) {
	MI m=new MI();
	Pixel p=new Pixel();
	Iphone i=new Iphone();
	 
	Crush c=new Crush();
	c.receive(m);
	c.receive(p);
	c.receive(i);
	c.receive(null);
}
}
