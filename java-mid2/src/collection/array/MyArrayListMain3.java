package collection.array;

public class MyArrayListMain3 {

    public static void main(String[] args) {
        MyArrayListV3 list = new MyArrayListV3();

        // 마지막에 추가 O(1)
        list.add("a");
        list.add("b");
        list.add("c");
        list.add(1);
        list.add(2);
        System.out.println(list);

        // 원하는 위치에 추가
        System.out.println("addLast");
        list.add(3, "addLast");
        System.out.println(list);

        System.out.println("addFirst");
        list.add(0, "addFirst");
        System.out.println(list);

        // 삭제
        Object removed1 = list.remove(4); // remove last : O(n)
        System.out.println("removed(4) = " + removed1);
        System.out.println(list);

        Object removed2 = list.remove(0); // remove first : O(n)
        System.out.println("removed(0)  = " + removed2);
        System.out.println(list);
    }
}
