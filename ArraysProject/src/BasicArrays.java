import java.math.BigDecimal;
import java.math.RoundingMode;

public class BasicArrays {

	public static void main(String[] args) {
		
		int[] marks= {100,1001,28787,398,409,534};
		
		int sum=0;
		for(int i=0;i<marks.length;i++)
		{
			sum=sum+marks[i];
		}
		System.out.println("Sum : " + sum);

		int max=0;
		for(int i=0;i<marks.length;i++)
		{
			if(max<marks[i])
			{
				max=marks[i];
			}

		}System.out.println("max is : " + max);
		
		int min=max;
		for(int i=0;i<marks.length;i++)
		{
			if(min>marks[i])
			{
				min=marks[i];
			}

		}System.out.println("min is : " + min);
	
	double Avg=0.00000;
	for(int i=0;i<marks.length;i++)
	{
	Avg=
			sum/marks.length;	
	}
	System.out.printf("Avg : " + Avg,3,RoundingMode.UP);
	
	
	}
}
