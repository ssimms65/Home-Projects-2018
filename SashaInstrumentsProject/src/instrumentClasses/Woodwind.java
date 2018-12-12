package instrumentClasses;

public class Woodwind extends Instruments {

	// Properties
	private String woodwindInstrumentName;
	private int woodwindInstrumentId;

	// Overload constructors
	public Woodwind(String newInstrumentGroup, String newInstrumentName, int newInstrumentId,
			String newWoodwindInstrumentName, int newWoodwindInstrumentId) {
		super(newInstrumentGroup, newInstrumentName, newInstrumentId);
		this.woodwindInstrumentName = newWoodwindInstrumentName;
		this.woodwindInstrumentId = newWoodwindInstrumentId;
	}

	// Display Class
	public void displayClassWoodwind() {

		super.displayClassInstruments();
		System.out.println("Woodwind Instrument Name : " + woodwindInstrumentName);
		System.out.println("Woodwind Instrument Id   : " + woodwindInstrumentId);

	}

	//Getters and setters
	public String getWoodwindInstrumentName() {
		return woodwindInstrumentName;
	}

	public void setWoodwindInstrumentName(String woodwindInstrumentName) {
		this.woodwindInstrumentName = woodwindInstrumentName;
	}

	public int getWoodwindInstrumentId() {
		return woodwindInstrumentId;
	}

	public void setWoodwindInstrumentId(int woodwindInstrumentId) {
		this.woodwindInstrumentId = woodwindInstrumentId;
	}


}
