//80

package tenxun;

import java.util.Scanner;
import java.util.Stack;

public class Main1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String string = in.nextLine();
        dfs(string);
    }

    public static void dfs(String string) {
        Stack<String> stack = new Stack<>();

        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == ']') {
                String str = "";
                int num = 0;
                while (!stack.peek().equals("[")) {
                    if (stack.peek().equals("|")) {
                        stack.pop();
                        //int num=0;
                        int count = 0;
                        while (stack.peek().charAt(0) >= '0' && stack.peek().charAt(0) <= '9') {
                            if (count == 0)
                                num = Integer.valueOf(stack.pop());
                            else
                                num = Integer.valueOf(stack.pop()) * 10 + num;
                            count++;
                        }
                        continue;
                    }
                    str = stack.pop() + str;
                }
                stack.pop();

                StringBuilder stringBuilder = new StringBuilder("");
                for (int j = 0; j < num; j++) {
                    stringBuilder.append(str);
                }
                stack.push(stringBuilder.toString());
            } else
                stack.push("" + string.charAt(i));

        }
        String output = "";
        while (!stack.isEmpty()) {
            output = stack.pop() + output;
        }
        System.out.println(output);
    }
}
