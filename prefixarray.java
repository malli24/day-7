import java.util.*;
class prefixarray{
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int arr[]=new int[n];
    int p=0;
    for(int i=0;i<n;i++)
        arr[i]=s.nextInt();
    for(int i=0;i<arr.length;i++){
        p+=arr[i];
        int res=p/(i+1);
        arr[i]=res;
    }
    System.out.println(Arrays.toString(arr));
  }
}