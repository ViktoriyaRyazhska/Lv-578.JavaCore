package HomeWork4;

public enum Breeds {
	LABRADOR_RETRIEVERS("Labrador Retrievers"),
	GERMAN_SHEPHERDS("German Shepherds"),
	GOLDEN_RETRIEVERS("Golden Retrievers"),
	FRENCH_BULLDOGS("French Bulldogs"),
	BULLDOGS("Bulldogs"),
	BEAGLES("Beagles"),
	POODLES("Poodles"),
	ROTTWEILERS("Rottweilers"),
	GERMAN_SHORTHAIRED_POINTERS("German Shorthaired Pointers"),
	YORKSHIRE_TERRIERS("Yorkshire Terriers");
	private String breed;
	
	Breeds (String breed){
		this.breed = breed;
	}
	
	String getBreed() {
		return breed;
	}
}
