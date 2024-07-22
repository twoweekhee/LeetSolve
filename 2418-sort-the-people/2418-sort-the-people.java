class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int n = names.length;
        String currString;
        int index = 0;
        for (int i = 0; i < n; i++) {
            int box = heights[i];
            for (int j = i; j < n; j++) {
                if (box <= heights[j]){
                    box = heights[j];
                    index = j;
                }
            }
            int currInt = heights[index];
            heights[index] = heights[i];
            heights[i] = currInt;

            currString = names[index];
            names[index] = names[i];
            names[i] = currString;

            System.out.println(heights[i]);
        }
        return names;
    }
}