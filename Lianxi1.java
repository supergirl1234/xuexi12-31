public class  Lianxi1{
	
	private String name;
	private int age;
	private String secret;
	private String gender;
	
	public Lianxi1(){
		
		
	}
	public Lianxi1(String name,int age){
		this.name=name;
		this.age=age;
		
		
	}
	public Lianxi1(String name,int age,String secret){
		this(name,age);
		this.secret=secret;
		
	}
	public Lianxi1(String name,int age,String secret,String gender){
		this(name,age,secret);
		this.gender=gender;
		
	}
	public void setName(String name){
		
		this.name=name;
	}
	public String getName(){
		
		return name;
	}
	public void setAge(int age){
		
		this.age=age;
	}
	public int getAge(){
		
		return age;
	}
	public static void main(String[] args){
		
		Lianxi1 person=new Lianxi1("李四",12);
		Lianxi1 personp=new Lianxi1("李四",12,"秘密");
		person.name="张三";
        person.age=20;
        System.out.println("名字为："+person.name+"年龄为"+person.age);		
	    System.out.println(personp.name=" "+personp.age+""+personp.secret);
	}
}