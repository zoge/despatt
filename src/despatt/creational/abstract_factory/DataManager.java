package despatt.creational.abstract_factory;

public class DataManager implements ConnectionFactory {
	
	boolean local = false;
    DataInfo[] data;

	@Override
	public Local getLocalConnection() {
		return new LocalMode();
	}

	@Override
	public Remote getRemoteConnection() {
		return new RemoteMode();
	}
	
    public  void loadData() {
        if(local){
           Local conn = getLocalConnection();
           data = conn.loadDB("db.db");
        }else {
           Remote conn = getRemoteConnection();
           conn.connect2WWW("www.some.where.com");
           data = conn.loadDB("db.db");
        }
    }

	public void setLocal(boolean local) {
		this.local = local;
	}

	public void setConnection(boolean b) {
		// TODO Auto-generated method stub
		
	}
    
}
