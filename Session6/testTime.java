package Session6;

public class testTime {
    public static void main(String[] args){
        Time t1 = new Time(19,23,3);
        System.out.println(t1.toString());

        Time t2 = t1.nextSecond();
        System.out.println(t2.toString());

        Time t3 = t1.nextSecond();
        System.out.println(t3.toString());

        Time t4 = t1.nextSecond();
        System.out.println(t4.toString());

        Time t5 = t1.nextSecond();
        System.out.println(t5.toString());

        Time t6 = t1.nextSecond();
        System.out.println(t6.toString());
    }
}
