package lec36;

import java.util.*;

public class chess_board_solve {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int ans = chess_board(0, 0, n, n);
		System.out.println(ans);
		chess_board(0, 0, n, n, "");
		scn.close();
	}

	public static void chess_board(int cr, int cc, int er, int ec, String ans) {

		// Positive Base Case

		if (cr == er - 1 && cc == ec - 1) {
			System.out.print(ans + "{" + cr + "-" + cc + "} ");
			return;

		}

		// Negative Base case

		if (cr >= er || cc >= ec) {
			return;
		}

		// Knight
		chess_board(cr + 2, cc + 1, er, ec, ans + "{" + cr + "-" + cc + "}K");

		chess_board(cr + 1, cc + 2, er, ec, ans + "{" + cr + "-" + cc + "}K");

		// Rook

		if (cr == 0 || cc == 0 || cr == er - 1 || cc == ec - 1) {

			for (int moves = 1; moves < ec; moves++)

				chess_board(cr, cc + moves, er, ec, ans + "{" + cr + "-" + cc + "}R");

			for (int moves = 1; moves < er; moves++)

				chess_board(cr + moves, cc, er, ec, ans + "{" + cr + "-" + cc + "}R");

		}

		// Bishop

		if (cr == cc || cr + cc == er - 1) {

			for (int moves = 1; moves < er; moves++) {

				chess_board(cr + moves, cc + moves, er, ec, ans + "{" + cr + "-" + cc + "}B");

			}

		}

	}

	public static int chess_board(int cr, int cc, int er, int ec) {

		// Positive Base Case

		if (cr == er - 1 && cc == ec - 1) {

			return 1;

		}

		// Negative Base case

		if (cr >= er || cc >= ec) {

			return 0;

		}

		int cnt = 0;

		// Knight

		cnt += chess_board(cr + 2, cc + 1, er, ec);

		cnt += chess_board(cr + 1, cc + 2, er, ec);

		// Rook

		if (cr == 0 || cc == 0 || cr == er - 1 || cc == ec - 1) {

			for (int moves = 1; moves < ec; moves++)

				cnt += chess_board(cr, cc + moves, er, ec);

			for (int moves = 1; moves < er; moves++)

				cnt += chess_board(cr + moves, cc, er, ec);

		}

		// Bishop

		if (cr == cc || (cr + cc == er - 1)) {

			for (int moves = 1; moves < er; moves++) {

				cnt += chess_board(cr + moves, cc + moves, er, ec);

			}

		}

		return cnt;

	}
}