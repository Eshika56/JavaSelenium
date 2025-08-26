package coreJava;
public class DogAnimalInterface implements AnimalInterface {
	public void bark() {
		System.out.println("Dog is barking");
	}

	public static void main(String[] args) {
		DogAnimalInterface obj = new DogAnimalInterface();
		obj.bark();

	}

}
