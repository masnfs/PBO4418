public class TestSimpleCircle{
    // Main
    public static void main(String[] args){
		SimpleCircle mycircle1 = new SimpleCircle(5);
        System.out.println("Circle 1 with Radius " + mycircle1.radius + " Has Area of " + mycircle1.getCircleArea());
		
		SimpleCircle mycircle2 = new SimpleCircle(10);
        System.out.println("Circle 2 with Radius " + mycircle2.radius + " Has Area of " + mycircle2.getCircleArea());
		
		SimpleCircle mycircle3 = new SimpleCircle(200);
        System.out.println("Circle 3 with Radius " + mycircle3.radius + " Has Area of " + mycircle3.getCircleArea());
		
		mycircle1.setCircleRadius(10);
		mycircle2.setCircleRadius(100);
		
		String ss = Double.toString(mycircle1.radius)+ " " + Double.toString(mycircle2.radius);
		System.out.println(ss);
		
		mycircle1.resetCircleRadius();
        System.out.println("Circle 1 with Radius " + mycircle1.radius + " Has Area of " + mycircle1.getCircleArea());
		
    }
};

class SimpleCircle{
	double radius = 1;
	
	SimpleCircle(double newRadius){
		radius = newRadius;
	}
	
	double getCircleArea(){
		return radius * radius * Math.PI;
	}
	
	double setCircleRadius(double newRadius){
		return radius = newRadius;
	}
	
	void resetCircleRadius(){
		radius = 0;
	}
};
