public class continuestmt {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            if (i >= 5 && i <= 15)
            {
                continue;
            }
            System.out.println(i);
        }
    }
}
// continue statement moves on with the iteration without executing the rest
// of the code within the for loop. A great way to skip iterations with just a statement.

// The continue statement has the power of the manipulate the entire loop if once executed.