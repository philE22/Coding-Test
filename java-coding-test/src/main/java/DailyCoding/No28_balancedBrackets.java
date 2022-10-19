package DailyCoding;

import java.util.Stack;

public class No28_balancedBrackets {
    public static void main(String[] args) {
        String str = "[](){}";
        No28_balancedBrackets test = new No28_balancedBrackets();
        System.out.println(test.balancedBrackets(str));

    }

    public boolean balancedBrackets(String str) {
        // TODO:
        // 괄호가 시작하면 false 닫히면 true
        // 괄호가 시작하고 다른 괄호가 열리고 원래 괄호가 닫히면 false
        // 즉, 하나의 괄호안에서 괄호가 완성되지 않으면 실패
        // 스택 사용!
        Stack<Character> stack = new Stack<>();

        // 괄호가 하나일때의 함수
        //1. 문자열을 나눠 배열에 담는다.
        char[] arr = str.toCharArray();

        //2. 배열은 순회하며 '(' 을 만나면 +1을 하고 ')'을 만나면 -1을 한다
        //
        for (char chr : arr) {
            switch (chr) {
                case '(':
                case '{':
                case '[':
                    stack.push(chr);
                    break;

                case ')':

                    chr = (char) ((int) chr - 1);
                    if (stack.size() == 0 || stack.peek() != chr) return false;
                    stack.pop();
                    break;

                case '}':
                case ']':
                    chr = (char) ((int) chr - 2);
                    if (stack.size() == 0 || stack.peek() != chr) return false;
                    stack.pop();
                    break;
            }
        }
        return true;
    }
}
