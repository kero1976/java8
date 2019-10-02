package jp.data;

import jp.api.DataBase;

public class ConfigData extends DataBase<ConfigData>{

	private int sno;
	private String str1;
	private String str2;
	private int int1;

	public int getSno() {
		return sno;
	}
	public String getStr1() {
		return str1;
	}
	public String getStr2() {
		return str2;
	}
	public int getInt1() {
		return int1;
	}

	public ConfigData() {

	}
	public ConfigData(
			int sno,
			String str1,
			String str2,
			int int1) {

		this.sno = sno;
		this.str1 = str1;
		this.str2 = str2;
		this.int1 = int1;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public void setStr1(String str1) {
		this.str1 = str1;
	}
	public void setStr2(String str2) {
		this.str2 = str2;
	}
	public void setInt1(int int1) {
		this.int1 = int1;
	}

	public String getName() {
		return "Config" + getSno() + ".xml";
	}
	@Override
	public boolean EqualsCore(ConfigData o) {
		// TODO 自動生成されたメソッド・スタブ
		return this.sno == o.sno;
	}

	@Override
	public String toString() {
		// TODO 自動生成されたメソッド・スタブ
		return this.getSno() + " ";
	}

}
