package tpPostal;

public class MainObjetPostal {

	public static void main(String[] args) {
		
		//Première partie // on ne peut plus creer des objets car c'est abstrait 
		
//		ObjetPostal objet1 = new ObjetPostal("Montpellier","Lyon",91150,100,1,Recommandation.R0);
//		ObjetPostal objet2 = new ObjetPostal("Montpellier","Marseille",13000,50,0.5,Recommandation.R1);
//		ObjetPostal objet3 = new ObjetPostal("Montpellier","Montpellier",34000,100,1,Recommandation.R2);
//		ObjetPostal objet4 = new ObjetPostal("Montpellier","Limoges",87000,50,0.5,Recommandation.R0);
//		ObjetPostal objet5 = new ObjetPostal("Montpellier","Toulouse",31000,100,1,Recommandation.R1);
//		ObjetPostal objet6 = new ObjetPostal("Montpellier","Bordeaux",33000,50,0.5,Recommandation.R2);
//		ObjetPostal objet7 = new ObjetPostal("Montpellier","Strasbourg",67000,100,1,Recommandation.R0);
//		ObjetPostal objet8 = new ObjetPostal("Montpellier","Brest",29200,50,0.5,Recommandation.R1);
//		ObjetPostal objet9 = new ObjetPostal("Montpellier","Lille",59000,70,0.7,Recommandation.R2);
//		ObjetPostal objet10 = new ObjetPostal("Montpellier","Nice",06000,200,1.5,Recommandation.R2);
		
//		System.out.println("#################  On montre les ojbets de la classe supérieure #################\n\n");
//		System.out.println(objet1.toString());
//		System.out.println(objet2.toString());
//		System.out.println(objet3.toString());
//		System.out.println(objet4.toString());
//		System.out.println(objet5.toString());
//		System.out.println(objet6.toString());
//		System.out.println(objet7.toString());
//		System.out.println(objet8.toString());
//		System.out.println(objet9.toString());
//		System.out.println(objet10.toString());
		
		//Deuxième partie
		Letter lettre1 = new Letter("Wassim, Montpellier"," la famille Kouk, igloo 2, banquise nord",420420,15,0.1,Recommandation.R2,State.Ordinary);
		Letter lettre2 = new Letter("Loum, Montpellier"," la famille Kouk, igloo 2, banquise nord",420420,15,0.1,Recommandation.R2,State.Urgent);
		
		System.out.println("\n\n#################  On montre les ojbets de la sous classe lettre #################\n\n");
		System.out.println(lettre1.toStringLettre());
		System.out.println();
		System.out.println(lettre2.toStringLettre());

		//Troisième partie
		Colis colis1 = new Colis("Wassim, Tunisie"," la famille Kouk, igloo 2, banquise nord",420420,15,0.1,Recommandation.R2,"Console de jeu",500);
		Colis colis2 = new Colis("Loum, Senegal"," la famille Kouk, igloo 2, banquise nord",420420,15,0.1,Recommandation.R2,"Vêtements de marque",10.00);
		
		System.out.println("\n\n#################  On montre les ojbets de la sous classe colis #################\n\n");
		System.out.println(colis1.toStirngColis());
		System.out.println();
		System.out.println(colis2.toStirngColis());
		
		Letter lettrecase0 = new Letter("Wassim, Montpellier"," la famille Kouk, igloo 2, banquise nord",420420,15,0.001,Recommandation.R0,State.Ordinary);
		Letter lettrecase0u= new Letter("Wassim, Montpellier"," la famille Kouk, igloo 2, banquise nord",420420,15,0.001,Recommandation.R0,State.Urgent);
		Letter lettrecase1 = new Letter("Wassim, Montpellier"," la famille Kouk, igloo 2, banquise nord",420420,15,0.01,Recommandation.R1,State.Ordinary);
		Letter lettrecase1u= new Letter("Wassim, Montpellier"," la famille Kouk, igloo 2, banquise nord",420420,15,0.1,Recommandation.R1,State.Urgent);
		Letter lettrecase2 = new Letter("Wassim, Montpellier"," la famille Kouk, igloo 2, banquise nord",420420,15,0.1,Recommandation.R2,State.Ordinary);
		Letter lettrecase2u= new Letter("Wassim, Montpellier"," la famille Kouk, igloo 2, banquise nord",420420,15,0.1,Recommandation.R2,State.Urgent);
		
		
		System.out.println("\n\n#################  On montre les tarifA  Lettres#################\n\n");
		System.out.println("Prix Recommendation0");
		System.out.println(lettrecase0.tarifA());
		System.out.println(lettrecase0u.tarifA());
		System.out.println();
		System.out.println("Prix Recommendation1");
		System.out.println(lettrecase1.tarifA());
		System.out.println(lettrecase1u.tarifA());
		System.out.println();
		System.out.println("Prix Recommendation2");
		System.out.println(lettrecase2.tarifA());
		System.out.println(lettrecase2u.tarifA());
		
		
		Colis coliscase0 = new Colis("Wassim, Tunisie"," la famille Kouk, igloo 2, banquise nord",420420,15,1,Recommandation.R0,"Console de jeu",500);
		Colis coliscase0u = new Colis("Wassim, Tunisie"," la famille Kouk, igloo 2, banquise nord",420420,1000,0.2,Recommandation.R0,"Console de jeu",500);
		Colis coliscase1 = new Colis("Wassim, Tunisie"," la famille Kouk, igloo 2, banquise nord",420420,15,0.1,Recommandation.R1,"Console de jeu",500);
		Colis coliscase1u = new Colis("Wassim, Tunisie"," la famille Kouk, igloo 2, banquise nord",420420,1000,0.01,Recommandation.R1,"Console de jeu",500);
		Colis coliscase2 = new Colis("Wassim, Tunisie"," la famille Kouk, igloo 2, banquise nord",420420,15,0.1,Recommandation.R2,"Console de jeu",500);
		Colis coliscase2u = new Colis("Wassim, Tunisie"," la famille Kouk, igloo 2, banquise nord",420420,1000,0.1,Recommandation.R2,"Console de jeu",500);

		System.out.println("\n\n#################  On montre les tarifA  Colis #################\n\n");
		System.out.println("Prix Recommendation0");
		System.out.println(coliscase0.tarifA());
		System.out.println(coliscase0u.tarifA());
		System.out.println();
		System.out.println("Prix Recommendation1");
		System.out.println(coliscase1.tarifA());
		System.out.println(coliscase1u.tarifA());
		System.out.println();
		System.out.println("Prix Recommendation2");
		System.out.println(coliscase2.tarifA());
		System.out.println(coliscase2u.tarifA());
	
//		System.out.println("\n\n#################  On montre les tarifA  objet #################\n\n");
//		System.out.println(objet1.tarifA());
//		System.out.println(objet2.tarifA());
//		System.out.println(objet3.tarifA());
//		System.out.println(objet4.tarifA());
	
	
	
		System.out.println("\n\n#################  On montre les tarifR  Lettres#################\n\n");
		System.out.println("Prix Recommendation0");
		System.out.println(lettrecase0.tarifR());
		System.out.println(lettrecase0u.tarifR());
		System.out.println();
		System.out.println("Prix Recommendation1");
		System.out.println(lettrecase1.tarifR());
		System.out.println(lettrecase1u.tarifR());
		System.out.println();
		System.out.println("Prix Recommendation2");
		System.out.println(lettrecase2.tarifR());
		System.out.println(lettrecase2u.tarifR());
	
		
		System.out.println("\n\n#################  On montre les tarifR  Colis #################\n\n");
		System.out.println("Prix Recommendation0");
		System.out.println(coliscase0.tarifR());
		System.out.println(coliscase0u.tarifR());
		System.out.println();
		System.out.println("Prix Recommendation1");
		System.out.println(coliscase1.tarifR());
		System.out.println(coliscase1u.tarifR());
		System.out.println();
		System.out.println("Prix Recommendation2");
		System.out.println(coliscase2.tarifR());
		System.out.println(coliscase2u.tarifR());
	
		
		System.out.println("\n\n#################  travail sur le sac #################\n\n");
		SacPostal panier = new SacPostal();
		System.out.println(panier.getCapacity());
		System.out.println();
		System.out.println(panier.getObjets());
		System.out.println(panier.maxVolume());
//		System.out.println(panier.addObjet(lettrecase0u));
		System.out.println(panier.addObjet(coliscase0));
		System.out.println(panier.getObjets());
		System.out.println(panier.maxVolume());
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
}

