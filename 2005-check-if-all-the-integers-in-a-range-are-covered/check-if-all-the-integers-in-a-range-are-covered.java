class Solution {
    public boolean isCovered(int[][] ranges, int left, int right) {

        int[] arr = new int[52];

        for (int[] range : ranges) {
            int start = range[0];
            int end = range[1];

            arr[start]++;
            arr[end + 1]--;
        }

        int count = 0;

        for (int i = 1; i <= 50; i++) {
            count += arr[i];

            if (i >= left && i <= right) {
                if (count == 0) {
                    return false;
                }
            }
        }

        return true;
    }
}