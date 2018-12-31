import java.util.Random;
import java.util.Scanner;
public  class GussNumber2{
    private final int value;

	public  GussNumber2(){

       Random random=new Random();
	   this.value=random.nextInt(100);
	}
	public void play(){
		
		System.out.println("欢迎进入猜数字游戏");
		Scanner scanner=new Scanner(System.in);
		int count=0;
		while(true){
			count++;
			System.out.println("请您输入猜的数字");
			
			int guessnumber=scanner.nextInt();
			if(guessnumber>this.value){
				
				System.out.println("您猜的数字太大了");
			}else if(guessnumber<this.value){
				
				System.out.println("您猜的数字太小了");
			}else{
				System.out.println("猜对了");
				break;
			}
			
		}
		System.out.println("您一共猜了"+count+"次");
		
	}
	
	public static void main(String[] args){
	    GussNumber2  gussnumber2=new GussNumber2();
		gussnumber2.play();
	    
	}
	
}