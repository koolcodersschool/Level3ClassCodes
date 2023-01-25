package day6;

public class School {
	
	public static void main(String[] args) {
		System.out.println("============== PERSON ==============");
		Person person = new Person();
		person.name = "Senan";
		person.age = 14;
		person.birthYear = 2008;
		person.walk();
		person.eat();
		
		System.out.println("================== STUDENT ===============");
		Student student = new Student();
		student.name = "Yusif";
		student.age = 13;
		student.birthYear = 2009;
		student.course = "Java Level 3";
		student.walk();
		student.eat();
		student.study();
		
		System.out.println("=================== TEACHER =================");
		Teacher teacher = new Teacher();
		teacher.name = "Nadir";
		teacher.age = 39;
		teacher.birthYear = 1983;
		teacher.jobTitle = "Java Level 3";
		teacher.walk();
		teacher.eat();
		teacher.work();
		
	}

}
