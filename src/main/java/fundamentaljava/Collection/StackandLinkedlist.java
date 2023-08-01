package fundamentaljava.Collection;

import java.util.LinkedList;
import java.util.Stack;

public class StackandLinkedlist {
    public static void main(String[] args) {
        //Stack-list In First Out
        //Push()-add;
        //pop()-Only deleted last element
         // Empty()-if return true if nothing is one the top of the stack(elsereturn False)
        //Peek()-Return top of the element in stack.
        //Search()-it is returns the position of the element(or else return-1)

        Stack lifo=new Stack();//Generic
        Stack<String> lifo1=new Stack<String>();//non-generic
        lifo.push("Manojkumar");
        lifo.push(7654345678l);
        lifo.push(88);
        lifo.push("Yusuf");

        System.out.println(lifo+"Before deleted values");
        lifo.pop();
        System.out.println(lifo+"after deleted values");

        if(lifo1.empty()==true)
        {
            System.out.println("Your value is empty");
        }
        else
        {
            System.out.println("Your value is not empty");
        }
        System.out.println(lifo.search("Manojkumar"));
        System.out.println(lifo.peek());

//    Linked list-duplicates Allowed,Maintained insertion Order,Synchronzied not supported,Manipulation is Fast,performenced with index number
//   add/addLast,addfirst ,add(index,object),remove/removeFirst,removeLast,remove(index),remove(object),contains-checking process
//  get(index), getFirst, getLast , set(index,object)// update, indexOf(object), clear()..........

        LinkedList<Integer> list=new LinkedList<Integer>();//Non-generic

        list.add(11);
        list.add(12);
        list.add(13);
        list.add(14);
        list.add(17);
        list.add(17);
        list.add(18);
        list.addFirst(10);
        list.add(5,15);
        System.out.println("my value "+list);
        list.remove(0);
        list.remove();//First element will be removed
        list.removeLast();
        System.out.println("in my hand of values "+list);
        list.set(4,16);
        System.out.println("updated value "+list);
        System.out.println(list.get(2));

        list.clear();//deleted all elements
        System.out.println(list+" my value ");
    }
}
