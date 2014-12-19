public class EBook {
	
	 private String author;
	 private int yearpublished;
	 private String field;
	 private String title; 	
	 private String publisher;
	
	
	public EBook(String author, int yearpublished, String field, String title, String publisher) {
		this.author = author;
		this.yearpublished = yearpublished;
		this.field = field;
		this.title = title;
		this.publisher = publisher;
	}

	public void printDetails(){
		   System.out.println ("The details of the Digital Book are: "+author+","+field
				   +","+title+","+ yearpublished+","+publisher);
	}//end printDetails()

}//end of class