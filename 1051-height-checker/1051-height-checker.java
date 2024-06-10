class Solution {
    public int heightChecker(int[] heights) {
        int counter = 0;
        List<Integer> list = new ArrayList<>();
        for (int height : heights) {
            list.add(height);
        }
        Collections.sort(list);

        for (int i = 0; i < heights.length; i++) {
            if(heights[i] != list.get(i)){
                counter++;
            }

        } 
        return counter;
    }
}