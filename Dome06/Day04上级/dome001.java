package Day04�ϼ�;

import java.util.ArrayList;
import java.util.List;

public class dome001 {

	public static void main(String[] args) {
		PList da=new PList("�����");
		PList zhong=new PList("�����");
		PList xiao=new PList("С���");
		PList xiao1=new PList("СС���");
		
	List<PList> pList=new ArrayList<PList>();
	pList.add(da);
	pList.add(zhong);
	pList.add(xiao);
	pList.add(xiao1);
	System.out.println("һ����"+pList.size()+"�����");
	for(PList li:pList){
		System.out.println(li.getName());
	}
	pList.remove(xiao);
	System.out.println("ɾ����"+pList.size()+"�����");
	if (pList.contains(xiao)) {
		System.out.println("��");
	}else {
		System.out.println("û��");
	}
	}

}
