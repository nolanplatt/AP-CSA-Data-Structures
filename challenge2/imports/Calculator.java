package challenge2.imports;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Data Structure Challenge 2 | Calculator
 * Due March 29, 2022
 * @author  Nolan Platt (github.com/nolanplatt)
 */

 
public class Calculator {
    
    String input;
    ArrayList<String> tokenList;
    ArrayList<String> rpn;
    Double output;

     // Helper definition for supported operators
     private final Map<String, Integer> OPERATORS = new HashMap<>(); {
         // Map<"token", precedence>
         OPERATORS.put("*", 3);
         OPERATORS.put("/", 3);
         OPERATORS.put("%", 3);
         OPERATORS.put("+", 4);
         OPERATORS.put("-", 4);
         OPERATORS.put("^", 2); // assignment (for credit)
         OPERATORS.put("SQRT", 2); //extra credit SQRT()
     }

      // Helper definition for supported operators
    private final Map<String, Integer> SEPARATORS = new HashMap<>(); {
        // Map<"separator", not_used>
        SEPARATORS.put(" ", 0);
        SEPARATORS.put("(", 0);
        SEPARATORS.put(")", 0);
    }

    // Test Functions
        // Test if token is an operator
        private boolean isOperator(String token) {
            // find the token in the hash map
            return OPERATORS.containsKey(token);
        }
    
        // Test if token is an separator
        private boolean isSeperator(String token) {
            // find the token in the hash map
            return SEPARATORS.containsKey(token);
        }
    
        // Compare precedence of operators.
        private Boolean isPrecedent(String token1, String token2) {
            // token 1 is precedent if it is greater than token 2
            return (OPERATORS.get(token1) - OPERATORS.get(token2) >= 0) ;
        }

        // Create a 1 argument constructor expecting a mathematical expression
    public Calculator(String expression) {
        // original input
        input = expression;

        // parse expression into terms
        this.termTokenizer();

        // place terms into reverse polish notation
        this.tokensToReversePolishNotation();

        // calculate reverse polish notation
        this.rpnToResult();
    }

    // Takes tokens and converts to Reverse Polish Notation (RPN), this is one where the operator follows its operands.
    private void tokensToReversePolishNotation () {
        // contains final list of tokens in RPN
        this.rpn = new ArrayList<>();

        // stack is used to reorder for appropriate grouping and precedence
        Stack tokenStack = new Stack();
        for (String token : tokenList) {
            switch (token) {
                // If left bracket push token on to stack
                case "(":
                    tokenStack.push(token);
                    break;
                case ")":
                    while (tokenStack.peek() != null && !tokenStack.peek().equals("("))
                    {
                        rpn.add( (String)tokenStack.pop() );
                    }
                    tokenStack.pop();
                    break;
                case "+":
                case "-":
                case "*":
                case "/":
                case "%":
                    // While stack
                    // not empty AND stack top element
                    // and is an operator
                    while (tokenStack.peek() != null && isOperator((String) tokenStack.peek()))
                    {
                        if ( isPrecedent(token, (String) tokenStack.peek() )) {
                            rpn.add((String)tokenStack.pop());
                            continue;
                        }
                        break;
                    }
                    // Push the new operator on the stack
                    tokenStack.push(token);
                    break;
                default:    // Default should be a number, there could be test here
                    this.rpn.add(token);
            }
        }
        // Empty remaining tokens
        while (tokenStack.peek() != null) {
            rpn.add((String)tokenStack.pop());
        }

    }

    // Term Tokenizer takes original expression and converts it to ArrayList of tokens
     private void termTokenizer() {
        // contains final list of tokens
        this.tokenList = new ArrayList<>();

        int start = 0;  // term split starting index
        StringBuilder multiCharTerm = new StringBuilder();    // term holder
        for (int i = 0; i < this.input.length(); i++) {
            Character c = this.input.charAt(i);
            if ( isOperator(c.toString() ) || isSeperator(c.toString())  ) {
                // 1st check for working term and add if it exists
                if (multiCharTerm.length() > 0) {
                    tokenList.add(this.input.substring(start, i));
                }
                // Add operator or parenthesis term to list
                if (c != ' ') {
                    tokenList.add(c.toString());
                }
                // Get ready for next term
                start = i + 1;
                multiCharTerm = new StringBuilder();
            } else {
                // multi character terms: numbers, functions, perhaps non-supported elements
                // Add next character to working term
                multiCharTerm.append(c);
            }

        }
        // Add last term
        if (multiCharTerm.length() > 0) {
            tokenList.add(this.input.substring(start));
        }
    }

        // Takes RPN and produces a final result
        private void rpnToResult(){
            // Stack used to hold calculation while process RPN
            Stack calculation = new Stack();
    
            // for loop to process RPN
            {
                // If the token is a number
                {
                    // Push number to stack
                }
                // else
                {
                    // Pop the two top entries
    
                    // Based off of Token operator calculate result
    
                    // Push result back onto the stack
                }
            }
            // Pop final result and set as final result for expression
        }


     // Print the expression, terms, and result
     public String toString() {
         return ("Original expression: " + this.input + "\n" +
                 "Tokenized expression: " + this.tokenList.toString() + "\n" +
                 "Reverse Polish Notation: " +this.rpn.toString() + "\n" +
                 "Final result: " + String.format("%.2f", this.output));
     }

     
}
