public class IntStackRunner {
   public static void main(String[] args) {
        IntStack bob = new IntStack();

        bob.push(5);
        bob.push(7);
        bob.push(9);
        System.out.println(bob.toString());
        System.out.println(bob.isEmpty());
        System.out.println(bob.pop());
        System.out.println(bob.peek());
        System.out.println(bob.pop());
        System.out.println(bob.pop());
        System.out.println(bob.isEmpty());
        System.out.println(bob.toString());

    }
}
