package instrumentClasses;

public class Percussion extends Instruments {

	// Properties
	public String percussionInstrumentName;
	public int percussionInstrumentId;

	// Overload constructors
	public Percussion(String strNewInstrumentGroup, String strNewInstrumentName, int intNewInstrumentId,
			String strNewPercussionInstrumentName, int intNewPercussionInstrumentId) {
		super(strNewInstrumentGroup, strNewInstrumentName, intNewInstrumentId);
		this.percussionInstrumentName = strNewPercussionInstrumentName;
		this.percussionInstrumentId = intNewPercussionInstrumentId;
	}

	// Display Class
	public void Display_Class_Percussion() {

		super.Display_Class_Instruments();
		System.out.println("Percussion Instrument Name : " + percussionInstrumentName);
		System.out.println("Percussion Instrument Id   : " + percussionInstrumentId);

	}

	// Getters and setters for PercussionInstrumentName
	public String getPercussionInstrumentName() {
		return percussionInstrumentName;
	}

	public void setPercussionInstrumentName(String strNewPercussionInstrumentName) {
		this.percussionInstrumentName = strNewPercussionInstrumentName;
	}

	// Getters and setters for PercussionInstrumentId
	public int getIntPercussionInstrumentId() {
		return percussionInstrumentId;
	}

	public void setIntPercussionInstrumentId(int intNewPercussionInstrumentId) {
		this.percussionInstrumentId = intNewPercussionInstrumentId;
	}

}
