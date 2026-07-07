public class NestedIfExample {

    public static void main(String[] args) {

        int age = 20;
        boolean hasLicense = true;

        if (age >= 18) {

            if (hasLicense) {
                System.out.println("You can drive.");
            } else {
                System.out.println("You need a driving license.");
            }

        } else {
            System.out.println("You are not eligible to drive.");
        }

    }
}