package jp.data;

import java.io.Serializable;
import java.util.ArrayList;

import jp.api.Save;

public class ConfigDataList implements Serializable, Save{

	private 	ArrayList<ConfigData> list = new ArrayList<ConfigData>();

	public ArrayList<ConfigData> getList() {
		return list;
	}

	public void setList(ArrayList<ConfigData> list) {
		this.list = list;
	}

	public ConfigDataList() {

	}




}
