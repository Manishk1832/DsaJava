package Heap_and_HashMap;

import java.util.ArrayList;

public class Heap {
    ArrayList<Integer>AL;
    public Heap(){
        AL = new ArrayList<>();
    }
    public  int size(){
        return this.AL.size();
    }
    public boolean isEmpty(){
        return AL.size()==0;
    }
    public int peek(){
        return AL.get(0);

    }
    public void  add(int i ){
        AL.add(i);
        upheapify(AL.size()-1);
    }
    public void upheapify(int val){
        int par = (val-1)/2;
        if(AL.get(val)<AL.get(par)){
            swap(val,par);
            upheapify(par);
        }
    }
    public void swap(int i , int j){
        int temp = AL.get(i);
        AL.set(j,AL.get(j));
        AL.set(j,temp);
    }
    public void display(){
        System.out.println(AL);
    }
    public int remove(int parent){
        int L = parent*2+1;
        int R = parent*2+2;
        int min_idx = parent;
        if(L<AL.size() && AL.get(min_idx)>AL.get(L)){
            min_idx = L;
        }
        if(R<AL.size() && AL.get(min_idx)>AL.get(R)){
            min_idx = R;
        }
        if (parent!=min_idx){
            swap(parent,min_idx);
            downHeapify(min_idx);
        }
     return 0;
    }
    public  void downHeapify(int parent){
        //int ele = AL.get(0);
        int temp = AL.get(0);
        int Last = AL.get(AL.size()-1);
        AL.set(0,Last);
        AL.remove(AL.size()-1);
        downHeapify(0);
        //return temp;
    }

}
