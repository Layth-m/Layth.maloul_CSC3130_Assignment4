
import java.util.*;
public class isBalanced {
    String brackets = "";
    public isBalanced(String Brackets){
        this.brackets= Brackets;
    }

    public String CheckBalanced(){
        if(brackets.isEmpty()){
           return "NO";
        }
        Stack<Character> stack_brackets = new Stack<>();
for(char ch : brackets.toCharArray()){

    if(ch=='('|| ch =='{'||ch=='['){
        stack_brackets.add(ch);
    }
    else if(ch==')'||ch=='}'||ch==']'){
        if(stack_brackets.isEmpty()){
         return("NO");

        }
        char top = stack_brackets.pop();
        if ((ch == ')' && top != '(') ||(ch == '}' && top != '{') || (ch == ']' && top != '[')) {
         return("NO");
        }
}

    }
    return "YES";
}

}