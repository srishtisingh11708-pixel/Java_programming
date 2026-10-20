package in.ggpa;

public class Student2{
   String name;
   int age;
   static String collegeName="GGPA";
   boolean isInitialized=false;
   
   
   public Student2() {
	   System.out.println("=====No Arugument======");
	   name ="Ram";
	   age=10;
	   }
   public Student2(String stName ,int stAge) {
	   System.out.println("=====2 Arugument========");
	   name =stName;
	   age=stAge;
	   }

   public void intro() {
	   System.out.println("my name is "+name);
	   System.out.println("my age is "+age);
	   System.out.println("my college is "+collegeName);
	   
   }
   public void  initialize(String stName ,int stAge) {
	   name=stName;
	   age=stAge;
	   isInitialized=true;
   }
}
