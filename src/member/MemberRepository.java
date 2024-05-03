package member;

import java.util.HashMap;

public class MemberRepository {

    private HashMap<Integer, String> db;

    MemberRepository() {
        this.db = new HashMap<>();

        db.put(1, "work1");
        db.put(2, "work2");
        db.put(3, "work3");
        db.put(4, "work4");
    }

    public String get1() {
        return db.get(1);
    }

    public String get2() {
        return db.get(2);
    }

    public String get3() {
        return db.get(3);
    }

    public String get4() {
        return db.get(4);
    }
}
