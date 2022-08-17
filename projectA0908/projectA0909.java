package projectA0908;

public class projectA0909 {

	public static void main(String[] args) {
		
		Car car1=new Car();
		System.out.println(car1.company);
		System.out.println();
		
		Car car2=new Car("제네시스");
		System.out.println(car2.model);
		
		Car car3=new Car("제네시스","검은색");
		System.out.println(car3.color);
		
		Car car4=new Car("제네시스","검은색",200);
		System.out.println(car4.maxSpeed);
		
		Car car5=new Car("그랜저","빨간색",300);
		System.out.println(car5.company);
		System.out.println(car5.model);
		System.out.println(car5.color);
		System.out.println(car5.maxSpeed);
		

	}

}
