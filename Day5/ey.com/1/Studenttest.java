package ey.com;

public class Studenttest {
	public static void main(String[] args) {
		Studentservice ss= new Studentservice();
		
		
		Address a1=new Address("thrissur");
		Student s1=new Student("Anandha","krishnan",a1);
		
		Address a2=new Address("thrissur");
		Student s2=new Student("Anandha","krishnan",a2);
		
		System.out.println(ss.addProduct(s1));
		System.out.println(ss.addProduct(s2));

		ss.listStudents();
		
		System.out.println(ss.isvalidStudent(s1, s2));
		
	}

}
