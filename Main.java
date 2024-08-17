package MainApp;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
	 
	static  int animalCount=0;
	static Animal [] animalArrays = new Animal[100];
	
	 public static void main(String[] args) throws IOException {
	 String flag;
	
	 
	 do{
		 inputData();
		 
		
		System.out.print("Do you want to enter another animals?(yes/no) :");
		flag = br.readLine();
		}
	 while (flag.equalsIgnoreCase("yes"));
	 
	 System.out.println("\n Total number of animals :"+animalCount+"\n");
		
     for (int i=0;i<animalCount;i++){
    	 System.out.println("Animal "+ (i+1));
    	 animalArrays[i].display();
     }
}

		public static void inputData()throws IOException{
			System.out.print("Enter animal name :");
			 String name = br.readLine();
			System.out.print("Enter animal age :");
			 int age = Integer.parseInt(br.readLine());
			System.out.print("Enter animal species :");
			 String species = br.readLine();
			 
			 Animal animal = new Animal();
			 animal.name = name;
			 animal.age = age;
			 animal.species = species;
			 animalArrays [animalCount] = animal;
			 animalCount++;
			 
			 
			 }
}
