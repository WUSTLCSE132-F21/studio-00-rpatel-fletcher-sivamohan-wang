
public class heartbeat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int time = 0;
		long curTime = System.currentTimeMillis();
		
		while (true) {
			System.out.println(time + " sec have passed");
			try{
				Thread.sleep(1000);
				System.out.println(System.currentTimeMillis() - curTime);
			} catch (InterruptedException e){
				e.printStackTrace();
			}
			++time;
			
		}
	}

}
