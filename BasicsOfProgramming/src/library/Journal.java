package library;

public class Journal implements ThingInteface{
	
	private Integer pages;
	private String title;
	private String category;
	private String name;
	
	public Journal() {
	}
	
	public Journal(Integer pages, String title, String category) {
		this.pages = pages;
		this.title = title;
		this.category = category;
	}
	
	@Override
	public String toString() {
		return name + " [pages=" + pages + ", title=" + title + ", category=" + category + "]";
	}

	public Integer getPages() {
		return pages;
	}

	public void setPages(Integer pages) {
		this.pages = pages;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return null;
	}

}