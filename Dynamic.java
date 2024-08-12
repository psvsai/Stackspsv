import java.util.ListIterator;
import java.util.Stack;

public class Dynamic{
public static void main(String[]args){
// Create an Object for Stack
  // Load person class Objects in it using push function
  // Iterate it by using List Iterator
  // print the values by using while Loop
  
      Stack<Person> stack = new Stack<>();
      stack.push(new Person("MAHESH", 24));
      stack.push(new Person("VENKATA", 24));

      ListIterator<Person> listIterator = stack.listIterator();
      while (listIterator.hasNext()) {
          Person person = listIterator.next();
          System.out.println("Person Name: "+person.getName() + " Age: "+person.getAge());
      }
  }
}

class Person {
  private String name;
  private int age;

  public Person(String name, int age) { 
      this.name = name;
      this.age = age;
  }

  public String getName() {
      return name;
  }

  public int getAge() {
      return age;
  }
}

