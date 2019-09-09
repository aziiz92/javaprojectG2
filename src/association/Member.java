package association;

public class Member {
private int idmember;
private String nom,prenom,adresse,poste,entreprise;



public Member(String nom, String prenom, String adresse, String poste, String entreprise) {
	super();
	this.nom = nom;
	this.prenom = prenom;
	this.adresse = adresse;
	this.poste = poste;
	this.entreprise = entreprise;
}

public Member(int idmember, String nom, String prenom, String adresse,  String poste, String entreprise) {
	super();
	this.idmember = idmember;
	this.nom = nom;
	this.prenom = prenom;
	this.adresse = adresse;
	this.poste = poste;
	this.entreprise = entreprise;
	
}

public int getIdMember() {
	return idmember;
}
public void setIdMember(int idmember) {
	this.idmember = idmember;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public String getPrenom() {
	return prenom;
}
public void setPrenom(String prenom) {
	this.prenom = prenom;
}
public String getAdresse() {
	return adresse;
}
public void setAdresse(String adresse) {
	this.adresse = adresse;
}

public String getPoste() {
	return poste;
}
public void setPoste(String poste) {
	this.poste = poste;
}
public String getEntreprise() {
	return entreprise;
}
public void setEntreprise(String entreprise) {
	this.entreprise = entreprise;
}
}
