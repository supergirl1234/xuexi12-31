//1.被final修饰的类不能被继承,final修饰的方法不能被复写
//2.final能修饰类、方法、属性、变量、参数
//3.final修饰的属性要被初始化或在构造方法中初始化
//4.final修饰的属性、变量、参数、引用一旦被初始化就不能再赋值了
//5.final定义常量，一般这样定义：static final 
public class FinalTest{
   public static void main(String[] args){
	   
	   /*byte a1=10;
	   byte a2=a1;
	   System.out.println(a2);*/
	   
	  /* byte b1=1,b2=2,b3;
	   //b3=b1+b2;//此处编译不通过，因为b1+b2的结果为3是整型（int型）,需要强制转换
	   b3=(byte)(b1+b2);
	   System.out.println(b3);*/
	   
	   
	   final byte c1=1,c2=2,c3;//final修饰的属性，其类型不会变化
	   c3=c1+c2;
	   System.out.println(c3);
	   
	   
   }

}
/*final class A{
	
	
}
class B extends A{//这是错误的
	
	
}*/

/*class A{
	public final String name(){
		
		return "";
	}
	
}
class B extends A{
	public final String name(){//这是错误的
		
		return '';
	}
	
}*/
