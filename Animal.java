package MainApp;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Animal {
	String name ;
	int age;
	String species;
	BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
	
		
	    public void display(){
		System.out.println("Name :"+this.name);
		System.out.println("Age :"+this.age);
		System.out.println("Species :"+this.species+"\n");
		

	

	}

}
