import java.util.Stack;

public class recursion {
    public static void pushAtBottom(int a, Stack<Integer> st){
        if(st.isEmpty()){
            st.push(a);
            return;
        }
        int popping=st.pop();
        pushAtBottom(a,st);
        st.push(popping);
    }
    public static void reverse(Stack<Integer> st){
        if(st.isEmpty()){
            return;
        }
        int popping=st.pop();
        reverse(st);
        pushAtBottom(popping,st);
    }
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        reverse(st);
        System.out.println(st);
    }
}
