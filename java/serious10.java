// 

import java.util.Stack;

public class serious10 {
    static void showPush(Stack<Integer> st, int a){
        st.push(a);
        System.out.println("push("+a+")");
        System.out.println("stack: "+st);
    }
    static void showPop(Stack<Integer> st){
        Integer val=st.pop();
        System.out.println("pop("+val+")");
        System.out.println("stack: "+st);
    }
     public static void main(String[] args) {
        // Create a new stack
        Stack<Integer> stack = new Stack<>();
 
        // Push elements onto the stack
        // stack.push(1);
        // stack.push(2);
        // stack.push(3);
        // stack.push(4);
        showPush(stack,1);
        showPush(stack,2);
        showPush(stack,3);
        showPush(stack,4);
        System.out.println("contenct of stack: "+stack);
        showPop(stack);
        showPop(stack);
        showPop(stack);
        showPop(stack);
 
        // Pop elements from the stack
        // while(!stack.isEmpty()) {
        //     System.out.println(stack.pop());
        // }
    }
}
