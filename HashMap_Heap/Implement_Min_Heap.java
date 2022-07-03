import java.util.ArrayList;
import java.util.*;

class Min_Heap {
    
    
  public static class PriorityQueue {
     ArrayList<Integer> data;

    public PriorityQueue() {
      data = new ArrayList<>();
    }

    public void add(int val) {
      // write your code here
      data.add(val);
      upheapify(data.size() - 1);
    }

    private void upheapify(int idx){
      if(idx==0){
        return;
      }
      int parent = (idx - 1) / 2;
      if(data.get(idx) < data.get(parent)){
        swap(idx,parent);
        upheapify(parent);
      }
    }

    private void swap(int i,int j){
      int ith = data.get(i);
      int jth = data.get(j);
      data.set(i,jth);
      data.set(j,ith);
    }

    public int remove() {
      // write your code here
      if(this.size()==0){
        System.out.println("underflow");
        return -1;
      }
      swap(0,data.size()-1);
      int val = data.remove(data.size() - 1);
      downheapify(0);
      return val;


    }

    private void downheapify(int parent_idx){
      int min_idx = parent_idx;
      int left_child_idx = 2 * parent_idx + 1;
      if(left_child_idx < data.size() && data.get(left_child_idx) < data.get(min_idx)){
        min_idx = left_child_idx;
      }

      int right_child_idx = 2 * parent_idx + 2;
      if(right_child_idx < data.size() && data.get(right_child_idx) < data.get(min_idx)){
        min_idx = right_child_idx;
      }

      if(min_idx !=parent_idx){
        swap(min_idx,parent_idx);
        downheapify(min_idx);
      }
      
    }

    public int peek() {
      // write your code here
      if(this.size()==0){
        System.out.println("underflow");
        return -1;
      }

      return data.get(0);
    }

    public int size() {
      // write your code here
      return data.size();
    }
  }
    
    
   public static void main(String args[]){
        PriorityQueue pq = new PriorityQueue();
        pq.add(10);
        pq.add(20);
        pq.add(30);
        pq.add(35);
        pq.add(40);
        pq.add(5);
        pq.add(3);

        System.out.println(pq.peek());
        System.out.println(pq.size());
        System.out.println(pq.remove());


    }
}
