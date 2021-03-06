package instrumentClasses;

public class Instruments {

	// Properties
	private String instrumentGroup;
	private String instrumentName;
	private int instrumentId;

	// Overload Constructor
	public Instruments(String newInstrumentGroup, String newInstrumentName, int newInstrumentId) {
		instrumentGroup = newInstrumentGroup;
		instrumentName = newInstrumentName;
		instrumentId = newInstrumentId;
	}

	// Display Method
	public void displayClassInstruments() {
		System.out.println("Instruments Group  : " + instrumentGroup);
		System.out.println("Instruments Name   : " + instrumentName);
		System.out.println("Instruments Id     : " + instrumentId);
	}

	//Getters and setters
	public String getInstrumentGroup() {
		return instrumentGroup;
	}

	public void setInstrumentGroup(String instrumentGroup) {
		this.instrumentGroup = instrumentGroup;
	}

	public String getInstrumentName() {
		return instrumentName;
	}

	public void setInstrumentName(String instrumentName) {
		this.instrumentName = instrumentName;
	}

	public int getInstrumentId() {
		return instrumentId;
	}

	public void setInstrumentId(int instrumentId) {
		this.instrumentId = instrumentId;
	}
	
}
