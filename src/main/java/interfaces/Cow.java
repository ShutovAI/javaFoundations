package interfaces;

public class Cow extends SuperCow implements Talkable, Flyable{
    @Override
    public void talk() {
        System.out.println("Muuuu");
    }

    @Override
    public void fly() {
        System.out.println("I fly!!!");
    }
}
