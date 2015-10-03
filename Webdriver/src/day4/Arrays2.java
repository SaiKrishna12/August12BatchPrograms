package day4;

public class Arrays2 {

	public static void main(String[] args) {
		int[] marks={30,40,90,60,120};
		int max=0;
		for(int i=0;i<marks.length;i++)
		{
			if(max<marks[i])
			{
				max=marks[i];
			}
		}
		System.out.println(max);
		

	}

}
