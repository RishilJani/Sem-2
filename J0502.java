import java.util.Scanner;
class Time {
    int hour;
    int second;
    int minute;
    void Time (){
        this.hour = 0;
        this.second = 0;
        this.minute = 0;
    }
    void addTime(Time t1,Time t2){
        int hh,mm,ss;
        t1.hour = t1.hour + t2.hour;
        t1.minute = t1.minute + t2.minute;
        t1.second = t1.second + t2.second;
        
        hh = (t1.second/3600);
        mm = (t1.second - (hh*3600))/60;
        ss =t1.second-(hh*3600)-(mm*60);
        
        hh = mm/60;
        mm = mm-(hh*60);
        
        hh += t1.hour;
        mm += t1.minute;
        
        System.out.printf("hh:mm:ss= %d:%d:%d ",hh,mm,ss);
    }
}
public class J0502{
    public static void main (String[] args){
        Time t1 = new Time();
        Time t2 = new Time();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter hours, minutes, second for t1");
        t1.hour = sc.nextInt();
        t1.minute = sc.nextInt();
        t1.second = sc.nextInt();
        
        System.out.println("Enter hours, minutes, second for t2");
        t2.hour = sc.nextInt();
        t2.minute = sc.nextInt();
        t2.second = sc.nextInt();
        
        t1.addTime(t1,t2);
    }
}
