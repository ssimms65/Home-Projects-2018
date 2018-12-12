package instrumentClasses;

public class Woodwind extends Instruments {

	// Properties
	public String woodwindInstrumentName;
	public int woodwindInstrumentId;

	// Overload constructors
	public Woodwind(String strNewInstrumentGroup, String strNewInstrumentName, int intNewInstrumentId,
			String strNewWoodwindInstrumentName, int intNewWoodwindInstrumentId) {
		super(strNewInstrumentGroup, strNewInstrumentName, intNewInstrumentId);
		this.woodwindInstrumentName = strNewWoodwindInstrumentName;
		this.woodwindInstrumentId = intNewWoodwindInstrumentId;
	}

	// Display Class
	public void Display_Class_Woodwind() {

		super.Display_Class_Instruments();
		System.out.println("Woodwind Instrument Name : " + woodwindInstrumentName);
		System.out.println("Woodwind Instrument Id   : " + woodwindInstrumentId);

	}

	// Getters and setters for WoodwindInstrumentName
	public String getWoodwindInstrumentName() {
		return woodwindInstrumentName;
	}

	public void setWoodwindInstrumentName(String strNewWoodwindInstrumentName) {
		this.woodwindInstrumentName = strNewWoodwindInstrumentName;
	}

	// Getters and setters for WoodwindInstrumentName
	public int getIntWoodwindInstrumentId() {
		return woodwindInstrumentId;
	}

	public void setIntWoodwindInstrumentId(int intNewWoodwindInstrumentId) {
		this.woodwindInstrumentId = intNewWoodwindInstrumentId;
	}

}