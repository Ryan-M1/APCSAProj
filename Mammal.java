public class Mammal extends Animal{
    private boolean isWarmBlooded;

    public Mammal(String name, String species, String habitat){
        super(name, species, habitat);
        this.isWarmBlooded = true; 
    }

    @Override
    public String makeSound(){
        return "grrrrrrrrrrr";
    }

    @Override
    public String getSpecialBehavior(){
        return name + " can nurse its young.";
    }

    public void setWarmBlooded(boolean isWarmBlooded){
        this.isWarmBlooded = isWarmBlooded;
    }

    public boolean getWarmBlooded(){
        return isWarmBlooded;
    }
}
