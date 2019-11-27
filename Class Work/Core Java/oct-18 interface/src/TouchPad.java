
public class TouchPad implements Mouse, Keyboard {

	@Override
	public void press() {
System.out.println("Touchpad press()");
	}

	@Override
	public void click() {
System.out.println("Touchpad click()");
	}

}
