package dsa.array;

class demon
{
    int id;
    String name;
    demon(int id,String name)
    {
        this.id=id;
        this.name=name;
    }
}
public class arrayintro {
    public static void main(String[] args) {
        int arr[]=new int[5];//creating fixed sized array of size 5
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);//default value for integer datatype is zero
        }

        demon classarr[]=new demon[5];
        classarr[0]=new demon(1,"shyam");
        classarr[1]=new demon(2,"raju");
        for(int i=0;i<2;i++)
        {
            System.out.println(classarr[i].id+" "+classarr[i].name);//default value for integer datatype is zero
        }


        //passing array to method
        int arr1[]=new int[]{1,2,3,4,5};
        sum(arr1);

    }

        static void sum(int[] arr)
    {
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum=sum+arr[i];
        }
        System.out.println("sum: "+sum);
    }
}
