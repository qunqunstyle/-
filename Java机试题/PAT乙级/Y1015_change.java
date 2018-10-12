package PATY;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Y1015_change {
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        int num=in.nextInt();
        int low =in.nextInt();
        int high=in.nextInt();

        //用到了Set类型中的TreeSet，添加的时候自动排序
        //<>是泛型，表明set对象中保存的只能是<>中的数据类型，本题中为Student1类型的对象
        Set <Student1>setOne =new TreeSet<>();
        Set <Student1>setTwo =new TreeSet<>();
        Set <Student1>setThree =new TreeSet<>();
        Set <Student1>setFour =new TreeSet<>();

        for(int i=0;i<num;i++){
            int id =in.nextInt();
            int mora=in.nextInt();
            int talent=in.nextInt();

            if(mora >= low && talent>= low){
                Student1 student1 =new Student1(id,mora,talent,high);
                switch (student1.classtype){
                    case 1:setOne.add(student1);break;
                    case 2:setTwo.add(student1);break;
                    case 3:setThree.add(student1);break;
                    case 4:setFour.add(student1);break;
                }
            }
        }
        in.close();

        System.out.println(setOne.size()+setTwo.size()+setThree.size()+setFour.size());
        for(Student1 s :setOne)
            System.out.println(s.id+" "+s.mora+" "+s.talent);//用双引号而非单引号
        for(Student1 s :setTwo)
            System.out.println(s.id+" "+s.mora+" "+s.talent);
        for(Student1 s :setThree)
            System.out.println(s.id+" "+s.mora+" "+s.talent);
        for(Student1 s :setFour)
            System.out.println(s.id+" "+s.mora+" "+s.talent);
    }

}
class Student1 implements Comparable<Student1>{
    int id;
    int mora;
    int talent;
    int sorce;
    int classtype;

    public Student1(int id,int mora,int talent,int h){
        this.id=id;
        this.mora=mora;
        this.talent=talent;
        this.sorce=mora+talent;

        if(talent>= h&& mora>=h)
            classtype=1;
        else if(talent<h && mora>=h)
            classtype=2;
        else if(talent<h && mora<h && mora>=talent)
            classtype=3;
        else
            classtype=4;
    }

    @Override
    public int compareTo(Student1 o) {
        //每个类型都是先比较总分大小,总分相同，再比较得分，得分相同比较id大小
        //默认从升序排列，降序排列需取反，从大到小排列
        //需注意
        //若是int型，则直接this.sorce-o.sorce，若是String型，则为this.score.compareTo(o.score);
        int result=-(this.sorce-o.sorce);
        if(result!=0)
            return result;
        else {
            result=-(this.mora-o.mora);
            if(result!=0)
                return result;
            else {
                //这里要注意，若前面都一样的话，学号是按照升序排列，不用取反
                result=  this.id-o.id;
                return result;
            }
        }
    }
}
