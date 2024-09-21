public class breakstmt {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            if (i> 10)
            {
                break;
            }
            System.out.println(i);
        }
    }
}
// break statement forces the console to break the iteration without executing the rest
// of the code within the for loop. A great way to stop iterations with just a statement.

// The break statement has the power of the manipulate the entire loop if once executed.