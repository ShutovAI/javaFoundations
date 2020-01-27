package core;

public class WorkWithStatic {
    public static void main(String[] args) {
        Cat murzik = new Cat();
        Cat barsic = new Cat();

//        murzik.setIsLoveMilk();

        Cat.isLoveMilk = false;

        System.out.println(murzik.getLoveMilk());
        System.out.println(barsic.getLoveMilk());
    }
}
