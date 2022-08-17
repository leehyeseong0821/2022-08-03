package projectA0909;

public class projectA0910 {

	public static void main(String[] args) {
		   
		Car car1=new Car();
		System.out.println(car1.company);
		
		
		Car car2=new Car("k5");
		System.out.println(car2.model);
		
		Car car3=new Car("k5","검은색");
		System.out.println(car3.color);
		
		Car car4=new Car("k5","검은색",300);
		System.out.println(car4.maxspeed); 
		car4.maxspeed=500;
		System.out.println("현재속도:"+car4.maxspeed);
		

	}

}
