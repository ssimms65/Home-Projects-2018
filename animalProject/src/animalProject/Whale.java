package animalProject;

public class Whale extends Animal {

	
	private String mainOcean;
	private Integer weight; //tonnes
	private Integer maxSpeed;
	private Integer length; //meters
	
	
	public Whale() {
		super();
	}
	
	public Whale(String name, String mainOcean, int weight, int maxSpeed, int length) {
		super(name);
		this.mainOcean = mainOcean;
		this.weight = weight;
		this.maxSpeed = maxSpeed;
		this.length = length;
	}
	
	
	@Override
	public String toString() {
		return "Whale [mainOcean=" + mainOcean + ", weight=" + weight + ", maxSpeed=" + maxSpeed + ", length=" + length
				+ ", getMainOcean()=" + getMainOcean() + ", getWeight()=" + getWeight() + ", getMaxSpeed()="
				+ getMaxSpeed() + ", getLength()=" + getLength() + ", getName()=" + getName() + ",]";
	}

	public String getMainOcean() {
		return mainOcean;
	}


	public void setMainOcean(String mainOcean) {
		this.mainOcean = mainOcean;
	}


	public Integer getWeight() {
		return weight;
	}


	public void setWeight(Integer weight) {
		this.weight = weight;
	}


	public Integer getMaxSpeed() {
		return maxSpeed;
	}


	public void setMaxSpeed(Integer maxSpeed) {
		this.maxSpeed = maxSpeed;
	}


	public Integer getLength() {
		return length;
	}


	public void setLength(Integer length) {
		this.length = length;
	}
	
	

}
