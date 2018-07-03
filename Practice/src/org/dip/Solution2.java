package org.dip;

import java.util.Scanner;

public class Solution2 {
	float per;
	static int orbitspeed;
	static int orbitspeed2;
	int finalCreater;
	static String vehicle;
	int speed;
	static float time,time1;
	class Car{
		public Car() {			
			if(orbitspeed<20)
				speed=orbitspeed;
			else speed=20;			
		}
		public float calculate(float orbit) {
			float cal= (float) ((orbit/speed) + ( finalCreater*.05));
			
			if(orbitspeed2<20)
				speed=orbitspeed2;
			else speed=20;
			
			cal=cal+(15.0f/speed);
			
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
			if(orbitspeed2<12)
				speed=orbitspeed2;
			else speed=12;
			
			cal=cal+(15.0f/speed);
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
			float cal= (float) ((orbit/speed) + ( finalCreater* .0334));
			if(orbitspeed2<10)
				speed=orbitspeed2;
			else speed=10;			
			cal=cal+(15.0f/speed);
			return cal;
		}
	}
	public void weather(String weather,float orbit,int creaters) {
		switch(weather) {
		case "sunny":
			per=.90f;
			 finalCreater= (int) (creaters*per);
			 vehicle=new Car().calculate(orbit)<new Bike().calculate(orbit)?(new Car().calculate(orbit)<new Tuk().calculate(orbit)?"car":"tuk"):"bike";	
			 time1= Math.min(new Car().calculate(orbit),new Tuk().calculate(orbit));
			 
			 time=Math.min(time1, new Bike().calculate(orbit));
			 if(time1>time)
				 vehicle="Bike";				 
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
        int way3= in.nextInt();
        orbitspeed2=in.nextInt();
        orbitspeed=way1;
        new Solution2().weather(weather, 18, 38);
        String st1=vehicle;
        Float time1= time;        
        orbitspeed=way2;
        new Solution2().weather(weather, 20, 28);
        String st2=vehicle;
        Float time2= time;
        orbitspeed=way3;
        new Solution2().weather(weather, 30, 33);
        String st3=vehicle;
        Float time3= time;
        if(time1<time2 && time1<time3) {
        	System.out.println("Hallitharam via Orbit1 and RK Puram via Orbit4 " + st1);
        }else if(time2<time3)
        	System.out.println("Hallitharam via Orbit2 and RK Puram via Orbit4 " + st2);
        else System.out.println("RK Puram via Orbit3 and Hallitharam via Orbit4 "+st3);        
        in.close();
        
	}

}
