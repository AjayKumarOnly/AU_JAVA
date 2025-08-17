public class StringMethodDemo {

    public static void main(String[] args) {
        System.out.println("Name : S. Ajay Kumar");
        System.out.println("Roll No : 2024503701");

        String s1 = "Welcome to Java";
        String s2 = s1;
        String s3 = new String("Welcome to Java");
        String s4 = s1.intern();

        System.out.println("String Inputs:");
        System.out.println("s1: \"" + s1 + "\"");
        System.out.println("s2: \"" + s2 + "\"");
        System.out.println("s3: \"" + s3 + "\"");
        System.out.println("s4: \"" + s4 + "\"");
        System.out.println("------------------------------------------");

        System.out.println("Object Reference Comparisons (==):");
        System.out.println("s1 == s2: " + (s1 == s2));
        System.out.println("s1 == s3: " + (s1 == s3));
        System.out.println("s1 == s4: " + (s1 == s4));
        System.out.println("s2 == s3: " + (s2 == s3));
        System.out.println("s2 == s4: " + (s2 == s4));
        System.out.println("s3 == s4: " + (s3 == s4));
        System.out.println("------------------------------------------");

        System.out.println("Content Comparisons (equals()):");
        System.out.println("s1.equals(s2): " + s1.equals(s2));
        System.out.println("s1.equals(s3): " + s1.equals(s3));
        System.out.println("s1.equals(s4): " + s1.equals(s4));
        System.out.println("s1.equalsIgnoreCase(s2): " + s1.equalsIgnoreCase(s2));
        System.out.println("s2.equals(s3): " + s2.equals(s3));
        System.out.println("------------------------------------------");

        System.out.println("Lexicographical Comparison (compareTo()):");
        System.out.println("s1.compareTo(s2): " + s1.compareTo(s2));
        System.out.println("s2.compareTo(s3): " + s2.compareTo(s3));
        System.out.println("------------------------------------------");

        System.out.println("Substring Methods:");
        System.out.println("s1.substring(3): \"" + s1.substring(3) + "\"");
        System.out.println("s1.substring(1, 3): \"" + s1.substring(1, 3) + "\"");
        System.out.println("------------------------------------------");

        System.out.println("Prefix/Suffix Checks:");
        System.out.println("s1.startsWith(\"Wel\"): " + s1.startsWith("Wel"));
        System.out.println("s1.endsWith(\"Java\"): " + s1.endsWith("Java"));
        System.out.println("------------------------------------------");

        System.out.println("Case Conversion:");
        System.out.println("s1.toLowerCase(): \"" + s1.toLowerCase() + "\"");
        System.out.println("s1.toUpperCase(): \"" + s1.toUpperCase() + "\"");
        System.out.println("------------------------------------------");

        System.out.println("Trim Method:");
        System.out.println("\" Hi\".trim(): \"" + " Hi".trim() + "\"");
        System.out.println("------------------------------------------");

        System.out.println("Replace Methods:");
        System.out.println("s1.replace('o', 'O'): \"" + s1.replace('o', 'O') + "\"");
        System.out.println("s1.replaceAll(\"o\", \"O\"): \"" + s1.replaceAll("o", "O") + "\"");
        System.out.println("s1.replaceFirst(\"o\", \"O\"): \"" + s1.replaceFirst("o", "O") + "\"");
        System.out.println("------------------------------------------");

        System.out.println("Split Methods:");
        String[] splitByO = s1.split("o");
        System.out.print("s1.split(\"o\"): [");
        for (String part : splitByO) {
            System.out.print("\"" + part + "\", ");
        }
        System.out.println("]");

        String[] splitByOWithLimit = s1.split("o", 4);
        System.out.print("s1.split(\"o\", 4): [");
        for (String part : splitByOWithLimit) {
            System.out.print("\"" + part + "\", ");
        }
        System.out.println("]");
        System.out.println("------------------------------------------");

        System.out.println("To Character Array:");
        char[] charArray = s1.toCharArray();
        System.out.print("s1.toCharArray(): [");
        for (char c : charArray) {
            System.out.print("'" + c + "', ");
        }
        System.out.println("]");
        System.out.println("------------------------------------------");

        System.out.println("Code Point At Index:");
        System.out.println("s1.codePointAt(0): " + s1.codePointAt(0));
        System.out.println("------------------------------------------");

        System.out.println("Contains Method:");
        System.out.println("s1.contains(\"or\"): " + s1.contains("or"));
        System.out.println("------------------------------------------");

        System.out.println("Identity Hash Codes:");
        System.out.println("System.identityHashCode(s1): " + System.identityHashCode(s1));
        System.out.println("System.identityHashCode(s2): " + System.identityHashCode(s2));
        System.out.println("System.identityHashCode(s3): " + System.identityHashCode(s3));
        System.out.println("System.identityHashCode(s4): " + System.identityHashCode(s4));
        System.out.println("------------------------------------------");
    }
}
