package in.ggpa;

public class Main2{

	public static void main(String[] args) {
		Student2 st=new Student2();
		st.intro();
		Student2 st1=new Student2("krishna",21);
		st1.intro();
		Student2 st2=new Student2();
		st2.intro();
		System.out.println(Student2.collegeName);
	}
}