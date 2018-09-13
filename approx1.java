
public class approx1 {

	public static void main(String[] args)
	{
		int i;                                                               
		int nPoints = 0;                                             
		int nPointsCircle = 0;
		int args1 = Integer.parseInt(args[0]);

		double x, y;                                                 

		for (i = 0; i < args1 ; i++)                         
		{                                                            
			x = Math.random();                  
			y = Math.random();                                                

			nPoints++;                                                        

			if ( x*x + y*y <= 1 )             
				nPointsCircle++;                                               
		}                                                            

		System.out.println("Total number of Points: "+ nPoints);
		System.out.println("Points within circle: "+ nPointsCircle);
		System.out.println("Pi estimation: "+ 4*((double)nPointsCircle/(double)nPoints));
	}
}
