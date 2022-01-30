package start;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     LL list=new LL();
     list.insertFirst(5);
     list.insertFirst(4);
     list.insertFirst(8);
     list.insertFirst(2);
     list.insertFirst(1);
     list.insertLast(6);
     list.insert(2, 3);
     list.display();
     list.delete(3);
     list.display();
     list.deleteLast();
     list.display();

	}

}
