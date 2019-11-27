
public abstract class Pen {
	int cost;
	void open() {
		System.out.println("pen open()");
	}
	void close() {
		System.out.println("pen close()");
	}
	abstract void write();
	abstract void color();
}
