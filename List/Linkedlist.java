import java.util.LinkedList;
class Linkedlist{
  public static void main(String[]args){
    LinkedList<Integer> l1 = new LinkedList<Integer>();
    for(int i=1;i<=5;i++){
      l1.add(i);
    }
    System.out.println(l1);
    l1.remove(3);
    System.out.println(l1);
    for(int i =0;i<l1.size();i++){
      System.out.print(l1.get(i)+" ");
    }
  }
}