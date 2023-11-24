package lec60;
import java.util.*;

public class heap {

    // heap : it ia a complete binary tree;
    // cbt : last level ko chor ke complete binary tree and last level left to right filled hona chaiye(not complete defination)
    // Prioroty queue : elements are poped with priority order; 
    
    // min-Heap parent.data < child.data
    // max-Heap parent.data > child.data

    // Heap pdhna kyu h?
    // it is better than array can check complexities wrt time in sorted/unsorted array
    // we use it where we want to get elements by thr priority!!

    // lci = 2*pi + 1;
    // rci = 2*pi +2;
    // pi = (ci-1)/2;
    
    // Methods

    // 1. upheapify();

    private ArrayList<Integer> list;

    public heap(){
        list = new ArrayList<>();

    }

    public void add(int item) {
        list.add(item);
        upheapify(list.size()-1);
    }
    private void upheapify(int ci) {

        int pi = (ci-1)/2;

        if(list.get(pi)>list.get(ci))
        {
            swap(pi,ci);
        }

    }

    private void swap(int pi, int ci) {
        int temp = list.get(pi);
        list.set(pi,list.get(ci));
        list.set(ci,temp);
    }

    public int remove(){

        int rv = list.get(0);
        
        swap(0, list.size()-1);

        list.remove(list.size()-1);

        downheapify(0);

        return rv;
    }

    private void downheapify(int pi) {
        int lci = 2*pi + 1;
        int rci = 2*pi +2;

        int mini = pi;
        if(lci<list.size() && list.get(lci)<list.get(mini)) mini = lci;
        if(rci<list.size() &&list.get(rci)<list.get(mini)) mini = rci;
        
        if(mini!=pi)
        {
            swap(pi, mini);
            downheapify(pi);
        }
        

    }

    public int get(){
        return list.get(0);
    }

    public void display(){
        System.out.println(list);
    }






        





}
