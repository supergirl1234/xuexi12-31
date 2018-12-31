public class lianxi4{
	 private static String country="中国";
     private String name;
	 private int age;
	 public lianxi4(String name,int age){
		 this.name=name;
		 this.age=age;
		 
		 
	 }
	 public void setName(String name){
		 this.name=name;
		 
	 }
	  public static void setCountry(String country){
		country=country;//不能用this
		 
	 }
  public static void main(String[] args){
	  lianxi4 person=new lianxi4("小李",10);
	  person.country="韩国";
	  System.out.println(person.name+person.age+person.country);
	  
  }
}