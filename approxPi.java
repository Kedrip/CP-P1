import java.util.concurrent.ThreadLocalRandom;

public class approxPi extends Thread{

	public static void main(String[] args)
	{

		int args2 = Integer.parseInt(args[1]);
		int args1 = Integer.parseInt(args[0])/args2;
		for(int i=0; i< args2; i++){
			Thread thread1 = new approx1(args1);
			thread1.start();

		}
	}

	public static class approx1 extends Thread{
		private int args1;


		public approx1(int args1) {
			this.args1 = args1;
		}

		public void run() {                                                           
			double x, y;
			int nPoints = 0;
			int nPointsCircle = 0;

			for (int i = 0; i < args1 ; i++)                         
			{                                                            
				x = ThreadLocalRandom.current().nextDouble(0,1);                
				y = ThreadLocalRandom.current().nextDouble(0,1);                                                

				nPoints++;  

				if ( x*x + y*y <= 1 )             
					nPointsCircle++;                                               
			}

			System.out.println("Total number of Points: "+ nPoints);
			System.out.println("Points within circle: "+ nPointsCircle);
			System.out.println("Pi estimation: "+ 4*((double)nPointsCircle/(double)nPoints));
		}
	}

}
