package co.yunmc.java.List;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

/*
    public class Stack<E> extends Vector<E>
        Vector 已经被ArrayList替代了，Stack 也让不建议使用了
    Deque 接口 双端队列
        ArrayDeque  底层使用数组
        LinkedList  底层使用双向链表

    push 入栈
    pop  出栈
    peek 栈顶元素
 */
public class TestStack {
    public static void main(String[] args) {
        Stack stack = new Stack();

        Deque<String> deque = new LinkedList();
        deque.push("A");
        deque.push("B");
        deque.push("C");
        String e = deque.peek();  // 获取栈顶元素
        while (!deque.isEmpty()){
            String e2 = deque.pop();
            System.out.println(e2);
        }
    }
}
