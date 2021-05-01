package ödev_3;

public class Main {

	public static void main(String[] args) {
		StudentManager a = new StudentManager();
		a.lastName="Asi";
		UserManager b = new UserManager();
		b.Password="2345";
		InstructorManager c = new InstructorManager();
		c.InstructorManager="Engin Demiroğ";
		
		Student student = new Student();
		student.add(a);
		student.add(b);
		student.add(c);
		
	}

}
