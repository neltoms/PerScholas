package school;

public class Main {

	public static void main(String[] args) {
		
		Person nel = new Person("Nel", "628 151st Street");
		Student momo = new Student("Mohamed", "3434 34th Street");
		
		
		momo.addCourseGrade("Math", 90);
		momo.printGrades();
		
		System.out.println(momo);
	
	}

}
