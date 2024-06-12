import java.util.*;

class Solution {
    public void sortColors(int[] nums) {
        int zeroCounter = 0;
        int oneCounter = 0;
        int twoCounter = 0;
        for (int i = 0; i < nums.length; i++) {
            switch (nums[i]){
                case 0: zeroCounter++;
                        break;
                case 1: oneCounter++;
                        break;
                case 2: twoCounter++;
                        break;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if(zeroCounter != 0){
                nums[i] = 0;
                zeroCounter--;
            }else if(oneCounter != 0){
                nums[i] = 1;
                oneCounter--;
            }else if (twoCounter != 0){
                nums[i] = 2;
                twoCounter--;
            }
        }
    }
}