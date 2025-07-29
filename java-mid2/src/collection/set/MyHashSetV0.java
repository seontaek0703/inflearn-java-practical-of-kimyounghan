package collection.set;

import java.util.Arrays;

public class MyHashSetV0 {

    // 자료들을 저장할 공간
    private int[] elementData = new int[10];

    // 공간에 저장된 요소의 크기
    private int size = 0;

    // 공간에 요소 추가 O(n)
    public boolean add(int value) {
        // 중복 불허
        if (contains(value)) {
            return false;
        }

        elementData[size] = value;
        size++;
        return true;
    }

    // 중복 여부 로직 O(n)
    public boolean contains(int value) {
        for (int data : elementData) {
            if (data == value) {
                return true;
            }
        }
        return false;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "MyHashSetV0{" +
                "elementData=" + Arrays.toString(Arrays.copyOf(elementData, size)) + // 굳이 10개 요소 모두 반영하지 않고 존재하는 값들만 출력하기 위함
                ", size=" + size +
                '}';
    }
}
