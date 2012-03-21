package despatt.creational.abstract_factory;

public class RemoteMode implements Remote {

	@Override
	public DataInfo[] loadDB(String filename) {
		System.out.println("Load from a remote database ");
		return null;
	}

	@Override
	public void connect2WWW(String url) {
		System.out.println("Connect to a remote site ");
	}

}
