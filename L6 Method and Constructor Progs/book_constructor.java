//wap for book details by using constructor

class Book
{
	int id;
	String name;

	Book(int id, String name)	//constructor
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

class book_constructor
{
	public static void main(String args[])
	{
		Book b = new Book(10,"ML and Flas by GK");  //initialization (implicit calling)
		b.showData();
	}
}


//special method
// 1) constructor have same name as class name
// 2) does not have any return type
// 3) it cannot be called explicitly