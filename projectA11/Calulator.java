package projectA11;

public class Calulator {
        
	void powerOn(){
		System.out.println("전월을 켭니다");
	}
	void powerOff() {
		System.out.println("전월을 끕니다.");
	}
	int plus(int x,int y) {
		int result =x+y;
		return result;
	}
	double divide(int x,int y) {
		double result =(double)x/(double)y;
		return result;
	}
	
}
