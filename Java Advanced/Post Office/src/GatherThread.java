import post.PostOffice;

public class GatherThread extends Thread{
	PostOffice po;
	private final static int DELIVER_TIME = 2; //hours
	public GatherThread(PostOffice po) {
		this.po = po;
	}
	
	@Override
	public void run() {
		while(true){
			po.gatherLetters();
			try {
				Thread.sleep(DELIVER_TIME*60*60*1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
