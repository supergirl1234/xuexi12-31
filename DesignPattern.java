public class DesignPattern{
    public static void main(String[] args){
		Client client = new Client();
		
		/*client.buyComputer(new MacbookProComputer());
		client.buyComputer(new SurfacebookProComputer());*/
		//客户端不需要知道计算机接口的具体实现类
		client.buyComputer(SimpleComputerFactory.getInstance("mac"));
		
		
	   //1.通过参数
	   if(args.length>0){
		   String type=args[0];
		   Computer computer=SimpleComputerFactory.getInstance(type);
		   if(computer==null){
			   
			System.out.println("计算机");
		   }else{
			client.buyComputer(computer);
			   
		   }
	   }else{
		   System.out.println("请输入计算机类型");
		   
	   }
	   //2.通过读取客户端用户输入数据（控制台）
	    Scanner scanner = new Scanner(System.in);
		System.out.println("请输入您想要的电脑型号...，按 q 退出");
		while(1){
			String type = scanner.nextLine();
			if (type.equals("q")){
				
				break;
			}
			
			Computer computer = ComputerFactory.getInstance(type);
			client.buyComputer(computer);
		}
	 }
}
class Client {
	public void buyComputer(Computer computer) {
		computer.printComputer();
	}
}
interface Computer {
	void printComputer();
}
class SimpleComputerFactory{
	
	pulbic static Computer getInstance(String type){
		Computer computer=null;
		switch(type){
			case "mac":
			    computer=new MacbookProComputer;
				break;
			case "surface":
			    computer=new SurfacebookProComputer;
				break;
			case "alieware":
			    computer=new AliewarebookProComputer;
				break;
			default:
				return computer;
			
		}
		
	}
}
class MacbookProComputer implements Computer {
	public void printComputer() {
		System.out.println("This is a MacbookPro");
	}
}
class SurfacebookComputer implements Computer {
	public void printComputer() {
		System.out.println("This is a Surfacebook");
	}
}