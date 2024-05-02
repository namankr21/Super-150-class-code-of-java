package lec84;

import java.util.Arrays;

public class Maximum_XOR_With_an_Element_From_Array {
    static class Node
    {
        Node zero;
        Node one;
    }

    public static void add(Node root,int val)
    {
        Node curr = root;
        for (int i = 31; i >=0; i--)
        {
            int bit = (val & (1<<i));
            
            if(bit==0)
            {
                if(curr.zero!=null)
                curr = curr.zero;
                else{
                    Node nn = new Node();
                    curr.zero = nn;
                    curr = nn;
                }
            }
            else
            {
                if(curr.one!=null)
                {
                    curr = curr.one;
                }
                else{
                    Node nn = new Node();
                    curr.one = nn;
                    curr = nn; 
                }
            }
            
        }

    }

    static class Pair{
        int xi ,mi;
        public Pair(int xi,int mi)
        {
            this.xi = xi;
            this.mi = mi;
        }
    }

    public static void main(String[] args) {
        int[] arr = {5,2,4,6,6,3};
        Arrays.sort(arr);

        // int[][]qr = {{12,4},{8,1},{6,3}};

        


    }




}
