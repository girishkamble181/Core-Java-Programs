//wap for book details using OOP

class Book
{
	int id;
	String name;

	void setData(int id, String name)
	{
		this.id= id;
		this.name= name;
	}
	void showData()
	{
		System.out.println("id = "+id);
		System.out.println("name = "+name);
	}	
}

class oop_book
{
	public static void main(String args[])
	{
		Book b= new Book();	
		b.setData(10, "ML and AI By GK");
		b.showData();
	}
}