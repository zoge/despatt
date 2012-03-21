package despatt.creational.builder;

class WorkShop {
	
    public void construct(HouseBuilder hb) {
        hb.buildFoundation();
        hb.buildFrame();
        hb.buildExterior();
        hb.buildInterior();
    }

}
