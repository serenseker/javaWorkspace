package projectNaya;

public class GsonFactory {
	
	public static Gson createRiskDeclarationGson() {
		return new GsonBuilder()
				.registerTypeAdapter(Double.class,new DoubleJsonAdapter())
				.setPrettyPrinting()
				.create();
				
	}
	
}
