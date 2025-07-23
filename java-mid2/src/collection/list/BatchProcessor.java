package collection.list;

public class BatchProcessor {

    // private final MyArrayList<Integer> list = new MyArrayList<>();
    // private final MyLinkedList<Integer> list = new MyLinkedList<>(); // 효율 좋은 코드로 변경

    // 직접 의존 관계를 줄임
    // MyList = new MyArrayList
    // MyList = new MyLinkedList
    private final MyList<Integer> list;

    public BatchProcessor(MyList<Integer> list) {
        this.list = list;
    }

    public void logic(int size) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(0, i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("크기: " + size + ", 계산 시간: " + (endTime - startTime) + "ms");
    }
}
