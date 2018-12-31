public class lianxi5{
    //构造方法
	public lianxi5(){
		System.out.println("lianxi5!父类构造方法");
	}
	//非静态代码块
	{
		System.out.println("i'm A class.父类非静态代码块");
	}
	//静态代码块
	static{
		System.out.println("static A 父类静态代码块");
	}
	public static void main(String[] args){
	      new lianxi5;
	
	}


}