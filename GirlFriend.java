//对现实生活进行抽象
public class GirlFriend{
	//要求-->特点-->属性
	//int[]-->引用类型
	private String gender;//null
	private int age;//0
	private String name;//null
	private int height;//0
	private int weight;//0
	
	//能够做的事情-->行为
	public void movie(){
		System.out.println("看电影");
		
	}
	public void fire(){
		System.out.println("你人挺好");
		
	}
	public static void main(String[] args){
		//女，夏雨荷，24，170.60kg==>具体
		//对象
		GirlFriend  girl=new GirlFriend();
		girl.gender="女";
		girl.age=24;
		girl.name="夏雨荷";
		girl.height=170;
		girl.weight=60;
		girl.movie();
		girl.fire();
	}
	
}