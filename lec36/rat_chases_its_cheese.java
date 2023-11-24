package lec36;

import java.util.*;

public class rat_chases_its_cheese {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        char [][] maze = new char[n][m];
        for (int i = 0; i < maze.length; i++) {
            String s = sc.next();
            for (int j = 0; j <s.length(); j++) {
                maze[i][j] = s.charAt(j);
            }
        }
        sc.close();
        int [][]arr = new int[n][m];

        ratpath(maze,arr, 0, 0);

        if(flag==false)
        System.out.println("NO PATH FOUND");
    }
static boolean flag = false;
    public static void ratpath(char[][]maze,int[][]arr,int cr,int cc) {
        if(cr==maze.length-1 && cc==maze[0].length-1&&maze[cr][cc]!='X')
        {
            arr[cr][cc] = 1;
            flag = true;
            for (int i = 0; i < maze.length; i++) {
                for (int j = 0; j <maze[0].length; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        }
        if(cr<0||cc<0||cr>=maze.length||cc>=maze[0].length||maze[cr][cc]=='X')
        {
            return;
        }
        maze[cr][cc] = 'X';
        arr[cr][cc] = 1;
        ratpath(maze,arr, cr-1, cc); //up
        ratpath(maze,arr,cr+1, cc);//down
        ratpath(maze,arr,cr, cc+1);//right
        ratpath(maze,arr, cr, cc-1);//left
        maze[cr][cc] = 'O';
    }
}
// OXOO
// OOOX
// XOXO
// XOOX
// XXOO