import  java.util.Scanner;
public class Reverse {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter your name");
        String name = sc.next();
        System.out.println("hello," + name);
        String[] arr = name.split("");
        //{'A', 's', 'm', 'i'}
        for(int i=arr.length-1; i>=0; i--){
            System.out.print(arr[i]);
        }            
        sc.close();


    } 
}
