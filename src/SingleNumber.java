import java.util.Scanner;

public class SingleNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter array size");
        int size=scanner.nextInt();
        int array[]=new int[size];
        for(int i=0;i<size;i++)
        {
            array[i]=scanner.nextInt();
        }
        System.out.println(findSingleNumber(array,size));
    }
    public static int findSingleNumber(int array[],int size)
    {
        int result=0;
        for(int i=0;i<size;i++)
        {
            result=result^array[i];
        }
        return result;
    }
}
