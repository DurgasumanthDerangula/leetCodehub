class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {

        int[] arr = new int[n + 1];

        for (int[] booking : bookings) {

            int first = booking[0];
            int last = booking[1];
            int seats = booking[2];

            arr[first - 1] += seats;
            arr[last] -= seats;
        }

        int[] result = new int[n];
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i];
            result[i] = sum;
        }

        return result;
    }
}