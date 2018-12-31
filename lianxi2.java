public class lianxi2{
	private String name;
	private int age;
	public  lianxi2(){
		
		
	}
	public  lianxi2(String name,int age){
		this.name=name;
		this.age=age;
		
	}
	public static void main(String[] args){
		Lianxi1 person1=new Lianxi1("Jack",21);
		//person1.setName("Tom");
		System.out.println(person1.getName());
	
		//System.out.println(person1.getName()+" "+person1.getAge());
		lianxi2 per=new lianxi2();
		lianxi2 per2=new lianxi2("姐姐",13);
		per.name="哥哥";
		System.out.println(per.name);
		System.out.println(per2.name+per2.age);
		
	}

}