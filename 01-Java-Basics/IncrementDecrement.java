public class IncrementDecrement {

    public static void main(String[] args) {

        int a = 10;

        System.out.println("Original Value : " + a);

        System.out.println("Post Increment : " + (a++));
        System.out.println("Value after Post Increment : " + a);

        System.out.println("Pre Increment : " + (++a));

        System.out.println("Post Decrement : " + (a--));
        System.out.println("Value after Post Decrement : " + a);

        System.out.println("Pre Decrement : " + (--a));
    }
}