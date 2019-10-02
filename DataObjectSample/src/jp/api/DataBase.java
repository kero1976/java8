package jp.api;

import java.io.Serializable;

public abstract class DataBase<T> implements Serializable, Save, Load<T>{

	public abstract String getName();

	public abstract boolean EqualsCore(T o);

	public boolean save() {
		return saveXml(getName());
	}

	public T load(String fileName) {
		return loadXml(fileName);
	}
	public boolean equals(Object o) {
		if(o instanceof DataBase) {
			return EqualsCore((T)o);
		}

		return false;
	}
}
