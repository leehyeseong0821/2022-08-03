package projectA11;

public class projectA0912 {

	public static void main(String[] args) {
		  
		Calulator myCalc=new Calulator();
		myCalc.powerOn();
		
		int result1= myCalc.plus(5, 6);
		System.out.println(result1);
		
		byte x=10;
		byte y=4;
		double result2= myCalc.divide(x, y);
		
		System.out.println(result2);
		myCalc.powerOff();

	}

}
