package projectA0901;

public class projectA0902 {

	public static void main(String[] args) {
		 Student student =new Student();
		 
		 student.setName("이혜성");
		 student.setEng(100);
		 student.setKor(100);
         student.setMath(100);
         
         student.studentInfo();
         System.out.println();
         Student std = new Student();
         std.setName("김지영");
         std.setEng(100);
         std.setKor(100);
         std.setMath(100);
         std.studentInfo();
         System.out.println();
         Student std1=new Student();
         std1.setName("노길모");
         std1.setEng(80);
         std1.setKor(80);
         std1.setMath(80);
         std1.studentInfo(); 
         
         System.out.println("국어평균:"+(student.getKor()+std.getKor()+std1.getKor())/3);
		
		 
		 

	}

}
