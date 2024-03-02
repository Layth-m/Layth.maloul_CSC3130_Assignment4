
import java.util.Stack;
public class infix_to_postfix {
    public static String InfixToPostfix (String input){

        StringBuilder postfix = new StringBuilder();
        Stack<Character> operatorStack = new Stack<>();

    for(char ch : input.toCharArray()) {
        if (Character.isLetterOrDigit(ch)) {
            postfix.append(ch);
        }
        else if(ch== '('){
            operatorStack.push(ch);
        }
        else if(ch== ')') {
            while (!operatorStack.isEmpty() && operatorStack.peek() != '(') {
                postfix.append(operatorStack.pop());
            }
            if (!operatorStack.isEmpty()) {
                operatorStack.pop(); // Remove the '('
                // operatorStack.pop();
            }
        }
        else{

            while(!operatorStack.isEmpty() && precedance(ch) <= precedance(operatorStack.peek())){
                postfix.append(operatorStack.pop());
            }
            operatorStack.push(ch);
        }
    }
    while(!operatorStack.isEmpty()){
        postfix.append(operatorStack.pop());
    }

    return postfix.toString();
    }

    private static int precedance(char op){
        if(op=='+'){
            return 1;
        }
        else if(op=='-'){
            return 1;
        }
        else if(op=='*'){
            return 2;
        }
        else if(op=='/'){
            return 2;
        }
        else if(op =='^'){
            return 3;
        }
        else{
            return 0;
        }


    }
}
