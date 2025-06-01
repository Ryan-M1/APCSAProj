public class SmartAlien extends Alien{
    private int intelligence;
    protected boolean risky;

    public SmartAlien(String name, String species, String habitat, int intelligence, boolean risky, int eyes){
        super(name, species, habitat, true, 2, eyes);
        this.intelligence = intelligence;
        this.risky = risky;
        setDiet("Omnivore");
    }

    @Override
    public String makeSound(){
        return "Glub glub glub...me think hard";
    }

    @Override
    public String getSpecialBehavior(){
        return name + " likes to read and discuss the socioeconomic state of the world";
    }

    public boolean isRisky(){
        return risky;
    }

    public void readbook(int x){
        intelligence += x;
        risky = intelligence >= 100;
    }

    public void isItReallySmart(){
        if (intelligence >= 100){
            System.out.println(name + " is really smart and is at risk of escaping!!!");
        } else if (intelligence > 50){
            System.out.println(name + " isn't going to escape anytime soon but keep an eye on it.");
        } else{
            System.out.println(name + " is smarter than the average alien but just barely.");
        }
    }
}
