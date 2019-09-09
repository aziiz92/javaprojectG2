package association;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;

public class ViewMember extends JFrame {
	static ViewMember frame;
	public ViewMember() {
		//Code to view data in JTable
		List<Member> list=MemberDao.view();
		int size=list.size();
		
		String data[][]=new String[size][12];
		int row=0;
		for(Member m:list){
			data[row][0]=String.valueOf(m.getIdMember());
			data[row][1]=m.getNom();
			data[row][2]=m.getPrenom();
			data[row][3]=m.getAdresse();
			data[row][4]=m.getPoste();
			data[row][5]=m.getEntreprise();
			
			row++;
		}
		String columnNames[]={"IdMember","Nom","Prenom","Adresse","Poste","Entreprise"};
		
		JTable jt=new JTable(data,columnNames);
		JScrollPane sp=new JScrollPane(jt);
		add(sp);
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 800, 400);
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new ViewMember();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
