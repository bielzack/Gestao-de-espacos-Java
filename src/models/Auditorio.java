package models;

public class Auditorio extends Espaco{
    private boolean temPalco;

	public Auditorio(int id, String nome, String localizacao, int capacidade, boolean temPalco) {
        super(id, nome, localizacao, capacidade);
        this.temPalco = temPalco;
    }
    
    //COLOCAR O METODO VERIFICARDISPONIBILIDADE PARA SWING

    //ALTERAR PARA INTERFACE GRAFICA
    @Override
    public void exibirDetalhes() { 
        super.exibirDetalhes();
        System.out.println("Possui Palco? " + (isTemPalco() ? "Sim" : "Não"));
    }
    
    
    
    public boolean isTemPalco() {
		return this.temPalco;
	}

	public void setTemPalco(boolean temPalco) {
		this.temPalco = temPalco;
	}



}
