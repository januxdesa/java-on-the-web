package cl.veterinaria.web.models;

public class Cat extends Animal implements Pet {

	private static final long serialVersionUID = 1L;


	public Cat() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cat(String name, String breed, int weight) {
		// TODO Auto-generated constructor stub		
		super(name, breed, weight);
	}


	@Override
	public String showAffection() {
		// TODO Auto-generated method stub
		return "You " + this.getBreed() + " cat, " + this.getName() + " looked at you with some affection.";
	}
	
	
	
		
}
