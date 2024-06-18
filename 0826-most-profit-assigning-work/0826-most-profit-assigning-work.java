class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        Map<Integer, Integer> map = new HashMap<>();
        int maxProfit = 0;

        for (int i = 0; i < profit.length; i++) {
            map.put(profit[i], difficulty[i]);
        }
        List<Integer> profitList = new ArrayList<>(map.keySet());
        Collections.sort(profitList, Collections.reverseOrder());

        for (int i = 0; i < worker.length; i++) {
            for(int p : profitList){
                if (map.get(p) <= worker[i]){
                    maxProfit = maxProfit + p;
                    break;
                }
            }
        }
    return maxProfit;
    }
}