package instrumentClasses;

public class Percussion extends Instruments {

	// Properties
	private String percussionInstrumentName;
	private int percussionInstrumentId;

	// Overload constructors
	public Percussion(String newInstrumentGroup, String newInstrumentName, int newInstrumentId,
			String newPercussionInstrumentName, int newPercussionInstrumentId) {
		super(newInstrumentGroup, newInstrumentName, newInstrumentId);
		this.percussionInstrumentName = newPercussionInstrumentName;
		this.percussionInstrumentId = newPercussionInstrumentId;
	}

	// Display Class
	public void displayClassPercussion() {

		super.displayClassInstruments();
		System.out.println("Percussion Instrument Name : " + percussionInstrumentName);
		System.out.println("Percussion Instrument Id   : " + percussionInstrumentId);

	}

	//Getters and setters
	public String getPercussionInstrumentName() {
		return percussionInstrumentName;
	}

	public void setPercussionInstrumentName(String percussionInstrumentName) {
		this.percussionInstrumentName = percussionInstrumentName;
	}

	public int getPercussionInstrumentId() {
		return percussionInstrumentId;
	}

	public void setPercussionInstrumentId(int percussionInstrumentId) {
		this.percussionInstrumentId = percussionInstrumentId;
	}

	
}
