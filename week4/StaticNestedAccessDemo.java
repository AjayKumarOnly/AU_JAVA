public class StaticNestedAccessDemo {

    public static class PublicNested {
        public void show() {
            System.out.println("Public static nested class accessed from outside.");
        }
    }

    private static class PrivateNested {
        void secret() {
            System.out.println("Private static nested class accessed internally.");
        }
    }

    void accessPrivateNested() {
        PrivateNested obj = new PrivateNested();
        obj.secret();
    }

    public static void main(String[] args) {
        System.out.println("Name : S.Ajay Kumar \nRoll No : 202450370");
        StaticNestedAccessDemo.PublicNested publicObj = new StaticNestedAccessDemo.PublicNested();
        publicObj.show();

        StaticNestedAccessDemo outer = new StaticNestedAccessDemo();
        outer.accessPrivateNested();


    }
}
