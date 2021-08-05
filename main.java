# pokemon.colecao
/*
Programadora: Julia Paes
Data: 05/08/2021
Classe Principal
Versão: 4.0

*/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    //Fazer as instanciações do main com dados lidos do usuário.
	    Scanner leitor = new Scanner(System.in);
	    
	    //Colecao c = new Colecao("Amanda", "05 Ago 2021");
	    System.out.println("Informe o(a) dono(a) da coleção: ");
	    String d = leitor.nextLine();
	    System.out.println("Informe a data de atualização: ");
	    String dt = leitor.nextLine();
	    Colecao c = new Colecao(d, dt);
	    
	    
	    //Carta p = new Carta("Pikachu", 6.0, 0.4);
	    //p.setPs(60);
	    System.out.println("Informe o nome da carta: ");
	    String n = leitor.nextLine();
	    
	    double peso, altura;
	    do{
	        System.out.println("Peso: ");
	        peso = leitor.nextDouble();
	    }while(peso<=0);
	    
	    do{
	        System.out.println("Altura: ");
	        altura = leitor.nextDouble();
	    }while(altura<=0);
	    
	    int ps;
	    do{
	        System.out.println("Pontos de Saúde (PS): ");
	        ps = leitor.nextInt();
	    }while(ps<=0);
	    Carta p = new Carta(n, peso, altura);
	    p.setPs(ps);
	    
	    c.setCarta(p); //associando a carta p à coleção c
	    p.setColecao(c); //associando a coleção c à carta p
	    
	    //Ataque a = new Ataque("Trovada de Choques", "Se cara, oponente é paralisado", 20);
	     leitor.nextLine();
	    System.out.println("Ataque: ");
	    String at = leitor.nextLine();
	    System.out.println("Informe o texto do ataque: ");
	    String txt = leitor.nextLine();
	    int dano;
	    do{
	        System.out.println("Dano: ");
	        dano = leitor.nextInt();
	    }while(dano<0);
	    Ataque a = new Ataque(at,txt,dano);
	    
	    
	    p.setAtaque(a); //associando ataque a à carta p
	    a.setCarta(p);  //associando a carta p à ataque a
	    
	    //p.exibeInfo();
	    //System.out.println("O ataque: " + a.getNome() + " pertence à carta: " + a.getCarta().getNome());
	    
	    c.exibeColecao();
	}
}
