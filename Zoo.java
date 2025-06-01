import java.util.Scanner;

public class Zoo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to my Exotic Zoo!!!");
        System.out.println("I'm your tour guide today, and I'll be showing you some of the most fascinating creatures we have. Let's start our adventure!");

        
        Mammal tiger = new Mammal("Bruno", "Bengal Tiger", "Forest");
        tiger.setDangerous(true);
        tiger.setDiet("Lots of Meat");
        tiger.setUniqueFeature("Contrasting stripes");
        Mammal elephant = new Mammal("Dumbo", "African Elephant", "Savannah");
        elephant.setDiet("Veggies(usually leaves)");
        elephant.setUniqueFeature("Biggest Land Animal On Earth");
        Parrot parrot = new Parrot("Polly", "Macaw", "Rainforest", 1.5, "Polly wants a cracker");
        parrot.setUniqueFeature("Colorful feathers");
        Reptile cobra = new Reptile("Slick", "King Cobra", "Desert", "Smooth");
        cobra.setDangerous(true);
        cobra.setUniqueFeature("Fangs!!!");
        SmartAlien zorg = new SmartAlien("Zorg", "Martian", "Mars Colony", 50, false, 8);
        

        delay(4000);
        System.out.println("\nFirst stop: The Mammal Exhibit!");
        System.out.println("Let's meet " + tiger.getName() + ", a " + tiger.getSpecies() + " from the " + tiger.getHabitat() + ".");
        System.out.println(tiger.getInfo());
        System.out.println("Special Behavior: " + tiger.getSpecialBehavior());
        System.out.println("\nPress Enter to continue to the next animal.");
        scanner.nextLine();  
        
        
        System.out.println("\nNow, meet " + elephant.getName() + ", a gentle giant from the Savannah.");
        System.out.println(elephant.getInfo());
        System.out.println("Special Behavior: " + elephant.getSpecialBehavior());
        System.out.println("\nPress Enter to continue to the next exhibit.");
        scanner.nextLine();


        delay(2000);
        System.out.println("\nNow, we're at the Bird Exhibit!");
        System.out.println("Here's " + parrot.getName() + ", a colorful " + parrot.getSpecies() + ".");
        System.out.println(parrot.getInfo());
        System.out.println("Sound: " + parrot.makeSound());
        System.out.println("Special Behavior: " + parrot.getSpecialBehavior());
        System.out.println("\nPolly wants to learn a new phrase! Enter a phrase for Polly to mimic: ");
        String newPhrase = scanner.nextLine();
        parrot.setFavoritePhrase(newPhrase);  
        delay(2000);
        System.out.println();
        System.out.println("Polly now says: \"" + parrot.getFavoritePhrase() + "\"!");
        System.out.println("\nPress Enter to move to the next exhibit.");
        scanner.nextLine();

        delay(2000);
        System.out.println("\nNext stop: The Reptile Exhibit!");
        System.out.println("Let's meet " + cobra.getName() + ", a slithering serpent.");
        System.out.println(cobra.getInfo());
        System.out.println("Sound: " + cobra.makeSound());
        System.out.println("Special Behavior: " + cobra.getSpecialBehavior());
        System.out.println("\nPress Enter to visit our final exhibit.");
        scanner.nextLine();

        delay(2000);
        System.out.println("\nFinally, let's head to the Alien Habitat!");
        System.out.println();
        System.out.println("This is " + zorg.getName() + ", a highly intelligent " + zorg.getSpecies() + " from the " + zorg.getHabitat() + ".");
        System.out.println(zorg.getInfo());
        System.out.println("Sound: " + zorg.makeSound());
        System.out.println("Special Behavior: " + zorg.getSpecialBehavior());
        System.out.println("\nEnter the number of books to give Zorg: ");
        int books = scanner.nextInt();
        zorg.readbook(books * 10);
        zorg.isItReallySmart();
        delay(5000);
        // Check for Alien Uprising
        if(zorg.isRisky()){
            System.out.println("\nALERT! Zorg has become dangerously intelligent and triggered an Alien Uprising! The zoo is in chaos! \nLet's leave before we get caught in the mess.");
        } 
        else{
            System.out.println("\nAll is peaceful. Zorg remains under control.");
        }


        System.out.println("\nThank you for visiting the Exotic Zoo! We hope you enjoyed the tour.");
        scanner.close();
    }

    // Helper method to introduce delay
    private static void delay(int milliseconds) {
        try{
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            System.out.println("");
        }
    }
}
