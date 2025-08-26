package coreJava;

// superClass
 class An {
	public void eat() {
		System.out.println("Animas eat food");
	}
}
// SubClass 1
class Dog extends An {
	public void bark() {
		System.out.println("Dog Barks");
		
	}
}
//SubClass 2
class Cat extends An {
	public void meow() {
		System.out.println("Cat meows");
		
	}
}
//SubClass 3
class Cow extends An {
	public void moo() {
		System.out.println("Cat moos");
		
	}
}
// main class
class Animal {
	public static void main(String[] args) {
		Dog d = new Dog();
		d.eat();
		d.bark();
		
		Cat c = new Cat();
		c.eat();
		c.meow();
		
		Cow cw = new Cow();
		cw.eat();
		cw.moo();
	}
}