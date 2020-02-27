import java.util.Scanner;

public class GoodHaloBadHalo {
	
	public void halo(int max, int goodTrigger, int badTrigger) {
		
		for(int i = 0; i < max+1; i++) {
			if(i % goodTrigger == 0 && i % badTrigger == 0)
				System.out.println("GoodHalo and BadHalo");
			else if(i % goodTrigger == 0) 
				System.out.println("GoodHalo");
			else if(i % badTrigger == 0)
				System.out.println("BadHalo");
			else
				System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		try {
		System.out.println("What is your range, first trigger, and second trigger?");
		int r = input.nextInt();
		int fT = input.nextInt();
		int sT = input.nextInt();
		
		GoodHaloBadHalo h = new GoodHaloBadHalo();
		h.halo(r, fT, sT);
		}
		finally {
			if(input != null) 
				input.close();
		}
	}
}
