import java.io.Console;

public class App {
  public static void main(String[] args) {
    Console myConsole = System.console();

    Animals rappy = new Animals("Rappy", 7, "Cat", "Female", false);
    Animals vanilla = new Animals("Vanilla", 4, "Dog", "Female", false);
    Animals fluffy = new Animals("Fluffy", 10, "Cat", "Male", true);
    Animals killer = new Animals("Killer", 5, "Komodo Dragon", "Male", true);

    Animals[] allAnimals = {rappy, vanilla, fluffy, killer};

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
     }
   }
  }
}
