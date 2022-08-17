import java.lang.*;
import java.util.*;
/*
Enter the size of array :
5
Enter elements
23
9
29
15
21
Elements of the array are
23 9 29 15 21 Datta after bubble sorting:
Elements of the array are
9 15 21 23 29 Datta after selection sort sorting:
Elements of the array are
9 15 21 23 29 Datta after insertion sorting:
Elements of the array are
9 15 21 23 29
*/
interface MarvellousSort
{
    public void Accept();
    public void Display();
    public void BubbleSort();
    public void InsertionSort();
    public void SelectionSort();
}

class Array implements MarvellousSort
{
    public int Arr[];

    public Array(int iSize)
    {
        Arr = new int[iSize];
    }

    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter elements");
        for(int i= 0;i <Arr.length; i++)
        {
            Arr[i] = sobj.nextInt();
        }
    }

    public void Display()
   {
        System.out.println("Elements of the array are");
        for(int i= 0;i<Arr.length;i++)
        {
           System.out.print(Arr[i]+" ");
        }
   }

   public void BubbleSort()
   {
     int i=0,j=0,temp=0;
     {
        for(i=0;i<Arr.length;i++)
        {
            for(j=0;j<Arr.length-i-1;j++)
            {
                if(Arr[j]>Arr[j+1])
                {
                    temp=Arr[j];
                    Arr[j]=Arr[j+1];
                    Arr[j+1]=temp;
                }
            }
        }
     }
   }



   public void SelectionSort()
   {
      
      for(int j=0;j<Arr.length;j++)
      {
        int index_of_min=i;
        for(int j=i;j<Arr.length;i++)
        {
            if(Arr[index_of_min]>Arr[j])
            {
                index_of_min=j;
            }
        }
        int temp=Arr[i];
        Arr[i]=Arr[index_of_min];
        Arr[index_of_min]=temp;

      }
   }
   
   public void InsertionSort()
   {
    
       int i=0,j=0,select=0;
       
       for(i=0;i<Arr.length;i++)
       {  
       for(j=i-1,select=Arr[i];(j>=0)&&(Arr[j]>select);j--)
       {
           Arr[j+1]=Arr[j]; 
       }
       Arr[j+1]=select;
    }

   }
}

class program376
{
    public static void main(String arr[])
    {
            Scanner sobj = new Scanner(System.in);

            System.out.println("Enter the size of array : ");
            int size = sobj.nextInt();

            Array aobj = new Array(size);
            aobj.Accept();
            aobj.Display();

            aobj.BubbleSort();
            System.out.println("Datta after bubble sorting:");
            aobj.Display();

              aobj.SelectionSort();
              System.out.println("Datta after selection sort sorting:");
              aobj.Display();

              aobj.InsertionSort();
              System.out.println("Datta after insertion sorting:");
              aobj.Display();

            

    }
}