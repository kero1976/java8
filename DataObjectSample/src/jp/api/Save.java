package jp.api;

import java.beans.XMLEncoder;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public interface Save {

	public default boolean saveXml(String fileName) {
		// オブジェクトのデータを保存
		try (XMLEncoder encoder = new XMLEncoder(
				new BufferedOutputStream(
						new FileOutputStream(fileName)))) {
			encoder.writeObject(this);
		} catch (FileNotFoundException e) {
			return false;
		}
		return true;
	}
}
