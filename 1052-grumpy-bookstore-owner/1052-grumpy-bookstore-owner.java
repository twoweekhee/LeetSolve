class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int satisfied = 0;
        int max = 0;
        int index = 0;
        int counter = 0;

        for (int i = 0; i < customers.length; i++) {
            if (grumpy[i] == 0) {
                satisfied += customers[i];
            }
        }

        for (int i = 0; i < customers.length-minutes+1; i++) {
            int current = 0;
            for (int j = i; j < i+ minutes; j++) {
                if (grumpy[j] == 1) {
                    current += customers[j];
                }
            }
            if (max < current) {
                index = i;
            }
            max = Math.max(max, current);
        }
        for (int i = index; i < index + minutes; i++) {
            if (grumpy[i] == 1) {
                satisfied += customers[i];
            }
        }

        return satisfied;
    }
}
