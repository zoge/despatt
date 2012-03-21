package despatt.creational.abstract_factory;

public class LocalMode implements Local {

	@Override
	public DataInfo[] loadDB(String filename) {
		
	    System.out.print("Load from a local database ");
	    return null;
	}

}
