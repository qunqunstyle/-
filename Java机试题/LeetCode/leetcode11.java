package LeetCode;

public class leetcode11 {
    public static void main(String args[]){

    }
    public int maxArea(int[] height) {
        /*int maxarea = 0;
        for(int i = 0;i<height.length;i++){
            for(int j = i+1;j<height.length;j++){
                int temp = (j - i)*Math.min(height[i],height[j]);
                if(temp>maxarea)
                    maxarea = temp;
            }
        }
        return maxarea;*/
        int maxarea = 0;
        int lift = 0;
        int right = height.length-1;
        for(int i = 0;i<height.length;i++){
            int temp = (right - lift)*Math.min(height[lift],height[right]);
            if(temp>maxarea)
                maxarea = temp;
            if(height[right]>height[lift])
                lift++;
            else
                right--;
        }
        return maxarea;

    }
}
