package cl.veterinaria.web.models;

public class Dog extends Animal implements Pet {

	private static final long serialVersionUID = 1L;

	public Dog() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Dog(String name, String breed, int weight) {
		// TODO Auto-generated constructor stub
		super(name,breed,weight);

	}

	@Override
	public String showAffection() {
		// TODO Auto-generated method stub
		
		if (this.getWeight()<30) {
			return this.getName().toUpperCase() + " happed into your  lap  and cuddle you.";
		}
		else {
			return this.getName().toUpperCase() + " snuggled up next to you.";
		}
				
	}

}
