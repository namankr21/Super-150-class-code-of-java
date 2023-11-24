package lec37;

public class n_queen_wrt_1D_box {
    public static void main(String[] args) {
        com_1d(0, 2, "", 4);

    }

    // qtp = queen to place
    public static void com_1d(int col, int qtp, String path, int total_col) {
        if (qtp == 0) {
            System.out.print(path + " ");
            return;
        }

        if (col == total_col)
            return;

        com_1d(col + 1, qtp - 1, path + "q" + col, total_col);
        com_1d(col + 1, qtp, path, total_col);

    }
}
