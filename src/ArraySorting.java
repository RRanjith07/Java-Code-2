public class ArraySorting {

    public static void ArraySorting(int a[])
    {
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]>a[j])
                {
                    int temp = a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        for (int i =0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,4,6,8,2,3,7,2,3};
        ArraySorting(arr);

    }
}
