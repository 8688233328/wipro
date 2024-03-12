public class Cube{  
    public static void main(String args[])  
    {  
    int num=123;  
    int sum=0;

    while(num>0){
        int remainder=num%10;
        sum=sum+(remainder*remainder*remainder);
        num=num/10;
    }  
        System.out.println("Volume ot the cube="+sum);  
     }  
}  