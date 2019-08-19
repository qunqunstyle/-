package DaJiang;

import java.util.Arrays;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        class Food implements Comparable<Food> {
            int money;
            int value;
            int num;
            float count;

            public Food(int m, int v, int n) {
                this.money = m;
                this.value = v;
                this.num = n;
                this.count = (float) value / money;
            }

            @Override
            public int compareTo(Food o1) {
                if ((this.count - o1.count) >= 0)
                    return (int) (this.count - o1.count);
                else
                    return -1;
            }
        }
        boolean has = false;
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n = in.nextInt();
            int t = in.nextInt();
            Food foods[] = new Food[n];
            int allmoney = 0;
            int allvalue = 0;
            for (int i = 0; i < n; i++) {
                int money = in.nextInt();
                int value = in.nextInt();
                int num = in.nextInt();
                foods[i] = new Food(money, value, num);
                allmoney += money * num;
                allvalue += value * num;
            }
            if (allmoney <= t)
                System.out.println(allvalue);
            else {
                allvalue = 0;
                Arrays.sort(foods, 0, n);

                for (int i = n - 1; i >= 0; i--) {
                    int temp = foods[i].num;
                    for (int j = 0; j < temp; j++) {
                        if (t >= foods[i].money) {
                            has = true;
                            t -= foods[i].money;
                            allvalue += foods[i].value;
                            foods[i].num--;
                        }
                    }
                    if (t == 0)
                        break;
                }
                if (has)
                    System.out.println(allvalue);
                else
                    System.out.println("0");
            }
        }
    }
}
