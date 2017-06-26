class Animals {
  public String mName;
  public int mAge;
  public String mSpecies;
  public String mGender;
  public Boolean mAvailableForAdopt;

  public Animals(String name, int age, String species, String gender, Boolean available) {
    mName = name;
    mAge = age;
    mSpecies = species;
    mGender = gender;
    mAvailableForAdopt = available;
  }

  public Boolean olderPet() {
    if (this.mAge >= 7) { return false;}
    else {return true;}
  }
  public Boolean canBeAdopted() {
    if (this.mAvailableForAdopt == true) { return true;}
    else {return false;}
  }
  public void changeAdoptStatus() {
    if (this.mAvailableForAdopt == true) { this.mAvailableForAdopt = false;} else if (this.mAvailableForAdopt == false) { this.mAvailableForAdopt = true;}
  }

}
