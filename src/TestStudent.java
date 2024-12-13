import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestStudent {

	public static void main(String[] args) {
		Student ranjith = new Student("Ranjith","15CS079",21,7);
		Student sihi = new Student("Sihi","23CS079",18,9);
		
		List<Student> studentList = new ArrayList<Student>();
		studentList.add(ranjith);
		studentList.add(sihi);
		for(Student s : studentList)
		{
			System.out.println(s);
		}
		System.out.println("Students with CGPA is greater than or equal to 9");
		studentList.stream().
		filter(e->e.getMarks()>=9).
		forEach(e->System.out.println(e.getName()+" : "+e.getMarks()));
		
	}

}
