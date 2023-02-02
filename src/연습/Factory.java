package 연습;


class Factory {
	private String FactoryName;
	
	private static Factory instance = null;


	private Factory() {
		FactoryName = new String();
	}

	public static Factory getInstance() {
		if (instance == null) {
			instance = new Factory();
		}
		
		return instance;

	}
}
