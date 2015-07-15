package ejercicio6;

import java.io.Serializable;
import java.rmi.Remote;

public class Jerarquia {
	public static void main(String[] args) {
		Vehicle[] vehicles = new Vehicle[3];
		vehicles[0] = new RiverBarge();
		vehicles[1] = new SeaPlane();
		vehicles[2] = new Helicopter();
		
		Flyer[] flyers = new Flyer[2];
		flyers[0] = new SeaPlane();
		flyers[1] = new Helicopter();
		
		for (Vehicle v : vehicles) {
			v.accelerate();
			if (v instanceof Sailer) {
				((Sailer)v).dock();
				((Sailer)v).cruise();
			}
			if (v instanceof Flyer) {
				((Flyer)v).takeOff();
				((Flyer)v).fly();
				((Flyer)v).land();
			}
		}
	}
}

interface I1 {}
interface I2 {}

interface Sailer extends I1, I2 {
	void dock();
	public void cruise();
}

interface Flyer {
	void takeOff();
	void land();
	void fly();
}

abstract class Vehicle {
	public abstract void accelerate();
}

class RiverBarge extends Vehicle implements Sailer {
	@Override
	public void dock() {
		System.out.println("dock");
	}

	@Override
	public void cruise() {
		System.out.println("cruise");
	}

	@Override
	public void accelerate() {
		System.out.println("accelerate");
	}
}

abstract class Airplane extends Vehicle implements Flyer {
	@Override
	public void takeOff() {
		System.out.println("takeoff");
	}

	@Override
	public void land() {
		System.out.println("land");
	}

	@Override
	public void fly() {
		System.out.println("fly");
	}

	@Override
	public void accelerate() {
		System.out.println("accelerate");
	}
}

class Helicopter extends Airplane {
	
}

class SeaPlane extends Airplane implements Sailer, Serializable, Remote {

	@Override
	public void dock() {
		System.out.println("dock");
	}

	@Override
	public void cruise() {
		System.out.println("cruise");
	}
	
}








