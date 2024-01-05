package demo.dp.builder.components;

public class CPU {
	private String name;
	private String type;
	private String supplier;

	public CPU(String name, String type, String supplier) {
		super();
		this.name = name;
		this.type = type;
		this.supplier = supplier;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSupplier() {
		return supplier;
	}

	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}
}
