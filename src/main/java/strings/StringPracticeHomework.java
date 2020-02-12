package strings;


public class StringPracticeHomework {
    private String word = "ротор";

    public void check() {
        String word = "топот";
        String reversWord = new StringBuffer(word).reverse().toString();
        System.out.println("Check " + word.equalsIgnoreCase(reversWord));
    }

    public void check2() {
        String word2 = "топот";
        char[] array = word2.toCharArray();
        char[] arrayResult = new char[array.length];
        for (int i = 0; i < array.length; i++) {
            if (array[i] == array[array.length - 1 - i]) {
                arrayResult[i] = array[i];
            } else {
                System.out.println("Мдаа");
            }
        }
        String wordResult = String.valueOf(arrayResult);
        System.out.println("Check2 " +word2.equalsIgnoreCase(wordResult));
    }
}
