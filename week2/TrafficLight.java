    import java.util.Scanner;

    public class TrafficLight {
        public static void main(String[] args) {
            System.out.println("Name : S. Ajay Kumar");
            System.out.println("Roll No : 2024503701");
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter traffic light color: ");
            String color = sc.nextLine().toLowerCase();

            switch (color) {
                case "red":
                    System.out.println("Stop");
                    break;
                case "yellow":
                    System.out.println("Ready to move");
                    break;
                case "green":
                    System.out.println("Go");
                    break;
                default:
                    System.out.println("Invalid color");
            }

            sc.close();
        }
    }
