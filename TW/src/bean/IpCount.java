package bean;

public class IpCount {
	/**
	 * IdCount entity
	 * wjc
	 */
	private int id;
	
	private long count;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getCount() {
		return count;
	}

	public void setCount(long count) {
		this.count = count;
	}

	public IpCount(long count) {
		
		this.count = count;
	}
	
	public IpCount(){
		
	}
}
