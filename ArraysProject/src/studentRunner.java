
public class studentRunner {

	public static void main(String[] args) {
		
		int[] marks= {100,99,98,0,89,77,78};
		Student student=new Student("Rani",marks);
		
		int number=student .getNumberOfMarks();
		System.out.println("Number of marks is : " +number);
		
		String name= student.getName();
		System.out.println("Name of the student : " +name);
		
		

	}

	

}
