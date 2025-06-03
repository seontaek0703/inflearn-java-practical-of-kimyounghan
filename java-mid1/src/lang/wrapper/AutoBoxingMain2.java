package lang.wrapper;

public class AutoBoxingMain2 {

    public static void main(String[] args) {
        // Primitive -> Wrapper
        int value = 7;
        Integer boxedValue = value; // autoboxing

        // Wrapper -> Primitive
        int unboxedValue = boxedValue; // autounboxing

        System.out.println("boxedValue = " + boxedValue);
        System.out.println("unboxedValue = " + unboxedValue);
    }

}
