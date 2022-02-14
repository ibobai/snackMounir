
public class Produit {

	//attribue de la calsse produit
	public String nom;
	public Double prix;
	public Integer quantit;
	public String desc;
	
	
	//Constructor sans attribues
	public Produit () {
		
	}
	
	//Constructor avec les attribues 
	public Produit(String nom, Double prix, Integer quantit, String desc) {
		super();
		this.nom = nom;
		this.prix = prix;
		this.quantit = quantit;
		this.desc = desc;
	}
	

	//les getters et setters
	public String getDesc() {
		return desc;
	}
	
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Double getPrix() {
		return prix;
	}
	public void setPrix(Double prix) {
		this.prix = prix;
	}
	public Integer getQuantit() {
		return quantit;
	}
	public void setQuantit(Integer quantit) {
		this.quantit = quantit;
	}
	
	
}
