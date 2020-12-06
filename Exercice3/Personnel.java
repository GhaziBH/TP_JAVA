package ex3;

import java.util.Vector;

public class Personnel {
	public Vector <Employé> list;
	public Personnel(int nbrE)
	{
		list= new Vector <Employé> (nbrE);
	}
	public void ajouterEmploye(Employé emp) {
		list.addElement(emp);
	}
	public void calculerSalaires() {
		for(int i=0; i< list.size(); i++)
		{
			System.out.println("la salaire de "+ list.elementAt(i).getNom()+ "est : "+ list.elementAt(i).calculerSalaire());
			
		}
			
	}
	public double salaireMoyen() {
		double S=0;
		double M=0;
		for(int i=0;i<list.size();i++)
			S+=list.elementAt(i).calculerSalaire();
		M=(S/list.size());
		return M;
		
	}
}
