import org.w3c.dom.ls.LSOutput;

public class lesson7 {

    //task 1 You need to double the integer and return it.



    // Timmy & Sarah think they are in love, but around where they live,
    // they will only know once they pick a flower each.
    // If one of the flowers has an even number of petals and the other has an odd
    // number of petals it means they are in love.
    // Write a function that will take the number of petals of each flower
    // and return true if they are in love and false if they aren't.

    public static boolean inLove (int flower1, int flower2) {
        return flower1 % 2 != flower2 % 2;
    };

   // boolean result = inLove (10, 5);
   // System.out.println(result);
}
