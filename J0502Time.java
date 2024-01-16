import java.util.Scanner;
class Time {
    int hour;
    int second;
    int minute;
    Time(){
        hour = 0;
        second = 0;
        minute = 0;
    }
    void addTime(Time t2){
        int hh,mm,ss;
        this.hour = this.hour + t2.hour;
        this.minute = this.minute + t2.minute;
        this.second = this.second + t2.second;
        
        hh = (this.second/3600);
        mm = (this.second - (hh*3600))/60;
        ss =this.second-(hh*3600)-(mm*60);
        
        hh = mm/60;
        mm = mm-(hh*60);
        
        hh += this.hour;
        mm += this.minute;
        
        System.out.printf("hh:mm:ss= %d:%d:%d ",hh,mm,ss);
    }
}
public class J0502Time{
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
        
        t1.addTime(t2);
        sc.close();
    }
}
