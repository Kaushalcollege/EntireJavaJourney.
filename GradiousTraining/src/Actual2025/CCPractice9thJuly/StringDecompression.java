package Actual2025.CCPractice9thJuly;

public class StringDecompression {
    public static void main(String[] args) {
        String str = "a1b1c1d1";
        System.out.println(ExpandString(str));
    }

    public static String ExpandString (String compressed){
        String res = "";
      String current = "";
      char[] c = compressed.toCharArray();
      for (int i = 0; i < c.length; i++){
          if (Character.isLetter(c[i])) current += String.valueOf(c[i]);
          else{
              int n = Integer.parseInt(String.valueOf(c[i]));
              for (int j = 0; j < n; j++){
                  res += current;
              }
              current = "";
          }
      }
      return res;
    }

}
