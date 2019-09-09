package association;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
public class MemberDao {

	public static int save(Member m){
		int status=0;
		try{
			Connection con=MemberDao.getCon();
			PreparedStatement ps=con.prepareStatement("insert into member(nom,prenom,adresse,poste,entreprise) values(?,?,?,?,?)");
			ps.setString(1,m.getNom());
			ps.setString(2,m.getPrenom());
			ps.setString(3, m.getAdresse());
			ps.setString(4,m.getPoste());
			ps.setString(5,m.getEntreprise());
			status=ps.executeUpdate();
			con.close();
		}catch(Exception e){System.out.println(e);}
		return status;
	}
	public static int update(Member m){
		int status=0;
		try{
			Connection con=MemberDao.getCon();
			PreparedStatement ps=con.prepareStatement("update member set nom=?,prenom=?,adresse=?,poste=?,entreprise=? where idmember=?");
			ps.setString(1,m.getNom());
			ps.setString(2,m.getPrenom());
			ps.setString(3, m.getAdresse());
			ps.setString(4,m.getPoste());
			ps.setString(5,m.getEntreprise());
			ps.setInt(6,m.getIdMember());
			status=ps.executeUpdate();
			con.close();
		}catch(Exception e){System.out.println(e);}
		return status;
	}
	public static List<Member> view(){
		List<Member> list=new ArrayList<Member>();
		try{
			Connection con=AccountantDao.getCon();
			PreparedStatement ps=con.prepareStatement("select * from member");
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				Member m=new Member();
				m.setIdMember(rs.getInt("Member Id"));
				m.setNom(rs.getString("Nom"));
				m.setPrenom(rs.getString("Prenom"));
				m.setAdresse(rs.getString("Adresse"));
				m.setPoste(rs.getString("Poste"));
				m.setEntreprise(rs.getString("Entreprise"));
				list.add(m);
			}
			con.close();
		}catch(Exception e){System.out.println(e);}
		return list;
	}
	public static Member getMemberID(int idmember){
		Member m=new Member();
		try{
			Connection con=MemberDao.getCon();
			PreparedStatement ps=con.prepareStatement("select * from member where idmember=?");
			ps.setInt(1,idmember);
			ResultSet rs=ps.executeQuery();
			if(rs.next()){
				m.setIdMember(rs.getInt("ID Member"));
				m.setNom(rs.getString("Nom"));
				m.setPrenom(rs.getString("Nom"));
				m.setPoste(rs.getString("Poste"));
				m.setEntreprise(rs.getString("Entreprise"));
			}
			con.close();
		}catch(Exception e){System.out.println(e);}
		return s;
	}
	
}
