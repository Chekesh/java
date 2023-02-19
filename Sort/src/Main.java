import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void quick (int[] array, int low, int hight){
        if (array.length == 0) {
            return;
        }
        if (low >= hight){
            return;
        }
        int middle = low+(hight-low)/2;
        int opora = array[middle];
        int i = low, y = hight;
        while (i<=y){
            while (array[i]<opora){
                i++;
            }
            while (array[y]>opora){
                y--;
            }
            if(i<=y){
                int temp = array[i];
                array[i] = array[y];
                array[y] = temp;
            }
            i++;
            y--;
        }
        if (i<y){
            quick(array,low,hight);
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] mass = {8, 0, 4, 7, 3, 7, 10, 12, -3};
        System.out.println(Arrays.toString(mass));
        int low = 0;
        int hight = mass.length - 1;
        quick(mass, low, hight);
        System.out.println(Arrays.toString(mass));
    }
}

