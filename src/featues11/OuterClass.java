package featues11;

public class OuterClass {
    private String secret = "Top Secret";

    // Nested Class
    class InnerClass {
        void revealSecret() {
            // Accessing private member of OuterClass
            System.out.println("Secret from OuterClass: " + secret);
        }
    }

    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass();
        inner.revealSecret();
    }
}

