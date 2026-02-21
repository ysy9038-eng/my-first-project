package vo;

public class NewsVo {

	String title;
	String link;
	String image;
	String author;
	int discount;
	String publisher;
	String pubdate;
	String isbn;
	String description;
	

	
	// getter / setter
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getPubdate() {
		return pubdate;
	}
	public void setPubdate(String pubdate) {
		this.pubdate = pubdate;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	// 생성자
	
	public NewsVo() {
		super();
	}
	
	public NewsVo(String title, String link, String image, String author, int discount, String publisher,
			String pubdate, String isbn, String description) {
		super();
		this.title = title;
		this.link = link;
		this.image = image;
		this.author = author;
		this.discount = discount;
		this.publisher = publisher;
		this.pubdate = pubdate;
		this.isbn = isbn;
		this.description = description;
	}
	
	
	
}
