package instrumentClasses;

public class Brass extends Instruments {

	// Properties
	private String brassInstrumentName;
	private int brassInstrumentId;

	// Overload constructors
	public Brass(String newInstrumentGroup, String newInstrumentName, int newInstrumentId,
			String newBrassInstrumentName, int newBrassInstrumentId) {
		super(newInstrumentGroup, newInstrumentName, newInstrumentId);
		this.brassInstrumentName = newBrassInstrumentName;
		this.brassInstrumentId = newBrassInstrumentId;
	}

	// Display Class
	public void displayClassBrass() {

		super.displayClassInstruments();
		System.out.println("Brass Instrument Name : " + brassInstrumentName);
		System.out.println("Brass Instrument Id   : " + brassInstrumentId);

	}

	//Getters and setters
	public String getBrassInstrumentName() {
		return brassInstrumentName;
	}

	public void setBrassInstrumentName(String brassInstrumentName) {
		this.brassInstrumentName = brassInstrumentName;
	}

	public int getBrassInstrumentId() {
		return brassInstrumentId;
	}

	public void setBrassInstrumentId(int brassInstrumentId) {
		this.brassInstrumentId = brassInstrumentId;
	}	
	
}
