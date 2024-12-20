//package src;
public class Personne{

	private String nom;
	private String prenom;
	private int age;


	public Personne(){

	}

	public Personne(String nom , String prenom , int age){
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
	}

	public int getAge(){
		return this.age;
	}
	public String getNom(){
		return this.nom;
	}
	public String getPrenom(){
		return this.prenom;
	}

	public void setAge(int age){
		this.age = age;
	}
	public void setNom(String nom){
		this.nom = nom;
	}
	public void setPrenom(String prenom){
		this.prenom = prenom;
	}
}