package stack;
/**
 * @author: Sravya Geethika Sala
 * SID: 574309
 */
import java.util.*;

public class ValidParenthesesClass {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any string: ");
        String userInput = scanner.nextLine();
        scanner.close();

        // Define stacks
        Stack<String> operands = new Stack<>();
        Stack<String> operators = new Stack<>();
        Stack<String> braces = new Stack<>();

        
        boolean isValidInput = true;

        // Process input
        for (char ch : userInput.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                operands.push(String.valueOf(ch));
            } else if ("+-*/%".indexOf(ch) != -1) {
                operators.push(String.valueOf(ch));
            } else if ("(){}[]".indexOf(ch) != -1) {
                braces.push(String.valueOf(ch));
            } else if (!Character.isWhitespace(ch)) { 
                isValidInput = false;
                break;
            }
        }

        if (!isValidInput) {
            System.out.println("Input String must contain numbers, alphabets, and mathematical operators.");
            return;
        }

        // Print stacks
        System.out.println("Operands stack: " + operands);
        System.out.println("Operators stack: " + operators);
        System.out.println("Braces stack: " + braces);

        // Validate braces
        System.out.println(validateBraces(braces) ? "The braces are closed correctly." : "The braces aren't closed correctly.");
    }

    private static boolean validateBraces(Stack<String> braces) {
        Stack<Character> stack = new Stack<>();
        for (String brace : braces) {
            char ch = brace.charAt(0);
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) return false;
                char open = stack.pop();
                if ((ch == ')' && open != '(') ||
                    (ch == '}' && open != '{') ||
                    (ch == ']' && open != '[')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
