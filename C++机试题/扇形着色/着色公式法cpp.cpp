    #include "stdio.h"
    #include "math.h"
	int main()
    {
        int split_num;
        int color_num=4; 
        scanf("%d",&split_num); 
        int kind;  
          /*若是split_num和color_num的数字很大的话，计算结果
        * 可能会超出int型的字符长度，故选择double或long型较好。          
        * 注意，这里的测试用例数字很小，不会超出int型的长度,
        * 同时按照用例，输出为int型，若为double或int还需取整操作。故设置为int型*/
        kind = pow(color_num - 1,split_num) + (color_num - 1)*pow(-1,split_num);
        printf("%d",kind);     
    }
