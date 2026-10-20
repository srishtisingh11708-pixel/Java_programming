package in.ggpa;

public class Student {
   String name;
   int age;
   boolean isInitialized=false;
   
   
   public Student() {
	   System.out.println("=====No Arugument======");
	   name ="Ram";
	   age=10;
	   }
   public Student(String stName ,int stAge) {
	   System.out.println("=====2 Arugument========");
	   name =stName;
	   age=stAge;
	   }

   public void intro() {
	   System.out.println("my name is "+name);
	   System.out.println("my age is "+age);
	   
   }
   public void  initialize(String stName ,int stAge) {
	   name=stName;
	   age=stAge;
	   isInitialized=true;
   }
}
