package homework9;

public class BraceChecker {
    private String text;


    public BraceChecker(String text) {
        this.text = text;

    }


    public void check(String text) {
        Stack stack = new Stack();

        char[] charArray = text.toCharArray();


        for (int i = 0; i < charArray.length; i++) {


            char current = charArray[i];


            if (current == '{' || current == '[' || current == '(') {
                stack.push(current);
                continue;
            }

            if (stack.isEmpty()) {
                System.out.println(false);
            }

            char popChar;
            switch (current) {
                case ')':
                    popChar = (char) stack.pop();
                    if (popChar == '{' || popChar == '[')
                        System.out.println(false);
                    break;
                case '}':
                    popChar = (char) stack.pop();
                    if (popChar == '(' || popChar == '[')
                        System.out.println(false);
                    break;
                case ']':
                    popChar = (char) stack.pop();
                    if (popChar == '(' || popChar == '{')
                        System.out.println(false);
                    break;
            }
        }
        System.out.println((stack.isEmpty()));
    }


}


