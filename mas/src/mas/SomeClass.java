package mas;

public class SomeClass {
    private int value = 1;
    
    public int getValue() {
        return value;
    }
    
    public void changeVal(int value) {
        value = value;
    }

    public static void main(String args[]) {
        int a = 2;
        SomeClass c = new SomeClass();
        c.changeVal(a);
        System.out.print(c.getValue());
    }
}