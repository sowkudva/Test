
public class Books {
	
	 public static void main (String args[])
	 {
		 BooksDetail[] BD = new BooksDetail[2];
		 BD[0] = new BooksDetail();
		 BD[1] = new BooksDetail();
		 
		 BD[0].title ="Testing with Java";
		 BD[1].title="Algorithms";
		 
		 BD[0].author ="Sree";
		 BD[1].author="Sow";
		 
		 for (int i=0; i<BD.length; i++)
		 {
			 System.out.println(BD[i].title+" by "+BD[i].author);
		 }
	 }

	

}

 class BooksDetail
 {
	 String title;
	 String author;
 
 }