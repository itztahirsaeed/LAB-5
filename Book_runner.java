package Lab5TAHIR_SAEED;

public class Book_runner {

	public static void main(String[] args) {
		Book b=new Book();
		//sets default values
		b.set();
		String[] r=new String [20];
		r[0]="abc";
		r[1]="zxc";
		r[2]="qw";
		r[3]="eq";
		Book b1=new Book("tahir",r);
		Book c=new Book();
		Book c1=new Book();
		
		c.compareBooks(b, b1);
		if(c.compare)
		{
			System.out.println("\nAuthor is SAME");
		}
		c1=b.comparech(b, b1);
		//System.out.println("\n Author of Book With Laegest Chapters is: "+ c1.);
	}

}
