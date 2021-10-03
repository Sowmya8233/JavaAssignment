abstract class Presistence{
	abstract void persist();
}

class FilePersistence extends Presistence{

	@Override
	void persist() {
		
		System.out.println("It is Presistance  File");
	}
	
}

class DatabasePersistence extends Presistence{

	@Override
	void persist() {
	System.out.println("It is Presistance  Database");
		
	}
	
}
public class presistance {

	public static void main(String[] args) {
		Presistence	objpresistance=new DatabasePersistence();
		objpresistance.persist();
		
		 objpresistance=new FilePersistence();
		objpresistance.persist();
		
	}

}
