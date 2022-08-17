package projectA10;

public class projectA0911 {

	public static void main(String[] args) {
		 
        computer myCom = new computer();
        
		int[] intValue1 = {1,2,3,4,5};
		int result1 = myCom.sum1(intValue1);
		System.out.println("result:"+result1);
		
		int result2 = myCom.sum1(new int[] {1,2,3,4,5,6,7,8,9,10});
		System.out.println("result:"+result2);
		
		int result3 = myCom.sum2(1,2,3,4,5);
		System.out.println("result:"+result3);
		
		int result4 = myCom.sum2(1,2,3,4,5,6,7,8,9,10);
		System.out.println("result:"+result4);
	}

}

