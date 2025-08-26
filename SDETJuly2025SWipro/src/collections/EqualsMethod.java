package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class EqualsMethod {
	int id;

	String name;

	 EqualsMethod(int id , String name) {

		this.id = id;

		this.name = name;

	}

	 // Overiding equal () to compare the object content

	 @Override

	 public boolean equals(Object obj) {

		 if (this == obj) return true ; // same reference

		 if(obj == null || getClass()!= obj.getClass()) return false;


		 Person other  = (Person)obj;

		 return this.id == other.id && this.name.equals(other.name);

	 }


	 @Override

	 public int hashCode() {

		 return Objects.hash(id ,name);

	 }

	 @Override

	 public String toString() {

			return id   + "_" + name;


		}


 
	public static void main(String[] args) {
 
 
		List<Person>  persons = new ArrayList<>();

		persons.add(new Person (103, "Ravi"));

		persons.add(new Person (101, "Amit"));

		persons.add(new Person (102, "Zara"));


		persons.add(new Person (102, "Zara"));


		persons.add(new Person (104, "John"));


		for (Person e: persons ) {

			System.out.println(e);

		}
 
 
	}
}
 