package Day04上级;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import Day01.Dog;

public class dome002 {

	public static void main(String[] args) {
		Map countries = new HashMap();
		Pet ooDog =new Pet("欧欧"," 雪纳瑞");
		Pet yayaDog =new Pet("亚亚", "拉布拉多犬");
		Pet meimeiDog =new Pet("美美", "拉布拉多的");
		Pet kukuDog =new Pet("哭哭", "沙皮");
		
		countries.put(ooDog.getName(), ooDog);
		countries.put(yayaDog.getName(), yayaDog);
		countries.put(meimeiDog.getName(), meimeiDog);
		countries.put(kukuDog.getName(), kukuDog);

		if (countries.containsKey("亚亚")) {
			Pet str = (Pet) countries.get("亚亚");
			System.out.println("亚亚对应的宠物是:" +str.getType());
		} else {
			System.out.println("无对应宠物!");
		}

	}
	}

