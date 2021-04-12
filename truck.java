
public class truck {
String model;
String color;
String tire;
int speed;

public void setModel(String model) {
	this.model=model;
}
public void setColor(String color) {
	this.color=color;
}
public void setTire(String tire) {
	this.tire=tire;
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

public String getTire() {
	  return this.tire;
}
public int getSpeed() {
	  return this.speed;
}


public void Storage() {
	System.out.println("The truck can storage");
}
public void Speed() {
	System.out.println("The truck can speed");
}
}
