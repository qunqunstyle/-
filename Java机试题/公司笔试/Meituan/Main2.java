/*      星际穿越
        时间限制：C/C++语言 1000MS；其他语言 3000MS
        内存限制：C/C++语言 65536KB；其他语言 589824KB
        题目描述：
        小团在一次星际旅行中，耗尽了飞船的能量，迷失在了空间魔方中，空间魔方中有N*N*N个能量粒子。美团云AI迅速帮小团分析出了空间魔方的能量分布图。

        已知小团的飞船被困在能量值最高的点，能量值最高点有且只有一个。飞船每到达一个能量粒子就会吸收对应粒子的能量，该粒子会坍缩成小黑洞，飞船不可到达。小团驾驶的飞船只能从高能粒子驶向低能粒子，且每次只能从6个方向中选择一个前进。（±x,±y,±z）。

        请帮助帮小团吸收最高的能量值。

        输入
        N（0≤N≤8）

        N*N*N行空间能量数据，格式为：X Y Z P，XYZ表示点坐标，P表示空间能量分布（0≤P）

        输出
        可吸收到的最高的能量值


        样例输入
        2
        0 0 0 7
        0 0 1 2
        0 1 0 4
        0 1 1 3
        1 0 0 6
        1 0 1 1
        1 1 0 5
        1 1 1 0
        样例输出
        28

        提示
        输入样例2
        3
        0 0 0 1
        0 0 1 2
        0 0 2 3
        0 1 0 4
        0 1 1 5
        0 1 2 6
        0 2 0 7
        0 2 1 8
        0 2 2 9
        1 0 0 10
        1 0 1 11
        1 0 2 12
        1 1 0 13
        1 1 1 14
        1 1 2 13
        1 2 0 12
        1 2 1 11
        1 2 2 10
        2 0 0 9
        2 0 1 8
        2 0 2 7
        2 1 0 6
        2 1 1 5
        2 1 2 4
        2 2 0 3
        2 2 1 2
        2 2 2 1
        输出样例2
        89*/


package Meituan;

import java.util.Arrays;
import java.util.Scanner;

public class Main2 {
    static int count = 0;
    static int N;


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        N = in.nextInt();
        int power[][][] = new int[N+2][N+2][N+2];
        //Arrays.fill(power,-1);
        for (int i = 0; i < (int)Math.pow(2,N); i++) {
            power[i][0][0] = -1;
            power[0][i][0] = -1;
            power[0][0][i] = -1;
            power[i][N-1][N-1] = -1;
            power[N-1][i][N-1] = -1;
            power[N-1][N-1][i] = -1;
            int x = in.nextInt() +1;
            int y = in.nextInt() +1;
            int z = in.nextInt() +1;
            power[x][y][z] = in.nextInt();
        }

        dfs(power, 0, 0,0, 0);
        System.out.println(count);
    }

    public static void dfs(int road[][][], int i, int j,int k, int allnum) {
        allnum += road[i][j][k];
        road[i][j][k] = -1;
        if (road[i+1][j][k] == -1 &&road[i-1][j][k] == -1 &&road[i][j+1][k] == -1 &&road[i][j-1][k] == -1 &&road[i][j][k+1] == -1 ) {
            if (allnum > count)
                count = allnum;
        } else if (road[i-1][j][k] != -1) {
            dfs(road, i-1, j ,k, allnum);
        } else if (road[i+1][j][k] != -1) {
            dfs(road, i+1, j ,k, allnum);
        } else if (road[i][j+1][k] != -1) {
            dfs(road, i, j +1 ,k, allnum);
        } else if (road[i][j-1][k] != -1) {
            dfs(road, i, j-1 ,k, allnum);
        }else if (road[i][j][k+1] != -1) {
            dfs(road, i, j ,k+1, allnum);
        } else if (road[i][j][k-1] != -1) {
            dfs(road, i, j ,k-1, allnum);
        }

    }
}
