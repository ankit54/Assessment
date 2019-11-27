import java.util.Comparator;

public interface Comparator_Interface {
	Comparator<Student> comId=(o1,o2)-> o1.id-o2.id;

	Comparator<Student> comName=(o1,o2)->o1.name.compareTo(o2.name);

	Comparator<Student> comPercent=(o1,o2)-> (int )(o1.percent-o2.percent);

}
