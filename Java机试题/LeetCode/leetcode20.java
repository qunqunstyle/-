package LeetCode;

import java.util.Stack;

public class leetcode20 {
    public boolean isValid(String s) {
        Stack <Character>stack = new Stack();
        char temp [] = s.toCharArray();
        for(int i = 0;i<temp.length;i++){
            if(temp[i]=='('||temp[i]=='['||temp[i]=='{')
                stack.push(temp[i]);
            else {
                if(stack.empty())//存在右括号，但是左括号为零，则不匹配
                    return false;
                char compare = stack.pop();
                //这里取巧的地方是查ascll表，发现匹配好的左右括号相差一或者二，
                // 而且输入的字符串中保证只有括号，所以可以进行这样的转换比较
                if(compare!=temp[i]-1&&compare != temp[i]-2)
                    return false;
            }
        }
        if(!stack.empty())//如果最后发现栈不为空，则左括号还有剩余，不符合
            return false;
        return true;//所有的都通过，则匹配成功
    }

}
