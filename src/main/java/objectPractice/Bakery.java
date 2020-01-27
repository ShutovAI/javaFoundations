package objectPractice;

public class Bakery {
    public static void main(String[] args) {
        Cake myCake = new Cake();

        myCake.setName("Наполеон");
        myCake.setWeight(5);
        System.out.println("myCake = " + myCake);

        myCake.toString();

    }

}
