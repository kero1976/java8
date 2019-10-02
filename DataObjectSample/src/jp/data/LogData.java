package jp.data;

import jp.api.DataBase;

public class LogData extends DataBase<LogData>{

	private String str1;
	private String str2;
	public String getStr1() {
		return str1;
	}
	public void setStr1(String str1) {
		this.str1 = str1;
	}
	public String getStr2() {
		return str2;
	}
	public void setStr2(String str2) {
		this.str2 = str2;
	}

	public LogData() {

	}

	public LogData(String str1, String str2) {
		this.str1 = str1;
		this.str2 = str2;
	}

	public String getName() {
		// TODO 自動生成されたメソッド・スタブ
		return "LogData" + getStr1() + ".xml";
	}

	@Override
	public boolean EqualsCore(LogData o) {
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}
}
