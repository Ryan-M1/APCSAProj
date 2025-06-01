public class Reptile extends Animal{
    private boolean isColdBlooded;
    private String scaleType;

    public Reptile(String name, String species, String habitat, String scaleType){
        super(name, species, habitat);
        this.isColdBlooded = true; // Default for reptiles
        this.scaleType = scaleType;
        setDiet("Carnivore"); // Default diet
    }

    @Override
    public String makeSound(){
        return "hissssss!!!";
    }

    @Override
    public String getSpecialBehavior(){
        return name + " slithers stealthily and has " + scaleType + " scales.";
    }

    public void setColdBlooded(boolean isColdBlooded){
        this.isColdBlooded = isColdBlooded;
    }

    public boolean getColdBlooded(){
        return isColdBlooded;
    }
}
