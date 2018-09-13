package tuan8;

public class Gate {
	public static int i;
	protected String name;
	protected int distance;
	
	/*public void setName(String n) {
		name =n;
	}
	public void setDistance(int d) {
		distance =d;
	}
	public String getName() {
		return name;
	}
	public int getDistance() {
		return distance;
	}*/
	public Gate(String n,int d) {
		name =n;
		distance =d;
	}
	public void enter(Ticket t) {
		
	}
	public void exit(Ticket t) {
		
	}
	public void open() {
		System.out.println("the door is open .");
	}
	public void close() {
		System.out.println("the door is close .");
	}

}
