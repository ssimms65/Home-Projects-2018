package instrumentClasses;

public class Instruments {

	// Properties
	public String instrumentGroup;
	public String instrumentName;
	public int instrumentId;

	// Overload Constructor
	public Instruments(String strNewInstrumentGroup, String strNewInstrumentName, int intNewInstrumentId) {
		instrumentGroup = strNewInstrumentGroup;
		instrumentName = strNewInstrumentName;
		instrumentId = intNewInstrumentId;
	}

	// Display Method
	public void Display_Class_Instruments() {
		System.out.println("Instruments Group  : " + instrumentGroup);
		System.out.println("Instruments Name   : " + instrumentName);
		System.out.println("Instruments Id     : " + instrumentId);
	}

	// Getters and setters for InstrumentGroup
	public String getinstrumentGroup() {
		return instrumentGroup;
	}

	public void setinstrumentGroup(String strNewInstrumentGroup) {
		this.instrumentGroup = strNewInstrumentGroup;
	}

	// Getters and setters for InstrumentName
	public String getStrInstrumentName() {
		return instrumentName;
	}

	public void setStrInstrumentName(String strNewInstrumentName) {
		this.instrumentName = strNewInstrumentName;
	}

	// Getters and setters for InstrumentId
	public int getIntInstrumentId() {
		return instrumentId;
	}

	public void setIntInstrumentId(int intNewInstrumentId) {
		this.instrumentId = intNewInstrumentId;
	}

}
