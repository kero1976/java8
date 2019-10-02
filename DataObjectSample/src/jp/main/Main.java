package jp.main;

import java.util.List;

import jp.data.ConfigData;
import jp.data.ConfigDataList;
import jp.data.LogData;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		String fileName = "Sample.xml";

		//ConfigData c1 = new ConfigData();
//		ConfigData c1 = new ConfigData(1, "あいうえお","XYC",100);
//		c1.save();
//		ConfigData c2 = new ConfigData().load("Config1.xml");
//		System.out.println(c2.getStr1());

		LogData l1 = new LogData("あいうえお","XYC");
		l1.save();
		LogData l2 = new LogData().load("LogDataあいうえお.xml");
		System.out.println(l2.getStr1());


		ConfigDataList list2 = new ConfigDataList();

		List<ConfigData> list = list2.getList();
		ConfigData c1 = new ConfigData(3, "あいうえお","XYC",100);
		ConfigData c2 = new ConfigData(10, "ABC","XYC",100);
		ConfigData c3 = new ConfigData(1, "ABC","XYC",100);
		list.add(c1);
		list.add(c2);
		list.add(c3);


		list2.saveXml("allxml.txt");

		// オブジェクトのデータを保存
//        try {
//            XMLEncoder encoder = new XMLEncoder(
//                new BufferedOutputStream(
//                    new FileOutputStream(fileName)
//                ),
//                "UTF-8",
//                true,
//                4
//            );
//            encoder.writeObject(c1);
//            encoder.close();
//        } catch(Exception e) {
//            e.printStackTrace();
//        }
	}

}
