# pokemon.colecao
public class Carta{
    //atributos
    private String nome;
    private double peso; //em kg
    private double altura; //em m
    private int ps; //pontos de saúde
    private Ataque ataque;
    private Colecao colecao;
    
    //método construtor default
    public Carta(){
        
    }
    
    public Carta(String nome, double peso, double altura){
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
    }
    
    //métodos de acesso
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public double getPeso(){
        return peso;
    }
    
    public void setPeso(double peso){
        this.peso = peso;
    }
    
    public double getAltura(){
        return altura;
    }
    
    public void setAltura(double altura){
        this.altura = altura;
    }
    
    //métodos de acesso para ps
    public void setPs(int ps){
        this.ps = ps;    //atributo ps recebendo parâmetro ps    
    }
    
    public int getPs(){
        return ps;
    }
    
    //métodos de acesso para o atributo ataque -> associação
    public void setAtaque(Ataque ataque){
        this.ataque = ataque;   
    }
    
    public Ataque getAtaque(){
        return ataque;
    }
    
    //métodos de acesso para o atributo colecao -> associação
    public void setColecao(Colecao colecao){
        this.colecao = colecao;   
    }
    
    public Colecao getColecao(){
        return colecao;
    }
    
    //métodos
    public void exibeInfo(){
        System.out.println("Nome: " + nome);
        System.out.printf("Peso: %.1f kg\n", peso);
        System.out.printf("Altura: %.1f m\n", altura);
        System.out.println("PS: " + ps);
        System.out.println("Nome do ataque: " + ataque.getNome());
        System.out.println("Texto do ataque: " + ataque.getTexto());
        System.out.println("Dano: " + ataque.getDano());
    }
}
