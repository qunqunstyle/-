    #include "stdio.h"
    #include "math.h"
	int main()
    {
        int split_num;
        int color_num=4; 
        scanf("%d",&split_num); 
        int kind;  
          /*����split_num��color_num�����ֺܴ�Ļ���������
        * ���ܻᳬ��int�͵��ַ����ȣ���ѡ��double��long�ͽϺá�          
        * ע�⣬����Ĳ����������ֺ�С�����ᳬ��int�͵ĳ���,
        * ͬʱ�������������Ϊint�ͣ���Ϊdouble��int����ȡ��������������Ϊint��*/
        kind = pow(color_num - 1,split_num) + (color_num - 1)*pow(-1,split_num);
        printf("%d",kind);     
    }
