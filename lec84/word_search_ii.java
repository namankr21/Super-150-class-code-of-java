// package lec84;
// import java.util.*;
// public class word_search_ii {
    


//     public static void main(String[] args) {
//         char[][] board = { { 'o', 'a', 'a', 'n' },
// 				           { 'e', 't', 'a', 'e' }, 
// 				           { 'i', 'h', 'k', 'r' },
// 				           { 'i', 'f', 'l', 'v' } };




//     }

//     static List<String> li = new ArrayList<>();

//     public static void wordSearch(char[][]board,int r,int c,Node root){

//         if(r<0 || c<0 || r>=board.length || c>=board[0].length || !root.child.containsKey(board[r][c])) return;
//         char ch = board[r][c];
//         Node curr = root.child.get(ch);

//         if(curr.isTerminal!=null)
//         {
//             li.add(curr.isTerminal);
//             curr.isTerminal = null;
//         }

//         board[r][c] = '*';
//         wordSearch(board, r+1, c, curr);
//         wordSearch(board, r-1, c, curr);
//         wordSearch(board, r, c+1, curr);
//         wordSearch(board, r, c-1, curr);
//         board[r][c] = ch;


        
//     }


// }
