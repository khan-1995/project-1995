class Euler_2
{
public static void main(String[] args) 
{
int fs=0;
int sum=0;
int f1=1,f11=0;
int[] array=new int[40];
for(int i=0;i<40;i++)
{
fs=f1+f11;
f11=f1;
f1=fs;
System.out.print(" "+fs);
array[i]=fp;
}
System.out.print("end of series. ");
for(int i=0;i<array.length;i++)
{
	if(array[i]%2==0)
	{
      sum=sum+array[i];
	}

}
System.out.println(sum);
	
}
}
