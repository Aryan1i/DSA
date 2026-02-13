//Problem

/*Implement Generic Heap*/

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class GenericHeap {
    public static class PriorityGenericQueue<K>{
        ArrayList<K> data;
        private Comparator<K> comp;
        int size = 0;

        public PriorityGenericQueue(Comparator<K> comp) {
            this.comp = comp;
            data = new ArrayList<>();
            size=0;
        }

        public PriorityGenericQueue(){
            data = new ArrayList<>();
            size = 0;
            this.comp = null;
        }

        public PriorityGenericQueue(K[] arr){       // O(n)
            data = new ArrayList<>();
            size = 0;
            for(K val : arr){
                data.add(val);
            }

            for(int i = arr.length / 2 - 1; i >= 0; i++){
                downHeapify(i);
            }
        }

        private boolean isSmaller(int i,int j){
            if(comp == null){
                Comparable ith = (Comparable) data.get(i);
                Comparable jth = (Comparable) data.get(j);

                if(ith.compareTo(jth) < 0){
                    return true;
                }else{
                    return false;
                }
            } else {
                K ith = data.get(i);
                K jth = data.get(j);
                if(comp.compare(ith,jth) < 0){
                    return true;
                }else{
                    return false;
                }
            }
           
        }

        public void downHeapify(int idx){
            int mini = idx;

            int li = idx * 2 + 1;

            if(li < data.size() && isSmaller(li,mini)==true){
                mini = li;
            }

            int ri = idx * 2 + 2;
            if(ri < data.size() && isSmaller(ri,mini) == true){
                mini = ri;
            }

            if(mini != idx){
                swap(mini,idx);
                downHeapify(mini);
            }
        }

        public void add(K val){
            data.add(val);
            upHeapify(data.size()-1);
            size++;
        }

        public void upHeapify(int idx){
            if(idx == 0) return;
            int parent = (idx - 1) / 2 ;

            if(isSmaller(idx,parent)==true) {
                swap(idx,parent);
                upHeapify(parent);
            }
        }

        public K remove(){
            if(data.size() == 0){
                System.out.println("Underflow");
                return null;
            }
            K val = data.get(0);
            swap(0,data.size() - 1);
            data.remove(data.size() - 1);
            downHeapify(0);
            size--;
            return val;
        }

        public K peek(){
            if(data.size() == 0){
                System.out.println("Underflow");
                return null;
            } else {
                return data.get(0);
            }
        }

        public int size(){
            return size;
        }

        private void swap(int i, int j){
            K ith = data.get(i);
            K jth = data.get(j);
            data.set(i,jth);
            data.set(j,ith);
        }
    }

    static class StudentHtComparator implements Comparator <Student>{
        public int compare(Student s1,Student s2){
            return s1.ht - s2.ht;
        }
    }

    static class StudentWtComparator implements Comparator <Student>{
        public int compare(Student s1,Student s2){
            return s1.wt - s2.wt;
        }
    }

    static class Student implements Comparable<Student> {
        int rno;
        int ht;
        int wt;

        Student(int rno, int ht, int wt) {
            this.rno = rno;
            this.ht = ht;
            this.wt = wt;
        }

    
        public int compareTo(Student other) {
            return this.rno - other.rno;  
        }

        public String toString(){
            return "Rno = " + this.rno + ",Ht = " + this.ht + " , wt = " + this.wt;
        }
    }


    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        PriorityGenericQueue<Student> pq = new PriorityGenericQueue<>(new StudentWtComparator());

        pq.add(new Student(10 , 180, 81));
        pq.add(new Student(2 , 185, 85));
        pq.add(new Student(12 , 170, 84));
        pq.add(new Student(18 , 179,88));
        pq.add(new Student(7 , 182, 82));

        while (pq.size()>0) {
            System.out.println(pq.peek());
            pq.remove();
        }
    }
}
