package jp.api;

import java.beans.XMLDecoder;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public interface Load<T> {

	public default T loadXml(String fileName) {

		try (XMLDecoder decoder = new XMLDecoder(
				new BufferedInputStream(
						new FileInputStream(fileName)))) {
			return (T) decoder.readObject();
		} catch (FileNotFoundException e) {
			return null;
		}
	}
}
