package interfaces;

public interface Talkable {
    void talk();
    default void print(){
        System.out.println("Talkable");
    }

}
