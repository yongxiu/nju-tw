package bean.temp;



public class ArticleTemp {
	private long id;
	private String date;
	private String category;
	private String title;
	private String introduce;
	private String path;
	private String owner;
	private int checked;
	private int topid;
	private long istop;
	private int brandid;
	private int iworkid;
	private String brandiworkName;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getIntroduce() {
		return introduce;
	}
	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	
	public int getChecked() {
		return checked;
	}
	public void setChecked(int checked) {
		this.checked = checked;
	}
	public int getTopid() {
		return topid;
	}
	public void setTopid(int topid) {
		this.topid = topid;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getOwner() {
		return owner;
	}
	public long getIstop() {
		return istop;
	}
	public void setIstop(long istop) {
		this.istop = istop;
	}
	public int getBrandid() {
		return brandid;
	}
	public void setBrandid(int brandid) {
		this.brandid = brandid;
	}
	public int getIworkid() {
		return iworkid;
	}
	public void setIworkid(int iworkid) {
		this.iworkid = iworkid;
	}
	public void setBrandiworkName(String brandiworkName) {
		this.brandiworkName = brandiworkName;
	}
	public String getBrandiworkName() {
		return brandiworkName;
	}
	
	
	
}
