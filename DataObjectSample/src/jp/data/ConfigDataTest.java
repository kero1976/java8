package jp.data;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class ConfigDataTest {

	@Test
	void test1() {
		ConfigData c1 = new ConfigData(1, "あいうえお","XYC",100);
		ConfigData c2 = new ConfigData(1, "ABC","XYC",100);

		assertEquals(c1, c2);
	}

	@Test
	void test2() {
		ConfigData c1 = new ConfigData(1, "あいうえお","XYC",100);
		ConfigData c2 = new ConfigData(2, "ABC","XYC",100);

		assertNotEquals(c1, c2);
	}

	@Test
	void test3() {
		ConfigData c1 = new ConfigData(1, "あいうえお","XYC",100);
		ConfigData c2 = new ConfigData(1, "ABC","XYC",100);

		assertTrue(c1.equals(c2));
	}

	@Test
	void test4() {
		ConfigData c1 = new ConfigData(3, "あいうえお","XYC",100);
		ConfigData c2 = new ConfigData(10, "ABC","XYC",100);
		ConfigData c3 = new ConfigData(1, "ABC","XYC",100);
		ArrayList<ConfigData> list = new ArrayList<ConfigData>();
		list.add(c1);
		list.add(c2);
		list.add(c3);

		list.sort((a,b) -> a.getSno() - b.getSno());
		list.forEach(a ->System.out.println(a));
		assertTrue(c1.equals(c2));
	}
}
