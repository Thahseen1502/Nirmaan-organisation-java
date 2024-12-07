package day12;

public class Book {

	private String title;
	private String author;
	private double price;
	private int noOfCopies;
	
	Book(String title,String author,double price, int noOfCopies){
		this.title=title;
		this.author=author;
		this.price=price;
		this.noOfCopies=noOfCopies;
		
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public double getPrice() {
		return price;
	}
	public int getNoOfCopies() {
		return noOfCopies;
	}
	
	
	public void setTitle(String title) {
		this.title =title;
	}
	public void setAuthor(String author) {
		this.author=author;
	}
	public void setPrice(double price) {
		this.price=price;
	}
	public void setNoOfCopies(int noOfCopies) {
		this.noOfCopies=noOfCopies;
	}
	
	public String toString() {
		return "Book[Title = "+title+", Author = "+author+",Price = "+price+", Copies = "+noOfCopies+"]";
}
	
	
	
}
