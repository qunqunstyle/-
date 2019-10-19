
/*表达式解析
        时间限制：C/C++语言 1000MS；其他语言 3000MS
        内存限制：C/C++语言 65536KB；其他语言 589824KB
        题目描述：
        豚厂给自研的数据库设计了一套查询表达式，在这个表达式中括号表示将里面的字符串翻转。请你帮助实现这一逻辑

        输入
        一行字符串

        输出
        一行字符串

        如果表达式括号不匹配，输出空字符串


        样例输入
        ((ur)oi)
        样例输出
        iour*/

package Xiecheng;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main2 {


    /*请完成下面这个函数，实现题目要求的功能
    当然，你也可以不按照下面这个模板来作答，完全按照自己的想法来 ^-^
    ******************************开始写代码******************************/
    static String resolve(String string) {
        Stack<String> stack = new Stack<>();
        Stack<Character> stack1 = new Stack<>();
        String output = "";
        for (int i = 0; i < string.length(); i++) {
            if(string.charAt(i) == '(')
                stack1.push('(');
            if(string.charAt(i) == ')'){
                if(stack1.isEmpty()||stack1.peek()!= '(')
                    return "";
                else
                    stack1.pop();
            }
            if (string.charAt(i) == ')') {
                String str = "";
                while (!stack.peek().equals("(")) {
                    String temp = stack.pop();
                    for(int j = temp.length()-1;j>=0;j--){
                        str = str + temp.charAt(j);
                    }
                }
                stack.pop();
                stack.push(str);
            } else
                stack.push("" + string.charAt(i));


        }

        if(!stack1.isEmpty())
            return "";
        while (!stack.isEmpty()) {
            output = stack.pop() + output;
        }
        return output;
    }
    /******************************结束写代码******************************/


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String res;

        String _expr;
        try {
            _expr = in.nextLine();
        } catch (Exception e) {
            _expr = null;
        }

        res = resolve(_expr);
        System.out.println(res);
    }
}

