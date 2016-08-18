import java.util.*;
class guvi8
{
public static void main(String args[])
{
int i,temp=0,j,temp1=0;
Scanner s1=new Scanner(System.in);
System.out.println("enter the array size");
int num=s1.nextInt();
int arr[]=new int[num];
String arr1[]=new String[num];
String arr2[]=new String[num];
int []arr3=new int[num];
for(i=0;i<num;i++)
{
arr[i]=s1.nextInt();
arr1[i]=Integer.toBinaryString(arr[i]);
}



for(i=0;i<num;i++)
{
arr2[i]=arr1[i].replaceAll("0","");
arr3[i]=arr2[i].length();
}

for(i=0;i<num;i++)
{
for(j=i+1;j<num;j++)
{
if(arr3[i]<arr3[j])
{
temp=arr3[i];
arr3[i]=arr3[j];
arr3[j]=temp;
temp=arr[i];
arr[i]=arr[j];
arr[j]=temp;
}
if(arr3[i]==arr3[j])
{
	if(arr[i]<arr[j])
	{
		temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
}
}
}
for(int nn:arr)
{

System.out.print(nn);
System.out.print("\t");
}





}
}
