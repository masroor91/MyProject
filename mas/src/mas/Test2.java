package mas;

class Small {
    public Small() {
        System.out.print("a ");
    }
}

class Small2  extends Small {
    public Small2() {
        System.out.print("b ");
    }
}

class Small3 extends Small2 {
    public Small3() {
        System.out.print("c ");
    }
}

public class Test2 {     
    public static void main(String args[]) {
        new Small3();
    }
}