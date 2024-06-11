class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] result = new int[1001];
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr1.length; i++) {
            result[arr1[i]]++;
        }
        for (int i = 0; i < arr2.length; i++) {
            while (result[arr2[i]] != 0) {
                list.add(arr2[i]);
                result[arr2[i]]--;
            }
        }
        for (int i = 0; i < result.length; i++) {
            while (result[i] != 0) {
                list.add(i);
                result[i]--;
            }
        }
        int[] array = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }
        return array;
    }
}