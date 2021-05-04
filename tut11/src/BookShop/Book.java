package BookShop;

public class Book {

	private String author;
	private String title;
	private double price;
	
	
	public Book(String author, String title, double price) {
		this.setAuthor(author);
		this.setTitle(title);
		this.setPrice(price);
		}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		if (title.length() < 3) {
			throw new IllegalArgumentException("Title not valid!");
			
			}
		this.title = title;
	}


	public String getAuthor() {
		return author;
	}


	private void setAuthor(String author) throws IllegalArgumentException {
        String[] authorName = author.split("\\ ", -1);
        if(authorName.length == 2){
            if(49 <= authorName[1].charAt(0) && authorName[1].charAt(0) <= 57){
                throw new IllegalArgumentException("Author not valid");
            }
        }
        this.author = author;
    }

	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		if (price < 1) {
			throw new IllegalArgumentException("Price not valid!");
			
			}
		this.price = price;
	}
	
	@Override
	public String toString() {
	final StringBuilder sb = new StringBuilder();
	sb.append("Type: ").append(this.getClass().getSimpleName())
	.append(System.lineSeparator())
	.append("Title: ").append(this.getTitle())
	.append(System.lineSeparator())
	.append("Author: ").append(this.getAuthor())
	.append(System.lineSeparator())
	.append("Price: ").append(this.getPrice())
	.append(System.lineSeparator());
	return sb.toString();
	}
}
	
	

