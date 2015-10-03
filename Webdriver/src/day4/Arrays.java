package day4;

public class Arrays {

	public static void main(String[] args) {
		int[] a={10,23,41,22,45,60,80};
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("########");
		int[] b=new int[4];
		b[0]=10;
		b[1]=20;
		b[2]=30;
		b[3]=40;
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}
	}
}


