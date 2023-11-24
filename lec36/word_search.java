package lec36;

public class word_search {
    public static void main(String[] args) {
        char[][] maze = { { 'A', 'B', 'C', 'E' },
                { 'S', 'F', 'C', 'S' },
                { 'A', 'D', 'E', 'E' } };
        String word = "ABCCED";

        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze[0].length; j++) {
                if (maze[i][j] == word.charAt(0)) {
                    boolean a = search(maze, i, j, word, 0);
                    if(a)
                    {
                        System.out.println(a);
                        return;
                    }
                }
            }
        }

        System.out.println(false + " 1");
    }

    public static boolean search(char[][] maze, int cr, int cc, String word, int idx) {
        int[] r = { -1, 1, 0, 0 };
        int[] c = { 0, 0, 1, -1 };

        // Base Case
        if (idx == word.length())
            return true;
        if (cc < 0 || cc >= maze[0].length || cr < 0 || cr >= maze.length || maze[cr][cc] != word.charAt(idx)) {

            
            return false;
        }

        maze[cr][cc] = '*';
        // boolean ans = false;

        // Recursion
        for (int i = 0; i < r.length; i++) {
            boolean ans = search(maze, cr + r[i], cc + c[i], word, idx + 1);
            // System.out.println(cr + " " + cc + " " + ans);
            if (ans==true)
                return ans;
        }

        // Backtrack
        maze[cr][cc] = word.charAt(idx);
        return false;

    }
}