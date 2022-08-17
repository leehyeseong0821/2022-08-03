package projectA0909;

public class Car {
      
	
	String company="기아자동차";
	String model;
	String color;
	int maxspeed;
	
	Car(){
		
	}
	Car(String model){
		this(model,null,0);
	}
	Car(String model,String color){
		this(model,color,0);
	}
	
	Car(String model,String color,int maxspeed){
		this.model=model;
		this.color=color;
		this.maxspeed=maxspeed;
		
	}
	
	
} 
