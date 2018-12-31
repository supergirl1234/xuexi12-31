public class  lianxi3{
     private static String country="中国";
	 private String name;
	 private int age;
	 public lianxi3(String name,int age){
		 this.name=name;
		 this.age=age;
		 
		 
	 }
    public static void main(String[] args){
		lianxi3 person=new lianxi3("小明",12);
		lianxi3 person2=person;
		person2.name="小红";
		person2.country="韩国";
		person2=null;
		System.out.println(person.name+person.age+person.country);
		System.out.println(person2.name+person2.age+person2.country);
	}
}