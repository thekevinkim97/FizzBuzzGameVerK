
public class GoodHaloBadHalo {
	
	public void halo(int max) {
		for(int i = 0; i < max+1; i++) {
			if(i % 3 == 0 && i % 5 == 0)
				System.out.println("GoodHalo and BadHalo");
			else if(i % 3 == 0) 
				System.out.println("GoodHalo");
			else if(i % 5 == 0)
				System.out.println("BadHalo");
			else
				System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		GoodHaloBadHalo h = new GoodHaloBadHalo();
		h.halo(100);
	}
}
