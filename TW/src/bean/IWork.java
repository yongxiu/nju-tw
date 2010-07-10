package bean;

public class IWork {
	private int id;
	private String name;
	private String path;
	public IWork(String name, String path) {
		super();
		this.name = name;
		this.path = path;
	}
	
	public IWork() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}
	
	
}
