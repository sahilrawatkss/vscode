package dsa.array;

public class SeatArrange {
    public static void main(String[] args) {
        int seats[] = {0, 0, 1, 0, 0, 0, 1};
        int n = 2;
        System.out.println(is_possible_to_get_seats(n,seats.length,seats));
    }
        public static boolean is_possible_to_get_seats(int n, int m, int[] seats) {
            int flag = 0;
            int count = 0;
            if (n == 1 && m == 1 && seats[0] == 0) {
                return true;
            }
            int sv = -1;
            for (int i = 0; i < m - 1; i++) {
                if (seats[i] == 1) {
                    flag = 1;
                }
                if (seats[i] == 0 && seats[i + 1] == 0) {
                    if (flag == 1) {
                        flag = 0;
                        continue;
                    }
                    count++;
                    sv = i;
                    i++;

                }
            }
            if (sv != m - 2 && seats[m - 1] == 0 && seats[m - 2] == 0 && m != 2) {
                count++;
            }
            if (count >= n) {
                return true;
            } else {
                return false;
            }
        }
}
