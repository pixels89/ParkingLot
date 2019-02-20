package in.barmans.mukesh.parkinglot.model;

public class Car {
	private String licenseNum;
	private SizeType type;

	public String getLicenseNum() {
		return licenseNum;
	}

	public void setLicenseNum(String licenseNum) {
		this.licenseNum = licenseNum;
	}

	public SizeType getType() {
		return type;
	}

	public void setType(SizeType type) {
		this.type = type;
	}

}
