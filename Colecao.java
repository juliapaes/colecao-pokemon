# pokemon.colecao
public class Colecao{
    private String dono;
    private String dataAtualizacao;
    private Carta carta;
    
    public Colecao(String dono, String dataAtualizacao){
        this.dono = dono;
        this.dataAtualizacao = dataAtualizacao;
    }
    
    public void setDono(String dono){
        this.dono = dono;
    }
    
    public String getDono(){
        return dono;
    }
    
    public void setDataAtualizacao(String dataAtualizacao){
        this.dataAtualizacao = dataAtualizacao;
    }
    
    public String getDataAtualizacao(){
        return dataAtualizacao;
    }
    
     public void setCarta(Carta carta){
        this.carta = carta;
    }
    
    public Carta getCarta(){
        return carta;
    }
    
    public void exibeColecao(){
        System.out.println(" * * * * Coleção Pokémon  * * * * ");
        System.out.println("Pertence a: " + dono);
        System.out.println("Carta: " + carta.getNome() + " PS: " + carta.getPs());
        System.out.println("Ataque: " + carta.getAtaque().getNome() + " Dano: " + carta.getAtaque().getDano());
        System.out.println("Coleção atualizada em: " + dataAtualizacao);
    }
}
