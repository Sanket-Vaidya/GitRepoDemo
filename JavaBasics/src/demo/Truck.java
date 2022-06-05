package demo;

import java.util.ArrayList;

public class Truck {
	private String color;
	private String engine;
	public void start() {
		System.out.println("Start the car");
	}
	
	public Truck(String colorOfCar,String typeOfEngine) {
		this.color=colorOfCar;
		this.engine=typeOfEngine;
		System.out.printf("The color of car is %s and engine type is %s.\n",this.color,this.engine);
	}
public static void main(String[] args) {
	Truck tata=new Truck("red","diesel");
	Truck mahindra=new Truck("black","CNG");
	tata.start();
	//Truck Swaraj=new Truck();
ArrayList<String> cities=new ArrayList<String>();
cities.add("London");
cities.add("newDelhi");
cities.add("Mumbai");

System.out.println(cities.get(2));
System.out.println(cities.size());
System.out.println(cities.indexOf("Mumbai"));
for(String t:cities) {
	System.out.println(t);
}
		}
}
