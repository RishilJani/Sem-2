public class J0406Upper {
    public static void main(String[] args) {
        String str = args[0];
        int s = str.charAt(0); 
        if(s>=65 && s<=91){
            System.out.println(str);
        }
        else{
            System.out.println("Error Occuerd");
        }
    }
}
