package lec63;
import java.util.*;
public class Hashmap<K,V> {
    class Node{
        K key;
        V val;
        Node next;
    }

    ArrayList<Node> ll;
    public Hashmap(int n){
        ll = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            ll.add(null);            
        }
    }

    public Hashmap(){
        this(4);
    }

    @Override
	public String toString() {
		String s = "{";
		for (Node node : ll) {
			while (node != null) {
				s = s + node.key + "=" + node.val + ", ";
				node = node.next;
			}

		}
		s = s + "}";
		return s;

	}

    public int hashfun(K key)
    {
        int bktnum = key.hashCode() % ll.size();
        if(bktnum<0) bktnum+=ll.size();

        return bktnum;
    }

    public void put(K key, V val) {
        int idx = hashfun(key);
        Node temp = ll.get(idx);
        while(temp!=null)
        {
            if(temp.key.equals(key))
            {
                temp.val = val;
                return;
            }
            temp = temp.next;
        }        
        Node nn = new Node();
        nn.val = val;
        nn.key = key;
        temp = ll.get(idx);
        nn.next = temp;
        ll.set(idx,nn);

    }

    public V get(K key)
    {
        int idx = hashfun(key);
        Node temp = ll.get(idx);
        while(temp!=null)
        {
            if(temp.key.equals(key))
            {
                return temp.val;
            }
            temp = temp.next;
        }

        return null;
    }

    public boolean containsKey(K key)
    {
        int idx = hashfun(key);
        Node temp = ll.get(idx);
        while(temp!=null)
        {
            if(temp.key.equals(key))
            {
                
                return true;
            }
            temp = temp.next;
        }

        return false;
    }
    

    public V remove(K key)
    {
        int idx = hashfun(key);
        Node curr = ll.get(idx);
        Node prev = null;
        while(curr!=null)
        {
            if(curr.key.equals(key))
            {
                break;
            }
            curr = curr.next;
        }
        if(curr==null) return null;
        else if(prev == null)
        {
            ll.set(idx,curr.next);
            curr.next = null;

        } 
        
        return curr.val;

    }



}
