import java.util.Iterator;
import java.util.Stack;
class Stacks{
  public static void main(String[]args){
    Stack<String> s1 = new Stack<String>();
    s1.push("J.K");
    s1.push("Nithin ");
    s1.push("Kumar");
    Iterator<String> itr = s1.iterator();
    while(itr.hasNext()){
      System.out.println(itr.next()+" ");
    }
    System.out.println();
    s1.pop();
  
  itr = s1.iterator();
  while(itr.hasNext()){
    System.out.print(itr.next()+" ");
  }
}
}