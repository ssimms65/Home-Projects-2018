package instrumentClasses;

public class Musicians {

	// Properties
	public String musiciansName;
	public String musiciansInstrument;
	public int musiciansId;
 
	// Overload Constructor
	public Musicians(String strNewMusiciansName, String strNewMusiciansInstruments, int intNewMusiciansId) {
		musiciansName = strNewMusiciansName;
		musiciansInstrument = strNewMusiciansInstruments;
		musiciansId = intNewMusiciansId;
	}

	// Display Method
	public void Display_Class_Musicians() {
		System.out.println("Musicians Name        : " + musiciansName);
		System.out.println("Musicians Instrument  : " + musiciansInstrument);
		System.out.println("Musicians Id          : " + musiciansId);
	}

	// Getters and setters for MusiciansName
	public String getMusiciansName() {
		return musiciansName;
	}

	public void setMusiciansName(String strNewMusiciansName) {
		this.musiciansName = strNewMusiciansName;
	}

	// Getters and setters for MusiciansInstrument
	public String getMusiciansInstrument() {
		return musiciansInstrument;
	}

	public void setMusiciansInstrument(String strNewMusiciansInstrument) {
		this.musiciansInstrument = strNewMusiciansInstrument;
	}

	// Getters and setters for MusiciansName
	public int getMusiciansId() {
		return musiciansId;
	}

	public void setMusiciansId(int intNewMusiciansId) {
		this.musiciansId = intNewMusiciansId;
	}

}
