
public class CPU {
	private String brand;
	private String model;
	private String soket;
	private double power;
	private int cores;
	
	
	public CPU() {
		super();
	}

	public CPU(String brand, String model, String soket, double power, int cores) {
		super();
		this.brand = brand;
		this.model = model;
		this.soket = soket;
		this.power = power;
		this.cores = cores;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getSoket() {
		return soket;
	}

	public void setSoket(String soket) {
		this.soket = soket;
	}

	public double getPower() {
		return power;
	}

	public void setPower(double power) {
		this.power = power;
	}

	public int getCores() {
		return cores;
	}

	public void setCores(int cores) {
		this.cores = cores;
	}
	
}
