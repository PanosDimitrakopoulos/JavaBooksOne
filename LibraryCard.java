public class LibraryCard {
	
	  private int aa;
	  private int date;
	  private String category;
	  private EBook [] ListofEBooks =new EBook [10];
	  private Book [] ListOfBooks = new Book [10];
	  private int numberOfBooks=0;
	  private int numberOfEBooks=0; 

	public void setLibraryCardDetails (int aa,int date,String category){
		this.aa=aa;
	    this.date=date;
	    this.category =new String(category);
	    
	}
	
	public void addBook(String author, int yearpublished, String field, String title, String publisher){
		ListofEBooks [numberOfBooks++]= new EBook(author, yearpublished, field, title, publisher);
	}
	
	public void addEBook(String author, int yearpublished, String field, String title, String publisher){
		ListOfBooks [numberOfEBooks++]= new Book(author, yearpublished, field, title, publisher);
	}
	
	public void printDetails(){
		System.out.println("The card's details are:"+aa+","+date+","+category);
	 for (int i=0;i < numberOfBooks;i++) ListofEBooks[i].printDetails();
	 for (int i=0;i<numberOfEBooks;i++) ListOfBooks[i].printDetails();
	}
	
	public int getTotalNumbers() {
		return numberOfBooks + numberOfEBooks;
	}
}