
public class Produit {

	public String nom;
	public Double prix;
	public Integer quantit;
	public String desc;
	
	
	
	public Produit () {
		
	}
	
	
	public Produit(String nom, Double prix, Integer quantit, String desc) {
		super();
		this.nom = nom;
		this.prix = prix;
		this.quantit = quantit;
		this.desc = desc;
	}
	
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
