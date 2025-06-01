public abstract class Animal{
    protected String name;
    protected String species;
    protected String habitat;
    protected String diet;
    protected boolean isDangerous;
    protected String uniqueFeature;

    public Animal(String name, String species, String habitat){
        this.name = name;
        this.species = species;
        this.habitat = habitat;
        this.diet = "Unknown";
        this.isDangerous = false;
        this.uniqueFeature = "None";
    }

    public abstract String makeSound();
    public abstract String getSpecialBehavior();

    public String getInfo(){
        return name + " is a(n) " + species + " that lives in the " +  habitat + ". \n This animal's diet is " + diet + ". \n" + "Is this animal dangerous?: " + isDangerous + "\n Its distinguishing feature: " + uniqueFeature;
    }


    public void setDiet(String diet){
        this.diet = diet;
    }

    public void setDangerous(boolean isDangerous){
        this.isDangerous = isDangerous;
    }

    public void setUniqueFeature(String uniqueFeature){
        this.uniqueFeature = uniqueFeature;
    }


    public String getName(){ 
        return name;
    }
    public String getSpecies(){ 
        return species; 
    }
    public String getHabitat(){
        return habitat;
    }
    public boolean getDanger(){ 
        return isDangerous; 
    }
}
