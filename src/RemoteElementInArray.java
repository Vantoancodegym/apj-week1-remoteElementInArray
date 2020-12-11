import java.util.Arrays;
import java.util.Scanner;

public class RemoteElementInArray {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int[] myArray ={2,3,4,6,3,4,5,8,3};
        System.out.println("Enter a number");
        int x=input.nextInt();
        int[] newArray=remoteElement(myArray,x);
        System.out.println(Arrays.toString(newArray));
    }
    public static int[] remoteElement(int[] array,int a){
        int c =0;
        int[] newArray1=new int[array.length];
        for (int i = 0; i < array.length; i++) {
            if (array[i]!=a){
                newArray1[c]=array[i];
                c++;
            }
        }
        int[] newArray=Arrays.copyOf(newArray1,c);
        return newArray;
    }
}
