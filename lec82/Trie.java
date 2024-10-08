package lec82;
import java.util.*;
public class Trie {
    class Node{
        char data;
        boolean isTerminal;
        int numofterminal;
        HashMap<Character,Node> child = new HashMap<>();
    }

    private Node root;

    public Trie()
    {
        Node nn = new Node();
        nn.data = '*';
        root = nn;
    }

    public void insert(String word) {        
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if(curr.child.containsKey(ch))
            { 
                curr = curr.child.get(ch);
                curr.numofterminal++;
            } else {
                Node nn = new Node();
                nn.data = ch;
                curr.child.put(ch,nn);
                curr = nn;
                curr.numofterminal++;
            }
        }

        curr.isTerminal = true;
    }

    public int search(String word)
    {
        Node curr = root;
        for(int i =0;i<word.length();i++)
        {
            char ch = word.charAt(i);
            if(curr.child.containsKey(ch))
            {
                curr = curr.child.get(ch);
            }
            else return 0;
        }

        return curr.numofterminal;

    }

    public boolean startsWith(String prefix)
    {
        Node curr = root;
        for(int i =0;i<prefix.length();i++)
        {
            char ch = prefix.charAt(i);
            if(curr.child.containsKey(ch))
            {
                curr = curr.child.get(ch);
            }
            else return false;
        }

        return true;
        
    }


}
