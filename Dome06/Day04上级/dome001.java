package Day04上级;

import java.util.ArrayList;
import java.util.List;

public class dome001 {

	public static void main(String[] args) {
		PList da=new PList("大企鹅");
		PList zhong=new PList("中企鹅");
		PList xiao=new PList("小企鹅");
		PList xiao1=new PList("小小企鹅");
		
	List<PList> pList=new ArrayList<PList>();
	pList.add(da);
	pList.add(zhong);
	pList.add(xiao);
	pList.add(xiao1);
	System.out.println("一共有"+pList.size()+"条企鹅");
	for(PList li:pList){
		System.out.println(li.getName());
	}
	pList.remove(xiao);
	System.out.println("删除后"+pList.size()+"条企鹅");
	if (pList.contains(xiao)) {
		System.out.println("有");
	}else {
		System.out.println("没有");
	}
	}

}
