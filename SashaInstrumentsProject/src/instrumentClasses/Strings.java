package instrumentClasses;

public class Strings extends Instruments {

	// Properties
	private String stringsInstrumentName;
	private int stringsInstrumentId;

	// Overload constructors
	public Strings(String strNewInstrumentGroup, String strNewInstrumentName, int intNewInstrumentId,
			String strNewStringsInstrumentName, int intNewStringsInstrumentId) {
		super(strNewInstrumentGroup, strNewInstrumentName, intNewInstrumentId);
		this.stringsInstrumentName = strNewStringsInstrumentName;
		this.stringsInstrumentId = intNewStringsInstrumentId;
	}

	// Display Class
	public void displayClassStrings() {

		super.displayClassInstruments();
		System.out.println("Strings Instrument Name : " + stringsInstrumentName);
		System.out.println("Strings Instrument Id   : " + stringsInstrumentId);

	}

	// Getters and setters for StringsInstrumentName
	public String getstringsInstrumentName() {
		return stringsInstrumentName;
	}

	public void setstringsInstrumentName(String strNewStringsInstrumentName) {
		this.stringsInstrumentName = strNewStringsInstrumentName;
	}

	// Getters and setters for StringsInstrumentName
	public int getIntStringsInstrumentId() {
		return stringsInstrumentId;
	}

	public void setIntStringInstrumentId(int intNewStringsInstrumentId) {
		this.stringsInstrumentId = intNewStringsInstrumentId;
	}

}
