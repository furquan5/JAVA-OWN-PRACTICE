package test;

public class SResult {
	float per;
	String result;
	public void cal (int p,int totM)
	{
		per=(float)totM/6;
		if(p==1)
		{
			result="Fail";
		}//end of if
		else if(per>=70 && per<=100)
		{
			result="Distinction";
			
		}
		else if(per>=60 && per<70)
		{
			result= "FirstClass";
		}
		else if(per>=50 && per<60)
		{
			result="Second Class";
		}
		else if(per>=35 && per<50)
		{
			result="Third Class";
		}

	}
	public void getResult()
	{
		System.out.println("Per:"+per);
		System.out.println("Result:"+result);
	}

}


