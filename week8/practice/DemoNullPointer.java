public class DemoNullPointer {
    public static void main(String[] args) {
        System.out.println("Name : Ajay Kumar ");
        System.out.println("Roll no : 2024503701");
        String name=null;
        int size;
        try{
            for (int i =0; i<= name.length();i++){
                System.out.println(i);
            }
        }
        catch(NullPointerException e){
            System.out.println(e);
        }
    }
}
