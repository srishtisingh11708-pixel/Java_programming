package in.ggpa;

public class Main {

	public static void main(String[] args) {
		Student st=new Student();
		st.intro();
		Student st1=new Student("krishna",21);
		st1.intro();
		Student st2=new Student();
		st2.intro();
	}
		/* st.initialize("srishti",21);
		if(st.isInitialized) {
			st.intro();
			Student st1=new Student();
			st1.intro();
			st1.initialize("krishna", 15);
			st1=st;
			Student st2=st;
			st2.intro();
			st1.initialize("shiva", 25);
			st=st1;
			st2.age=20;
			st1=st2;
			st1.intro();*/
			

		/*System.out.println("===creating 2nd object");
		Student st1=new Student();
		 st1.initialize("Riya",22);
		if(st1.isInitialized) {
			st1.intro();
	}
      Student st3=st;
       st3.intro();
       st3.age=45;
       */
}