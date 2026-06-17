package training;

public class Training_string {
    static void main() {
        String test = "abs";
        String test1 = "abs";

        System.out.println(test == test1);
        System.out.println(test.equals(test1));

        String test2 = new String("abs");
        System.out.println(test == test2);
        System.out.println(test.equals(test2));

        System.out.println(test);

        char[] str = test.toCharArray();
        for (int i = 0; i < str.length; i++) {

        }
    }
}
