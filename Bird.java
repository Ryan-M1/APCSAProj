public class Bird extends Animal{
    private boolean canFly;
    private double wingSpan;

    public Bird(String name, String species, String habitat, double wingSpan){
        super(name, species, habitat);
        this.wingSpan = wingSpan;
        this.canFly = true; 
        setDiet("Omnivore"); 
    }

    @Override
    public String makeSound(){
        return "chirp chirp chirp!!!";
    }

    @Override
    public String getSpecialBehavior(){
        return name + " loves to soar through the skies with a wingspan of " + wingSpan + " meters.";
    }

    public void setCanFly(boolean canFly){
        this.canFly = canFly;
    }

    public boolean getCanFly(){
        return canFly;
    }
}