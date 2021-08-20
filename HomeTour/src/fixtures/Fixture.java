package fixtures;

public class Fixture {
	
	public String name;
	public String shortDescription;
	public String longDescription;
	
	public Fixture(String Name, String shortDescription, String longDescription) {
		this.name = Name;
		this.shortDescription = shortDescription;
		this.longDescription = longDescription;
	}
	public Fixture() {
		super();
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String Name) {
		this.name= Name;
	}
	
	public String getshortDescription() {
		return shortDescription;
	}
	
	public void setshortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
}
	public String getlongDescription() {
		return longDescription;
	}
	
	public void setlongDescription(String longDescription) {
		this.longDescription = longDescription;
	}
}

