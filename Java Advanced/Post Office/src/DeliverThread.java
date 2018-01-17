import post.PostOffice;

public class DeliverThread extends Thread{
	PostOffice po;
	public DeliverThread(PostOffice po) {
		this.po = po;
	}
	
	@Override
	public void run() {
		while(true){
			po.givePostBoysShipmnets();
		}
	}
	
}
