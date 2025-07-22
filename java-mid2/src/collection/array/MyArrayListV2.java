package collection.array;

import java.util.Arrays;

public class MyArrayListV2 {

    // MyArrayList 생성시 주어지는 배열의 크기
    private static final int DEFAULT_CAPACITY = 5;

    // 다양한 데이터 타입을 보관하기 위해 Object 배열 사용
    private Object[] elementData;
    private int size = 0;

    public MyArrayListV2() {
        elementData = new Object[DEFAULT_CAPACITY];
    }

    // DEFAULT_CAPACITY 외 배열 크기를 지정하고 싶다면 아래 생성자 활용
    public MyArrayListV2(int initialCapacity) {
        elementData = new Object[initialCapacity];
    }

    // 리스트의 크기는 size를 사용
    public int size() {
        return size;
    }

    // 리스트에 데이터 추가
    public void add(Object e) {
        //코드 추가
        if (size == elementData.length) {
            grow();
        }
        elementData[size] = e;
        size++;
    }

    // 코드 추가
    private void grow() {
        int oldCapacity = elementData.length;
        int newCapacity = oldCapacity * 2;
        // 배열을 새로 만들고, 기존 배열을 새로운 배열에 복사
//        Object[] newArr = new Object[newCapacity];
//        for (int i = 0; i < elementData.length; i++) {
//            newArr[i] = elementData[i];
//        }
        // Arrays.copyOf(기존배열, 새로운길이), 새 길이의 배열 생성 후 기존 배열 값 복사
        elementData = Arrays.copyOf(elementData, newCapacity);

        // 기존 배열은 더 이상 참조하는 곳이 없으므로 GC의 대상이 됨
    }

    // 해당 인덱스 조회
    public Object get(int index) {
        return elementData[index];
    }

    // 인덱스에 항목 변경
    public Object set(int index, Object element) {
        Object oldValue = get(index);
        elementData[index] = element;
        return oldValue;
    }

    // 리스트 순차 탐색 후 인수와 동일한 데이터가 존재하는 인덱스의 위치 반환. 없으면 -1.
    public int indexOf(Object o) {
        for(int i = 0; i < size; i++) {
            if (o.equals(elementData[i])) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(elementData, size)) + " size = " + size + ", capacity = " + elementData.length;
    }


}
