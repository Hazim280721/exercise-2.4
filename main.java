
public class main {
	public static void main(String[] args) {
		aeroplane boeing = new aeroplane();
		
		boeing.setModel("Boeing");
		boeing.setColor("Blue");
		boeing.setSeat(230);
		boeing.setSpeed(200);
		
		System.out.println("Model : " + boeing.getModel());
		System.out.println("Color : " +boeing.getColor());
		System.out.println("Seats : " +boeing.getSeat());
		System.out.println("Max Speed : " +boeing.getSpeed()+" Kn");
		boeing.Storage();
		boeing.Fly();
		
		System.out.println();
		
        aeroplane airbus = new aeroplane();
		
        airbus.setModel("Airbus");
        airbus.setColor("Yellow");
        airbus.setSeat(244);
        airbus.setSpeed(180);
		
		System.out.println("Model : " + airbus.getModel());
		System.out.println("Color : " +airbus.getColor());
		System.out.println("Seats : " +airbus.getSeat());
		System.out.println("Max Speed : " +airbus.getSpeed()+" Kn");
		airbus.Storage();
		airbus.Fly();
	}


}
