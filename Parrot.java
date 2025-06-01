public class Parrot extends Bird{
    private String favoritePhrase;

    public Parrot(String name, String species, String habitat, double wingSpan, String favoritePhrase){
        super(name, species, habitat, wingSpan);
        this.favoritePhrase = favoritePhrase;
    }

    @Override
    public String makeSound(){
        return name + " squawks loudly and says: \"" + favoritePhrase + "\"!";
    }

    @Override
    public String getSpecialBehavior(){
        return name + " loves mimicking sounds and talking!";
    }

    public void setFavoritePhrase(String phrase){
        this.favoritePhrase = phrase;
    }

    public String getFavoritePhrase(){
        return favoritePhrase;
    }
}