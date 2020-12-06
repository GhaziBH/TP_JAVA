package Ex2;

import java.util.Vector;

public class test {

	public static void main(String[] args) {
		 Vector <animal> list;
		 list= new Vector <animal> (4);
		 list.addElement(new chien());
		 list.addElement(new chat());
		 list.addElement(new chat());
		 list.addElement(new chien());
		 for(int i=0; i<list.size(); i++) {
			 list.elementAt(i).crier();
		 }

	}

}
