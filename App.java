import java.io.Console;
import java.util.List;
import java.util.ArrayList;

public class App {
  public static void main(String[] args) {
    Console myConsole = System.console();

    Animals rappy = new Animals("Rappy", 7, "Cat", "Female", false);
    Animals vanilla = new Animals("Vanilla", 4, "Dog", "Female", false);
    Animals fluffy = new Animals("Fluffy", 10, "Cat", "Male", true);
    Animals killer = new Animals("Killer", 5, "Komodo Dragon", "Male", true);

    List<Animals> allAnimals = new ArrayList<Animals>();
    allAnimals.add(rappy);
    allAnimals.add(vanilla);
    allAnimals.add(fluffy);
    allAnimals.add(killer);


    Boolean proceed = true;

    while(proceed == true) {

    System.out.println("Welcome to our Pet Adoption Center. Would you like to View All Pets, Adopt a Pet, Add a Pet, or Exit?");

    String choice = myConsole.readLine();

    if (choice.equals("Exit")) { proceed = false;}
    else if (choice.equals("View All Pets")) {
      System.out.println("All Animals:");

      for (Animals individualAnimals : allAnimals) {
       {
        System.out.println( "----------------------" );
        System.out.println(individualAnimals.mName);
        System.out.println(individualAnimals.mAge);
        System.out.println(individualAnimals.mSpecies);
        System.out.println(individualAnimals.mGender);
        System.out.println(individualAnimals.mAvailableForAdopt);
        }
    }
    }
    else if (choice.equals("Adopt a Pet")) {
      System.out.println("Are you open to older pets?");
      String wantOlderPets = myConsole.readLine();

      if (wantOlderPets.contains("y")) {
        System.out.println("All Animals:");

        for (Animals individualAnimals : allAnimals) {
          if (individualAnimals.canBeAdopted() == true) {
          System.out.println( "----------------------" );
          System.out.println(individualAnimals.mName);
          System.out.println(individualAnimals.mAge);
          System.out.println(individualAnimals.mSpecies);
          System.out.println(individualAnimals.mGender);
          System.out.println(individualAnimals.mAvailableForAdopt);
          }
      } } else {
        //olderPet();
        for (Animals individualAnimals : allAnimals) {
          if (individualAnimals.olderPet() == true && individualAnimals.canBeAdopted() == true) {
          System.out.println( "----------------------" );
          System.out.println(individualAnimals.mName);
          System.out.println(individualAnimals.mAge);
          System.out.println(individualAnimals.mSpecies);
          System.out.println(individualAnimals.mGender);
          System.out.println(individualAnimals.mAvailableForAdopt);
        }
      } }
    }
    else if (choice.equals("Add a Pet")) {
      System.out.println("Enter your pet's name: ");
      String inputName = myConsole.readLine();
      System.out.println("Enter your pet's age: ");
      Integer inputAge = Integer.parseInt(myConsole.readLine());
      System.out.println("What species is your pet?");
      String inputSpecies = myConsole.readLine();
      System.out.println("Is your pet Male or Female?");
      String inputGender = myConsole.readLine();

      Animals newPet = new Animals(inputName, inputAge, inputSpecies, inputGender, true);
      allAnimals.add(newPet);
    }
    else {
      System.out.println("I did not recognize your response. Try again ... loser.");
    }

   }
  }
}
