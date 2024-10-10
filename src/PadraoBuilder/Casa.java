package PadraoBuilder;

public class Casa {
	private int quartos;
	private int banheiros;
	private boolean temGaragem;
	private boolean temPiscina;
	private boolean temJardim;
	
	//Precisa ter no Padrão Builder (Construtor privado que vai ser usado pelo Builder)
	
	private Casa(CasaBuilder builder) {
		this.quartos = builder.quartos;
		this.banheiros = builder.banheiros;
		this.temGaragem = builder.temGaragem;
		this.temPiscina = builder.temPiscina;
		this.temJardim = builder.temJardim;
	}



	public String getDetalhes() {
        return "Casa com " + quartos + " quarto(s), " + banheiros + " banheiro(s) ," +
                (temGaragem ? "com garagem" : "sem garagem") + ", " +
                (temPiscina ? "com piscina" : "sem piscina");
    }


	
	
	
	

	public static class CasaBuilder {
		private int quartos;
		private int banheiros;
		private boolean temGaragem;
		private boolean temPiscina;
		private boolean temJardim;
		
		// Método para definir o número de quartos
        public CasaBuilder setQuartos(int quartos) {
            this.quartos = quartos;
            return this; // Retorna o próprio builder para encadeamento
        }
        
        public CasaBuilder setBanheiros(int banheiros) {
        	this.banheiros = banheiros;
        	return this;
        }
		
        public CasaBuilder setTemGaragem(boolean temGaragem) {
        	this.temGaragem = temGaragem;
        	return this;
        }
        
        public CasaBuilder setTemPiscina(boolean temPiscina) {
        	this.temPiscina = temPiscina;
        	return this;
        }
        
        public CasaBuilder setTemJardim(boolean temJardim) {
        	this.temJardim = temJardim;
        	return this;
        	
        }
        
     // Método que constrói o objeto House
        public Casa build() {
        	return new Casa(this);
        }
		
	}
	
}
