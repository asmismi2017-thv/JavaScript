public class AverageArray {
    public static void main(String[]args){
        int[] numbers = {2, -9, 0, 5, 12, -25, 22, 9, -8, -12, -100, 234};
        int sum = 0;
        double avg = 0.0;
        for(int i=0; i<numbers.length; i++){
            sum += numbers[i];
        }
        avg = sum / numbers.length;
        System.out.println("Average: " + avg);
    } 
}   
