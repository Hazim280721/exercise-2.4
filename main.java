
public class main {
	public static void main(String[] args) {
		truck toyota = new truck();
		
		toyota.setModel("Toyota");
		toyota.setColor("Blue");
		toyota.setTire("Small");
		toyota.setSpeed(200);
		
		System.out.println("Model : " + toyota.getModel());
		System.out.println("Color : " +toyota.getColor());
		System.out.println("Tire Size : " +toyota.getTire());
		System.out.println("Max Speed : " +toyota.getSpeed());
		toyota.Storage();
		toyota.Speed();
		
		System.out.println();
		
        truck nissan = new truck();
		
        nissan.setModel("Nissan");
        nissan.setColor("Yellow");
        nissan.setTire("Big");
        nissan.setSpeed(180);
		
		System.out.println("Model : " + toyota.getModel());
		System.out.println("Color : " +toyota.getColor());
		System.out.println("Tire Size : " +toyota.getTire());
		System.out.println("Max Speed : " +toyota.getSpeed());
		nissan.Storage();
		nissan.Speed();
	}


}
