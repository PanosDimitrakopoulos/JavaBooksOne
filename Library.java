public class Library{
	
	public static void main(String [] args){
	    
	    LibraryCard [] CardList = new LibraryCard[2];
	    
	    CardList[0] = new LibraryCard (); //LibraryCard no1
	    CardList[0].setLibraryCardDetails(01,2010,"Computer Science");
	    CardList[0].addBook("Steve McConnell",2004,"Software Engineering",
	    	"Code Complete:A Practical Handbook of Software Construction (2nd Edition)", "Microsoft Press");
	    CardList[0].addBook("Robert C. Martin",2002,"Software Design and Modeling",
	    	"Agile Software Development: Principles, Patterns and Practices", "Prentice Hall");
	    CardList[0].addEBook("Bruce Eckel",2002,"Object Oriented Programming","Thinking in Java (3rd Edition)",
	    	"Prentice-Hall");
	    CardList[0].addEBook("Benjamin C. Pierce",2010,"c","Software Foundations",
	    	"University of Pennsylvania");
	    CardList[0].addEBook("Damith C. Rajapakse", 2008, "Software Engineering", 
	    	"Practical Tips for Software-Intensive Student Projects", "self-published");
	    
	    
	    CardList[1]=new LibraryCard(); //LibraryCard no2
	    CardList[1].setLibraryCardDetails(02,2011,"Electical Engineering");
	    CardList[1].addBook("Alexopoulos-Lagogiannis",2004,"Networks","Telecommunications & Computer Networks",
	    	"self-published");
	    CardList[1].addBook("Andrew S. Tanenbaum",2003,"Networks","Computer networks (3rd Edition)", 
	    	"Prentice Hall");
	    CardList[1].addEBook("W. Richard Stevens",2004,"Network programming",
	    	"TCP/IP Illustrated: The protocols", "Addison Wesley");
	    
	    CardList[0].printDetails();
	    System.out.println("***************************************************************************************************************************************************************************");
	    CardList[1].printDetails();
	    System.out.println("***************************************************************************************************************************************************************************");
	    System.out.println("The most common card is No" + findFavorite(CardList));
	}//end main()

	private  static int findFavorite(LibraryCard [] CardList){
		int favoriteCardId=0;
		int cardsTotal=0;
		
		for (int i=0; i < CardList.length; i++) {
			int temp = 0;
			if ((temp = CardList[i].getTotalNumbers()) > cardsTotal){
				cardsTotal = temp;
				favoriteCardId = i;
			}//end if	
		}//end loop
		return favoriteCardId+1; 
	}//end findFavorite()
	
}//end class