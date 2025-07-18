package models;

//SubClasse que representa os espaços das salas de aula do âmbito acadêmico do sistema de gestão.
public class SalaAula extends Espaco{
    private boolean possuiProjetor;

    public SalaAula(int id, String nome, String localizacao, int capacidade, boolean possuiProjetor) {
        super(id, nome, localizacao, capacidade);
        this.possuiProjetor = possuiProjetor;
    }

    

    //Getters e Setters importantes

    public boolean getPossuiprojetor() {
        return this.possuiProjetor;
    }

    public void setPossuiprojetor(boolean haProjetor) {
        this.possuiProjetor = haProjetor;
    }

}
