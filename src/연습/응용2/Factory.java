package 연습.응용2;

class Factory {
	private String factoryName;
	private static Factory instance = null;
	private Factory() {
	}
	
	public static Factory getInstance() {
		if (instance == null) {
			instance = new Factory();
		}
		return instance;
	}
	
}
