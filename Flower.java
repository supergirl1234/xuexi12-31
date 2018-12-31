public class Flower{

    public static void main(String[] args){
		RealSubject realsubject=new RealSubject("张三","李四");
		ProxySubject proxysubject=new ProxySubject(realsubject);
		
	    proxysubject.SendFlower();
	}
}
interface Subject{
	
	public void SendFlower();
}
class RealSubject implements Subject{
	private String BoyFriend;
	private String GirlFriend;
	public RealSubject(String BoyFriend,String GirlFriend){
		
		this.BoyFriend=BoyFriend;
		this.GirlFriend=GirlFriend;
	}
	public void SendFlower(){
		
		System.out.println(this.BoyFriend+"送花给女朋友"+this.GirlFriend);
	}
}
class ProxySubject implements Subject{
	
	
	private final Subject target;
	public ProxySubject(Subject target){
		this.target=target;
		
	}
	
	public void SendFlower(){
		System.out.println("给快递员打电话");
		
		this.target.SendFlower();
		System.out.println("女朋友签收");
	}
}