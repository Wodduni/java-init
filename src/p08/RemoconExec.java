package p08;

public class RemoconExec {
	public static void main(String[] args) {
//		AirCorn ar = new AirCorn();
//		TVRemocorn tv = new TVRemocorn();
//		
//		Remote[] remotes = new Remote[2];
//		remotes[0] = ar;
//		remotes[1] = tv;
		
		Remote[] remotes = new Remote[2];
		remotes[0] = new AirCorn();
		remotes[1] = new TVRemocorn();
		
		for (int i = 0; i < remotes.length; i++) {
			remotes[i].on();
			if(remotes[i] instanceof AirCorn) {
				AirCorn airCorn = (AirCorn) remotes[i];
				airCorn.tempUp();
				airCorn.tempDown();
				
			}
			if(remotes[i] instanceof TVRemocorn) {
				TVRemocorn tvRemocorn = (TVRemocorn)
						remotes[i];

				tvRemocorn.chUp();
				tvRemocorn.chDown();

			}
			remotes[i].off();
		}
		

		
	}
}
