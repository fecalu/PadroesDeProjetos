package PadraoSingleton;

class FabricaDeCarro {

	private static FabricaDeCarro instanciaUnica;

	private FabricaDeCarro() {

	}

	public static FabricaDeCarro getInstancia() {
		if (FabricaDeCarro.instanciaUnica == null) {
			FabricaDeCarro.instanciaUnica = new FabricaDeCarro();
		}
		return instanciaUnica;
	}

	public void fabricarCarro() {
		System.out.println("Carro fabricado!");
	}
}
