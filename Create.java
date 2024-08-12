import java.util.Iterator;
import java.util.Stack;

public class Create{
public static void main(String[]args){
// Create an Object for Stack
  // Load Values in Stack
  // Iterate it by usig Iterator and While Loops
    Stack<Integer> stack = new Stack<>();
  stack.push(240);
  stack.push(220);
  stack.push(2-0);
  Iterator<Integer> iterator =stack.iterator();
  while(iterator.hasNext()){
    System.out.println(iterator.next());
  }
}
}
