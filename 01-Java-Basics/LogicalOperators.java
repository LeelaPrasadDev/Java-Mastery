public class LogicalOperators {

    public static void main(String[] args) {

        int age = 23;
        boolean hasLicense = true;

        System.out.println("AND (&&)");
        System.out.println(age >= 18 && hasLicense);

        System.out.println();

        System.out.println("OR (||)");
        System.out.println(age < 18 || hasLicense);

        System.out.println();

        System.out.println("NOT (!)");
        System.out.println(!hasLicense);
    }
}