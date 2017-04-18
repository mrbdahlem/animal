public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cow = new Cow();
        Animal pig = new Pig();
        Animal fox = new Fox();
        
        System.out.print("The Dog Says: ");
        speak(dog);
        
        System.out.print("The Cow Says: ");
        speak(cow);
        
        System.out.print("The Pig Says: ");
        speak(pig);
        
        System.out.print("The Fox Says: ");
        speak(fox);
    }
    
    public static void speak(Animal a) {
        a.talk();
    }
}