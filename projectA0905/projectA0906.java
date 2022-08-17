package projectA0905;

import java.util.Scanner;

public class projectA0906 {

	public static void main(String[] args) {
		  
		
		Rectangle rect = new Rectangle();
		Scanner in = new Scanner(System.in);
		
		System.out.println(">>입력하세요");
		rect.width=Integer.parseInt(in.nextLine());
		rect.hieght=Integer.parseInt(in.nextLine());
		
		System.out.println("사각형의 면적은:"+rect.getArea());

	}

}
