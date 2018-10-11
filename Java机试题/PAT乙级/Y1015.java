package PATY;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Y1015 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int low = in.nextInt();
        int high = in.nextInt();

        Set<Student> setOne = new TreeSet<>();
        Set<Student> setTwo = new TreeSet<>();
        Set<Student> setThree = new TreeSet<>();
        Set<Student> setFour = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            int id = in.nextInt();
            int mora = in.nextInt();
            int talent = in.nextInt();

            if (mora >= low && talent >= low) {
                Student temp = new Student(id, mora, talent, high);
                switch (temp.classType) {
                    case 1:
                        setOne.add(temp);
                        break;
                    case 2:
                        setTwo.add(temp);
                        break;
                    case 3:
                        setThree.add(temp);
                        break;
                    case 4:
                        setFour.add(temp);
                        break;
                }
            }
        }
        in.close();


        System.out.println(setOne.size() + setTwo.size() + setThree.size() + setFour.size());
        for (Student s : setOne) {
            System.out.printf("%08d %d %d\n", s.id, s.mora, s.talent);
        }
        for (Student s : setTwo) {
            System.out.printf("%08d %d %d\n", s.id, s.mora, s.talent);
        }
        for (Student s : setThree) {
            System.out.printf("%08d %d %d\n", s.id, s.mora, s.talent);
        }
        for (Student s : setFour) {
            System.out.printf("%08d %d %d\n", s.id, s.mora, s.talent);
        }
    }
}

class Student implements Comparable<Student> {
    int id;
    int mora;
    int talent;
    int score;
    int classType;

    public Student(int id, int mora, int talent, int h) {
        this.id = id;
        this.mora = mora;
        this.talent = talent;
        this.score = talent + mora;

        if (mora >= h && talent >= h) {
            classType = 1;
        } else if (mora >= h && talent < h) {
            classType = 2;
        } else if (mora < h && talent < h && mora >= talent) {
            classType = 3;
        } else {
            classType = 4;
        }

    }

    @Override
    public int compareTo(Student s) {

        if (this.score < s.score) {
            return 1;
        } else if (this.score > s.score) {
            return -1;
        } else {
            if (this.mora < s.mora) {
                return 1;
            } else if (this.mora > s.mora) {
                return -1;
            } else {
                if (this.id > s.id) {
                    return 1;
                } else if (this.id < s.id) {
                    return -1;
                } else {
                    return 0;
                }
            }
        }
    }

}
/*
import java.util.Arrays;
import java.util.Scanner;

class M implements Comparable<M>{

    String id;
    int de_score;
    int cai_score;
    static int low;
    static int high;

    public static int getLow() {
        return low;
    }

    public static void setLow(int low) {
        M.low = low;
    }

    public static int getHigh() {
        return high;
    }

    public static void setHigh(int high) {
        M.high = high;
    }

    public  int compareTo(M m){
        if(de_score>=high&cai_score>=high)
            return
        return this.de_score-m.de_score;
    }
}
public class Main {
    public static void main(String []args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int low = in.nextInt();
        int high = in.nextInt();
        M[] a = new M[n];
        M.setLow(low);
        M.setHigh(high);
        for (int i = 0; i < n; i++) {
            a[i] = new M();
        }
        int k=0;
        for (int i = 0; i < n; i++) {
            String idd =in.nextLine();
            int de =in.nextInt();
            int cai =in.nextInt();
            if(de>=low&cai>low){
                a[k].id=idd;
                a[k].de_score=de;
                a[k].cai_score=cai;
                k++;
            }
        }
        Arrays.sort(a, 0, k);

    }
}
*/
