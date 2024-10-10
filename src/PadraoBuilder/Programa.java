package PadraoBuilder;

public class Programa {

	public static void main(String[] args) {
		
		Casa casa = new Casa.CasaBuilder()
                .setQuartos(3)              	// Define 3 quartos
                .setBanheiros(2)				// Define 2 banheiros
                .setTemGaragem(true)         // Define que tem garagem
                .setTemPiscina(true)     	// Define que tem piscina
                .build();                  // Constrói a casa

        // Exibe os detalhes da casa
        System.out.println(casa.getDetalhes());

		
		System.out.println("REFORMA CARREGANDO...");
		
		
		

	}

}
