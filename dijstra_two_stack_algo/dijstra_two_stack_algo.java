package Java.dijstra_two_stack_algo;

public class dijstra_two_stack_algo {
    public static void main(String[] args){
        Stack <String> ops = new Stack<String>();
        Stack <Double> vals = new Stack<Double>();
        while(!StdIn.isEmpty()){
            String s = StdIn.readString();
            if(s.equals("("))
            else if(s.equals("+"))
            else if(s.equals("*"))
            else if(s.equals(")")){
                String op = ops.pop();
                if(op.equals("+")){vals.push(vals.pop() + vals.pop());}
                else if(op.equals("*")){vals.push(vals.pop() * vals.pop());}
            }
            else vals.push(Double.parseDouble(s));
        }
        StdOut.println(vals.pop());
    }
}
