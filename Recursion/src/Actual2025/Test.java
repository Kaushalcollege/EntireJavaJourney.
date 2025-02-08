package Actual2025;

public class Test {
    public static int SubarrayProductLessThanK (int nums[],int k) {  // Don't change the number of parameters
        // Please write your return statement here
        if(k<= 1){
            return 0;
        }
        int mul=1,count=0;
        for(int i=1;i<nums.length;i++){
            mul=1;
            for(int j=0;j<=i;j++){
                mul*=nums[j];
            }
            if(mul<k){
                count++;
            }else if(mul>k){
                return 0;
            }

            for(int j=i;j<nums.length;j++){
                mul=mul*nums[j]/nums[j-i];
                if(mul<k){
                    count++;
                }
                mul=1;
            }
        }
        return count;
    }

    //Please don't modify the below code

    public static void main (String[] args) {
        String numsStr = args[0];
        String[] numsStrArr;
        if(numsStr.equals("[]")){
            numsStrArr = new String[0];
        }
        else {
            numsStrArr = numsStr.replaceAll("[\\[\\]\"\\s]", "").split(",");
        }

        int[] nums = new int[numsStrArr.length];

        for (int i = 0; i < numsStrArr.length; i++) {
            nums[i] = Integer.parseInt(numsStrArr[i].trim());
        }

        System.out.print(SubarrayProductLessThanK(nums,Integer.parseInt(args[1])));
    }
}