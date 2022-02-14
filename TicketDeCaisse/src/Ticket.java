import java.util.ArrayList;
import java.util.Scanner;

public class Ticket {

	//Pour l'affichage de ticket
	public static void affichageTicket(ArrayList<Produit> consoms, Double total) {
		System.out.println("\n");
		System.out.println("----------------------- ticket --------------------------");
		System.out.println("|                                                       |");
		System.out.println("---------------------------------------------------------");
		
		System.out.println("-------------------- Vos consomations   -----------------\n");
		for(Produit pro: consoms) {
			System.out.println("|-> "+pro.getNom() +"| :  Prix :  "+pro.getPrix() + " : Quantité :  "+pro.getQuantit());
		}
		System.out.println("|-> Prix total  : " +  total);
		System.out.println("");
		System.out.println("---------------------------------------------------------");
		System.out.println("|                                                       |");
		System.out.println("---------------------------------  ----------------------");
	}
	
	
	public static void maCaisse() {
		
		
		

 		Scanner s = new Scanner(System.in);
		String elem = "";
		
		//Les produits qui sont déja dans le menu
		ArrayList<Produit> produits = new ArrayList<Produit>();
		ArrayList<Produit> consoms = new ArrayList<Produit>();
		produits.add(new Produit("Pizza",5.3, 1, "Pizza Spicy"));
		produits.add(new Produit("Tacos",5.3, 1, "Tacos poulet"));
		produits.add(new Produit("Coca",5.3, 1, "Coca sans Sucre"));
		produits.add(new Produit("Lazania",5.3, 1, "Lazania spicy"));

	
		//Total
		Double total = 0.0;
		
                //Appel pour afficher le menu
		Menu.affichageMenu(produits);

		System.out.println("--------------------------------------------------------------------------------");
		System.out.println("\n");
		
		//Demander à l'utilisateur de saisir ce quil a consommé."
		while (!elem.equals("stop")) {
			System.out.print("Entrez ce que vous avez consomé ou stop pour stopper : ");
			elem = s.nextLine();
			Produit proChoisi = new Produit();
			Boolean existe = false;
			Integer proQuantit = 1;
                        
                        //Vérifier si la valeur entrée est déja dans le menu
			if(!elem.equals("stop")) {
				for(Produit pro: produits) {
					if(pro.getNom().equals(elem)) {
						existe = true;
						proChoisi = pro;
					}
				}
				System.out.print("Entrez la quantité SVP : ");
				 proQuantit = Integer.parseInt(s.nextLine());
				 proChoisi.setQuantit(proQuantit);
				 
			}
		
			
			//Création de l'objet produit
			if(existe) {
				total = (Double) (total + proChoisi.getPrix() * proChoisi.getQuantit());
				consoms.add(new Produit(proChoisi.getNom(), proChoisi.getPrix(),proChoisi.getQuantit(), ""));
				System.out.println("Produit ajouté  : " + elem + "  |  Quantité ajoutée : "+proChoisi.getQuantit());
			} else if ( !elem.equals("stop")){
				// Si le produit n'est pas dans le menu
				System.out.print("Voulez vous ajouter un produit qui n'est pas dans la list o/n ? : ");
				elem = s.nextLine();
				if(elem.equals("o")) {
					System.out.print("Entrez le nom du produit SVP  : ");
					String pro = s.nextLine();
					System.out.println("Produit entré : " + pro);
					System.out.print("Entrez le prix SVP  : ");
					String prix = s.nextLine();
					System.out.println("Prix entré : " + prix);
					System.out.print("Entrez la quantitié SVP  : ");
					String quantit = s.nextLine();
					System.out.print("Entrez la description SVP  : ");
					String desc = s.nextLine();
					total += Float.parseFloat(prix)*Integer.parseInt(quantit);
					consoms.add(new Produit(pro, Double.parseDouble(prix), Integer.parseInt(quantit), desc));
					
					

					
				
				}
			}
			
			
			
		}
		
		//Ticket affichage code.
		affichageTicket(consoms, total);
		
	
		
	}
	
}
