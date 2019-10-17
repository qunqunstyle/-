package Xiecheng;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
/*IP黑名单
        时间限制：C/C++语言 1000MS；其他语言 3000MS
        内存限制：C/C++语言 65536KB；其他语言 589824KB
        题目描述：
        在软件系统中，经常会使用到IP黑名单功能。例如如下的黑名单样例，条目可能是单个IP，也可能是一个子网，IP黑名单样例：

        62.33.12.122

        221.58.4.0/24

        8.9.88.1

        …

        请构建数据结构，在加载黑名单后，能判定给定的IP是否命中指定的IP黑名单。

        输入
        第一行输入指定IP地址，IPv4格式输入；

        第二行输入指定的IP黑名单地址，可以是一个IPv4地址，或一个子网地址。

        输出
        判断指定的IP是否否命中指定的IP黑名单。


        样例输入
        2.33.128.9
        2.33.128.0/24
        样例输出
        1*/
public class Main4 {


    /*请完成下面这个函数，实现题目要求的功能
    当然，你也可以不按照下面这个模板来作答，完全按照自己的想法来 ^-^
    ******************************开始写代码******************************/
    static boolean CheckBlackList(String userIP, String blackIP) {
        return false;


    }
    /******************************结束写代码******************************/


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        boolean res;

        String _userIP;
        try {
            _userIP = in.nextLine();
        } catch (Exception e) {
            _userIP = null;
        }

        String _blackIP;
        try {
            _blackIP = in.nextLine();
        } catch (Exception e) {
            _blackIP = null;
        }

        res = CheckBlackList(_userIP, _blackIP);
        System.out.println(String.valueOf(res ? 1 : 0));
    }
}

