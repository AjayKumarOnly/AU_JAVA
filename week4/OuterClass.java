public class OuterClass {

    private class PrivateInner {
        void showMessage() {
            System.out.println("Hello from PrivateInner class");
        }
    }

    public class PublicInner {
        public void showMessage() {
            System.out.println("Hello from PublicInner class");
        }
    }

    public void accessPrivateInner() {
        PrivateInner inner = new PrivateInner();
        inner.showMessage();
    }

    public static void main(String[] args) {
        System.out.println("Name : S.Ajay Kumar \nRoll No : 202450370");
        OuterClass outer = new OuterClass();

        outer.accessPrivateInner();

        PublicInner publicInner = outer.new PublicInner();
        publicInner.showMessage();
    }
}
