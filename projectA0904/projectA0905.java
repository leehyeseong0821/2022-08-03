package projectA0904;

public class projectA0905 {

	public static void main(String[] args) {
		
		Circle pizza;
		
		pizza = new Circle();
		pizza.radius=10; //반지름 10
		pizza.name="불고기피자";//피자이름
		double area=pizza.getArea();//피자 면적
		
		System.out.println(pizza.name+"의 면적은"+area); 
		
		Circle donut = new Circle();
	    donut.radius=2;
	    donut.name="던킨도너츠";
	    area=donut.getArea(); //위에 더블을 줬기때문에 빼야함
	    System.out.println(donut.name+"의 면적은"+area);

	}

}
