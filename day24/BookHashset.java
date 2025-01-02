package day24;

import java.util.Objects;

public class BookHashset {


	private int id;
	private String title;
	private String author;
	private double price;
	private int numberOfCopies;
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BookHashset other = (BookHashset) obj;
		return id == other.id;
	}
	public BookHashset() {
		
	}
	@Override
	public String toString() {
		return "BookHashset [id=" + id + ", title=" + title + ", author=" + author + ", price=" + price
				+ ", numberOfCopies=" + numberOfCopies + "]";
	}
	public BookHashset(int id, String title, String author, double price, int numberOfCopies) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.price = price;
		this.numberOfCopies = numberOfCopies;
	}
}

