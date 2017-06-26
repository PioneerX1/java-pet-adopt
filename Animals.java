class Animals {
  public String mName;
  public int mAge;
  public String mSpecies;
  public String mGender;
  public Boolean mAvailableForAdopt;

  public Boolean olderPet() {
    if (this.mAge >= 7) { return false;}
    else {return true;}
  }
  public Boolean canBeAdopted() {
    if (this.mAvailableForAdopt == true) { return true;}
    else {return false;}
  }

}
