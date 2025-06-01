public abstract class Alien extends Animal{
    protected boolean hasFur;
    protected int legs;
    protected int eyes;

    public Alien(String name, String species, String habitat, boolean hasFur, int legs, int eyes){
        super(name, species, habitat);
        this.hasFur = hasFur;
        this.legs = legs;
        this.eyes = eyes;
    }

    public int getEyes(){
        return eyes;
    }


    @Override
    public String getInfo(){
        return super.getInfo() + "\n This alien has " + legs + " legs. \n Is it furry? : " + hasFur;
    }

    public void setHasFur(boolean hasFur){
        this.hasFur = hasFur;
    }
}
