    public class Student {

        String name;
        int age;
        String department;

        public Student() {
            this("Unknown", 0, "Not Assigned");
        }

        public Student(String name) {
            this(name, 0, "Not Assigned");
        }

        public Student(String name, int age) {
            this(name, age, "Not Assigned");
        }

        public Student(String name, int age, String department) {
            this.name = name;
            this.age = age;
            this.department = department;
        }

        public void displayInfo() {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Department: " + department);
            System.out.println();
        }

        public static void main(String[] args) {
            System.out.println("Name: S.Ajay Kumar");
            System.out.println("Roll No: 202450370");

            Student s1 = new Student();
            Student s2 = new Student("Ajay");
            Student s3 = new Student("Kumar", 20);
            Student s4 = new Student("Rahul", 21, "Computer Science");

            s1.displayInfo();
            s2.displayInfo();
            s3.displayInfo();
            s4.displayInfo();
        }
    }
