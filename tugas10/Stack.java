package tugas10;

public class Stack extends AbstractStack {
    public Stack(int capacity) {
        super(capacity);
    }

    public void displayStack(String s) {
        System.out.println(s);
        System.out.println("Stack (bottom-->top):");
        for (int i = 0; i < size(); i++) {
            System.out.println(peekN(i));
            System.out.println(' ');
        }
        System.out.println("");
    }

    public int peekN(int n) {
        return arr[n];
    }
}