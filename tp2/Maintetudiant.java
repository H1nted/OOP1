package tp2;

public class Maintetudiant {

	public static void main(String[] args) {
		
		
//we are going to construct our students !!
		
		Etudiant etud1 = new Etudiant("Wassim", 23, 16., 15., 14.);
		Etudiant etud2 = new Etudiant("Jean", 23);
		Etudiant etud3 = new Etudiant("Abdoulkhader", 23);
		Etudiant etud4 = new Etudiant("Astrid",26);
		Etudiant etud5 = new Etudiant("Paolo", 27);
		Etudiant etud6 = new Etudiant("Zoe", 26, 12, 14, 17);
		Etudiant etud8 = new Etudiant("Pierre", 24, 1, 2);

// we are now going to access (GET) the informations on our constructed students
		System.out.println("##################################################");
		
//		System.out.println("le nom de l'étudiant 1 est : "+etud1.getNom());
//		System.out.println("l'age de l'étudiant 1 est : "+etud1.getAge());
//		System.out.println("la note de programmation de l'étudiant 1 est : "+etud1.getNoteProg());
//		System.out.println("la note de systeme de l'étudiant 1 est : "+etud1.getNoteSyst());
//		System.out.println("la note de stage de l'étudiant 1 est : "+etud1.getNoteStage());
		
		// Pour une facon moins chronophage on peut juste faire ToString dans la classe étudiant et 
		// puis just system.out.println(mon objet);
		System.out.println(etud1);
		System.out.println();
		System.out.println(etud2);
		System.out.println();
		System.out.println(etud3);
		System.out.println();
		System.out.println(etud4);	
		System.out.println();
		System.out.println(etud5);	
		System.out.println();
		System.out.println(etud6);
		System.out.println();
		System.out.println(etud8);
		System.out.println();
		
// we are going to SET some variables in order to modify the already existing students
		
		etud1.setNom("Wassim AMMAR");
		//etud1.setInscription(2,2);
		
//Modifier l’ˆage de Jean en mettant la valeur 25
//Donner a Jean les notes 8 (programmation), 7 (système), 11 (stage), quebecois , 1 er inscri
		
		etud2.setAge(25);
		etud2.setNoteProg(8);
		etud2.setNoteSyst(7);
		etud2.setNoteStage(11);
		//etud2.setInscription(2,1);
		
//Donner a Adoulkhader les notes 10 (programmation), 14 (systeme), 11 (stage) , tunisien fr , reinscri
		etud3.setNoteProg(10);
		etud3.setNoteSyst(14);
		etud3.setNoteStage(11);
		//etud3.setInscription(2,2);

//Donner a Astrid les notes 12 (programmation), 5 (systeme), 18 (stage), finnish , 1 inscri
		etud4.setNoteProg(12);
		etud4.setNoteSyst(25);
		etud4.setNoteStage(18);
		//etud4.setInscription(3,1);

//Donner a Paolo les notes 2 (programmation), 10 (systeme), 11 (stage), brezilien, 1 inscri
		etud5.setNoteProg(2);
		etud5.setNoteSyst(10);
		etud5.setNoteStage(11);
		//etud5.setInscription(3,1);

// Modifier la note de programmation de Zoe qui devient 15	francaise, 1 inscri	
		etud6.setNoteProg(15);
		//etud6.setInscription(1,1);
		
//      affichage des modifications
		System.out.println("##################################################");
		System.out.println("------------------------Après modification------------------------");
//		on reprend les system out print pour voir les modifications	
		System.out.println(etud1);
		System.out.println("la moyenne de l'étudiant est : " + etud1.moyenne()+ " avec la mention : " + etud1.mention());
		System.out.println();
		System.out.println(etud2);
		System.out.println("la moyenne de l'étudiant est : " + etud2.moyenne()+ " avec la mention : " + etud2.mention());
		System.out.println();
		System.out.println(etud3);
		System.out.println("la moyenne de l'étudiant est : " + etud3.moyenne()+ " avec la mention : " + etud3.mention());
		System.out.println();
		System.out.println(etud4);
		System.out.println("la moyenne de l'étudiant est : " + etud4.moyenne()+ " avec la mention : " + etud4.mention());
		System.out.println();
		System.out.println(etud5);
		System.out.println("la moyenne de l'étudiant est : " + etud5.moyenne()+ " avec la mention : " + etud5.mention());
		System.out.println();
		System.out.println(etud6);
		System.out.println("la moyenne de l'étudiant est : " + etud6.moyenne()+ " avec la mention : " + etud6.mention());
		System.out.println();
		System.out.println(etud8);
		System.out.println();
		//etud6.mention();
		
		//System.out.println(etud6.LigneResultat());
// create new student :
		System.out.println("##################################################");	
		Etudiant etud7 = new Etudiant();		
		System.out.println("~~~~ Creer un nouveau étudiant ~~~~");		
		etud7.saisie();
								//      SPACE
		System.out.println();
		System.out.println();
		System.out.println();
								//	   SPACE   ///montrer l'inscription\\\
//		System.out.println(etud7);
//		System.out.println(etud7.LigneResultat());
		System.out.println("la moyenne de l'étudiant est : " + etud7.moyenne()+ " / mention : " + etud7.mention() + etud7.getInscri());
								//      SPACE
		System.out.println();
		System.out.println();
		System.out.println();
								//	   SPACE   ///montrer la promo \\\
		Promotion promoIco = new Promotion("ICo",2022);
		

		

		

		


		
		
		
		
		
		
		

	}

}
