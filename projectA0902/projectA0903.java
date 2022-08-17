package projectA0902;

public class projectA0903 {

	public static void main(String[] args) {
		 Car ca = new Car();
		 
		 System.out.println("제작회사:"+ca.company);
		 System.out.println("모델명:"+ca.model);
		 System.out.println("색상:"+ca.color);
		 System.out.println("최고속도:"+ca.Speedmax);
		 System.out.println("속도:"+ca.Speed);
		 
		  ca.Speed=60;
		  System.out.println("현재속도:"+ca.Speed);

	}

}
