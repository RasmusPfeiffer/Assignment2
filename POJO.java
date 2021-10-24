package Assignment2;

public class POJO {

	private String title;
	private String company;
	private String compensation;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getCompensation() {
		return compensation;
	}

	public void setCompensation(String compensation) {
		this.compensation = compensation;
	}

	public String getJobInfo() {
		String sJobInfo = (this.getTitle() + "\n" + this.getCompany() + "\n" + this.getCompensation() + "\n");
		return sJobInfo;
	}
}
