package tuanthanh_66133391;

public class HocSinh {
	// Cac thuoc tinh theo yeu cau 
	private String tenHS;
	private short tuoiHS;
	private String lopHS;
	// Cac ham tao
	public HocSinh() {
		
	}
	
	public HocSinh(String tenHS, short tuoiHS, String lopHS) {
		super();
		this.tenHS = tenHS;
		this.tuoiHS = tuoiHS;
		this.lopHS = lopHS;
	}

	// Getter va Setter 
	public String getTenHS() {
		return tenHS;
	}
	public void setTenHS(String tenHS) {
		this.tenHS = tenHS;
	}
	public short getTuoiHS() {
		return tuoiHS;
	}
	public void setTuoiHS(short tuoiHS) {
		this.tuoiHS = tuoiHS;
	}
	public String getLopHS() {
		return lopHS;
	}
	public void setLopHS(String lopHS) {
		this.lopHS = lopHS;
	}

	@Override
	public String toString() {
		String chuoiXuat;
		chuoiXuat = "\nHo va ten: " + tenHS;
		chuoiXuat =chuoiXuat + "\nTuoi HS: " + tuoiHS;
		chuoiXuat =chuoiXuat + "\nLop HS: " + lopHS;
		return chuoiXuat;
//		return "HocSinh [tenHS=" + tenHS + ", tuoiHS=" + tuoiHS + ", lopHS=" + lopHS + "]";
	}
	
}
