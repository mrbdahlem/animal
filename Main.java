public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cow = new Cow();
        Animal pig = new Pig();
        Animal fox = new Fox();
        Animal a;
        
        a = dog;
        System.out.println("The Dog Says: " + a.talk());
        
        a = cow;
        System.out.println("The Cow Says: " + a.talk());
        
        a = pig;
        System.out.println("The Pig Says: " + a.talk());
                
        a = fox;
        System.out.println("The Fox Says: " + a.talk());
    }
}
