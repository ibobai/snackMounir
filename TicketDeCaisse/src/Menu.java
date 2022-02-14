import java.util.ArrayList;

public class Menu {

	public static void affichageMenu(ArrayList<Produit> produits) {
		System.out.println("");
		System.out.println("---------------------------      Snack Mounir     ------------------------------");
		System.out.println("|                                                                               |");
		System.out.println("--------------------------------------------------------------------------------");
		System.out.println();
		
//		Affichage Menu
		System.out.println("---------------------------- Nos Produits sont --------------------------------");
		for(Produit pro: produits) {
			System.out.println("|-> "+pro.getNom() +" | :  Prix :  "+pro.getPrix() + " : Quantité :  "+pro.getQuantit());
		}
	}
}
