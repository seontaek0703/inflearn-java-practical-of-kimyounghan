package collection.set;

public class MyHashSetV1Main {

    public static void main(String[] args) {
        MyHashSetV1 set = new MyHashSetV1(10);
<<<<<<< HEAD

=======
>>>>>>> 873d7f27b76509ef2638d39176ee99d42eeb9b39
        set.add(1);
        set.add(2);
        set.add(5);
        set.add(8);
        set.add(14);
        set.add(99);
        set.add(9);
        System.out.println(set);

<<<<<<< HEAD
        // 검색
=======
        // search
>>>>>>> 873d7f27b76509ef2638d39176ee99d42eeb9b39
        int searchValue = 9;
        boolean result = set.contains(searchValue);
        System.out.println("set.contains(" + searchValue + ") = " + result);

<<<<<<< HEAD
        // 삭제
=======
        // remove
>>>>>>> 873d7f27b76509ef2638d39176ee99d42eeb9b39
        boolean removeResult = set.remove(searchValue);
        System.out.println("removeResult = " + removeResult);
        System.out.println(set);
    }
}
