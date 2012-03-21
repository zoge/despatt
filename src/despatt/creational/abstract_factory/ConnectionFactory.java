package despatt.creational.abstract_factory;

interface ConnectionFactory {
	  Local getLocalConnection();
	  Remote getRemoteConnection();
}
