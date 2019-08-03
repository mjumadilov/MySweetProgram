package r191;

public class Quiz {
    void method() {
        try {
            guru();
            return;
        } finally {
            System.out.println("finally 1");
        }
    }
    void guru() {
        System.out.println("guru");
        throw new StackOverflowError();
    }
    public static void main(String args[]) {
        Quiz var = new Quiz();
        var.method();
    }
}
