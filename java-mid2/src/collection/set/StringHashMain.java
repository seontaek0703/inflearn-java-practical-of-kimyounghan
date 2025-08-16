package collection.set;

public class StringHashMain {

    static final int CAPACITY = 10;

    public static void main(String[] args) {
<<<<<<< HEAD
        // char
=======
        //char
>>>>>>> 873d7f27b76509ef2638d39176ee99d42eeb9b39
        char charA = 'A';
        char charB = 'B';
        System.out.println("charA = " + (int)charA);
        System.out.println("charB = " + (int)charB);

<<<<<<< HEAD
//        int hashCode = hashCode("A");
//        System.out.println("hashCode = " + hashCode);
    }

//    static int hashCode(String str) {
//        char[] charArray = str.toCharArray();
//        int sum = 0;
//
//    }
=======
        // hashCode
        System.out.println("hashCode('A') = " + hashCode("A"));
        System.out.println("hashCode('B') = " + hashCode("B"));
        System.out.println("hashCode('AB') = " + hashCode("AB"));

        // hashIndex
        System.out.println("hashIndex(A) = " + hashIndex(hashCode("A")));
        System.out.println("hashIndex(A) = " + hashIndex(hashCode("B")));
        System.out.println("hashIndex(A) = " + hashIndex(hashCode("AB")));
    }

    static int hashCode(String string) {
        char[] charArray = string.toCharArray();
        int sum = 0;
        for (char c : charArray) {
            sum += (int)c;
        }
        return sum;
    }

    static int hashIndex(int value) {
        return value % CAPACITY;
    }
>>>>>>> 873d7f27b76509ef2638d39176ee99d42eeb9b39
}
