package instrumentClasses;

public class Musicians {

	// Properties
	private String musiciansName;
	private String musiciansInstrument;
	private int musiciansId;
 
	// Overload Constructor
	public Musicians(String newMusiciansName, String newMusiciansInstruments, int newMusiciansId) {
		musiciansName = newMusiciansName;
		musiciansInstrument = newMusiciansInstruments;
		musiciansId = newMusiciansId;
	}

	// Display Method
	public void displayClassMusicians() {
		System.out.println("Musicians Name        : " + musiciansName);
		System.out.println("Musicians Instrument  : " + musiciansInstrument);
		System.out.println("Musicians Id          : " + musiciansId);
	}
	
	
	//Getters and setters
	public String getMusiciansName() {
		return musiciansName;
	}

	public void setMusiciansName(String musiciansName) {
		this.musiciansName = musiciansName;
	}

	public String getMusiciansInstrument() {
		return musiciansInstrument;
	}

	public void setMusiciansInstrument(String musiciansInstrument) {
		this.musiciansInstrument = musiciansInstrument;
	}

	public int getMusiciansId() {
		return musiciansId;
	}

	public void setMusiciansId(int musiciansId) {
		this.musiciansId = musiciansId;
	}


}
