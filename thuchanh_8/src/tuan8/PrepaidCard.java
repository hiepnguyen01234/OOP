package tuan8;

public class PrepaidCard extends Ticket implements ICard{
	public PrepaidCard(int i,Date d) {
		super(i,d);
	}
	public void add(int i) {
		
	}
	public boolean deduct(int i) {
		return true;
	}
	public boolean isValid() {
		return true;
	}

}
