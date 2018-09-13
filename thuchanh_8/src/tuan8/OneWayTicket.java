package tuan8;

public class OneWayTicket extends Ticket{
	private boolean valid =true;
	
	public OneWayTicket(int i,Date d) {
		super(i,d);
	}
	public void setOrigin(Gate g) {
		
	}
	public boolean isValid() {
		return true;
	}

}
