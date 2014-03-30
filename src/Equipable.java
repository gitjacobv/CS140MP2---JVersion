public class Equipable extends Items{

	int plusDmg;
	int plusAmr;
	int plusStr;
	int plusAgi;
	int plusInt;
	//0 - head, 1 - armor, 2 - weapon, 3 - accessory
	int type;
	boolean equipped;

	public Equipable(){}

	public Equipable(String name, int itemClass, int type, int plusDmg, int plusAmr, int plusStr, int plusAgi, int plusInt){
		this.name = name;
		this.itemClass = itemClass;
		this.type = type;
		this.plusDmg = plusDmg;
		this.plusAmr = plusAmr;
		this.plusStr = plusStr;
		this.plusAgi = plusAgi;
		this.plusInt = plusInt;
		
		this.setImgPath("images/items/equipable/" + name + ".png");
	}
	
	public int getPlusDmg() {
		return plusDmg;
	}
	public void setPlusDmg(int plusDmg) {
		this.plusDmg = plusDmg;
	}
	public int getPlusStr() {
		return plusStr;
	}
	public void setPlusStr(int plusStr) {
		this.plusStr = plusStr;
	}
	public int getPlusAgi() {
		return plusAgi;
	}
	public void setPlusAgi(int plusAgi) {
		this.plusAgi = plusAgi;
	}
	public int getPlusInt() {
		return plusInt;
	}
	public void setPlusInt(int plusInt) {
		this.plusInt = plusInt;
	}
	public int getPlusAmr() {
		return plusAmr;
	}
	public void setPlusAmr(int plusAmr) {
		this.plusAmr = plusAmr;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	
}
