//package src;
//import src.Personne;

public class App{

	public static void main(String[] args){
		System.out.println("hello world");
		Personne personne = new Personne("elgaddari" , "abdeljabbar" , 20);
		System.out.println(personne.getNom());
		System.out.println(personne.getPrenom());
		System.out.println(personne.getAge());
	}
}