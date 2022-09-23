package demo;

class Animal {
	String name;

	public Animal() {
	
			this.name = "Default Name";
			System.out.println(this);
	}

	@Override
	public String toString() {
		return "Animal [name=" + name + "]";
	}

	// This is called a one argument constructor.
	public Animal(String name) {
			this.name = name;
			System.out.println(this);
	}

	public static void main(String[] args) {
			Animal animal = new Animal("manu");
		
	}
}