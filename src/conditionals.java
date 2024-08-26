public class conditionals{
    public static void main(String[] args) {
        /*
        syntax of if statements:
        if (boolean expression T or F)
            {
                //body.
            }
        else
        {
            //do this.
        }
         */
        int salary =  100000;
        if (salary > 25000)
        {
            salary += 4;
        }
        else
        {
            salary += 2;
        }
        System.out.println(salary);
    }
}