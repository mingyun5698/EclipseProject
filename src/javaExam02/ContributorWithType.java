package javaExam02;

public class ContributorWithType {
	private Contributor name;
	ContributorWithType(Contributor name) {
		this.name = new Contributor();
	}
	
	public String toString() {
		return "ContributorWithType::toString";
	}
	
	
	enum ContType {
		AUTHOR, ACTOR, DIRECTOR, ARTIST;
		}
}

class Contributor {
}
