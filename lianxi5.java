public class lianxi5{
    //构造方法
	public lianxi5(){
		System.out.println("lianxi5!构造方法");
	}
	//非静态代码块(构造块)
	{
		System.out.println("i'm A class.主类非静态代码块");
	}
	//静态代码块
	static{
		System.out.println("static A 主类静态代码块");
	}
	public static void main(String[] args){
	      new lianxi5();
	      new dog();
		  System.out.println();
		  lianxi5 person1=new lianxi5();
		  lianxi5 person2=new lianxi5();
	}
	//优先级:静态代码块>非静态代码块（构造块）>构造方法


}
class dog{
    //构造方法
	public dog(){
		System.out.println("lianxi5!构造方法");
	}
	//非静态代码块
	{
		System.out.println("i'm A class.主类非静态代码块");
	}
	static {
		
		System.out.println("非主类静态代码块");
	}
}