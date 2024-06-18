class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        List<int[]> list = new ArrayList<>();
        int maxProfit = 0;

        for (int i = 0; i < profit.length; i++) {
            int[] ex = {profit[i], difficulty[i]};
           list.add(ex);
        }
        Collections.sort(list,  new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                return Integer.compare(b[0], a[0]); 
            }
        });

        for (int i = 0; i < worker.length; i++) {
            for (int j = 0; j < list.size(); j++) {
                int[] ex = list.get(j);
                if (ex[1] <= worker[i]) {
                    maxProfit += ex[0];
                    break;
                }
            }
        }
    return maxProfit;
    }
}