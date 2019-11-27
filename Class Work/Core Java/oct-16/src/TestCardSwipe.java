
public class TestCardSwipe {
public static void main(String[] args) {
	CardSwipe c1=new CardSwipe();
	CardSwipe c2=new CardSwipe();
	CardSwipe c3=new CardSwipe();
	c1.swipe();
	c1.swipe();
	c2.swipe();
	c3.swipe();
	c3.swipe();
	c1.swipe();
	System.out.println(CardSwipe.orgcount);
	
}
}
