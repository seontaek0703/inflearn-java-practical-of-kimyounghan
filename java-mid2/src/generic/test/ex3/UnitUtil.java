package generic.test.ex3;

import generic.test.ex3.unit.BioUnit;

public class UnitUtil extends BioUnit {
    public UnitUtil(String name, int hp) {
        super(name, hp);
    }

    public static <T extends BioUnit> T maxHp(T t1, T t2) {
        return t1.getHp() > t2.getHp() ? t1 : t2;
    }
}
