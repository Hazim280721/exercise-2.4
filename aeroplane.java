
public class aeroplane {
String model;
String color;
int seat;
int speed;

public void setModel(String model) {
	this.model=model;
}
public void setColor(String color) {
	this.color=color;
}
public void setSeat(int seat) {
	this.seat=seat;
}
public void setSpeed(int speed) {
	this.speed=speed;
}



public String getModel() {
	  return this.model;
}

public String getColor() {
	  return this.color;
 }

public int getSeat() {
	  return this.seat;
}
public int getSpeed() {
	  return this.speed;
}


public void Storage() {
	System.out.println("The aeroplane can storage");
}
public void Fly() {
	System.out.println("The aeroplane can fly long range");
}
}
