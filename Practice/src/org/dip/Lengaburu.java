package org.dip;

import java.util.Scanner;

public class Lengaburu {
	float per;
	static int orbitspeed;
	int finalCreater;
	static String vehicle;
	int speed;
	static float time;
	class Car{
		public Car() {			
			if(orbitspeed<20)
				speed=orbitspeed;
			else speed=20;			
		}
		public float calculate(float orbit) {
			float cal= (float) ((orbit/speed) + ( finalCreater*.05));
			return cal;
		}
	}
	class Tuk{
		public Tuk() {			
			if(orbitspeed<12)
				speed=orbitspeed;
			else speed=12;			
		}
		public float calculate(float orbit) {
			float cal= (float) ((orbit/speed) + ( finalCreater*.0167));
			return cal;
		}
	}
	class Bike{
		public Bike() {			
			if(orbitspeed<10)
				speed=orbitspeed;
			else speed=10;			
		}
		public float calculate(float orbit) {
			float cal= (float) ((orbit/speed) + ( finalCreater* .33));
			return cal;
		}
	}
	public void weather(String weather,float orbit,int creaters) {
		switch(weather) {
		case "sunny":
			per=.90f;
			 finalCreater= (int) (creaters*per);
			 vehicle=new Car().calculate(orbit)<new Bike().calculate(orbit)?(new Car().calculate(orbit)<new Tuk().calculate(orbit)?"car":"tuk"):"bike";	
			 time= Math.min(new Car().calculate(orbit),new Tuk().calculate(orbit));
			 time=Math.min(time, new Bike().calculate(orbit));
			 break;
		case "rainy":
			per=.80f;
			 finalCreater= (int) (creaters*per);
			 vehicle=new Car().calculate(orbit)<new Tuk().calculate(orbit)?"car":"bike";
			 time= Math.min(new Car().calculate(orbit),new Tuk().calculate(orbit));
		     break;
		case "windy":
			 finalCreater= creaters;
			 vehicle=new Car().calculate(orbit)<new Bike().calculate(orbit)?"car":"bike";
			 time= Math.min(new Car().calculate(orbit),new Bike().calculate(orbit));
			break;			
			default:
				System.out.println("Please enter right solution");
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);        
        String weather = in.next();
        int way1= in.nextInt();
        int way2=in.nextInt();
        orbitspeed=way1;
        new Lengaburu().weather(weather, 18, 20);
        String st1=vehicle;
        Float time1= time;
        
        orbitspeed=way2;
        new Lengaburu().weather(weather, 20, 10);
        String st2=vehicle;
        Float time2= time;
        if(time1<time2) {
        	System.out.println("orbit1" + st1);
        }
        else System.out.println("orbit2"+st2);
        
        in.close();
        
	}

}
