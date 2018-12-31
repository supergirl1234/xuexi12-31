public class Car{
     String brand;
	 String color;
	 String carnum;
	 public  Car(String brand,String color,String carnum){
		  this.brand=brand;
		  this.color=color;
		  this.carnum=carnum;
		 
	 } 
	 
	 String carInfo(){
		 
		 return "车品"+brand+"车身颜色为"+color+"车牌号为"+carnum;
		 
	 }
	 String getBrand(){
		 return brand;
		 
	 }
	 String getcolor(){
		 return color;
		 
	 }
	 void Carnum(String carnum){
		 
		 this.carnum=carnum;
	 }
	 
	 public void run(){
		     
		    System.out.println("在高速上行驶");
		 
	 }
	 public static void print(String message){
		 System.out.println(message);
		 
		 
	 }
	 public static void main(String[] args){
		 Car car1=new Car("日本","red","939321");
		car1.carInfo();
		car1.setCarnum("123456");
		System.out.println(car1.carInfo());
		 
	 }
	 

}  