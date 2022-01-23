
public class Main {

	public static void main(String[] args) {
		
		//Calculadora
		System.out.println("Calculadora de valores");
		OperacoesBasicas.soma(2, 7);
		OperacoesBasicas.subtracao(4, 4);
		OperacoesBasicas.multipicacao(5, 5);
		OperacoesBasicas.divisao(25, 5);
		
		//Mensagem
		
		System.out.println("Mensagens: ");
		Mensagem.obterMensagem( 17);
		Mensagem.obterMensagem(7);
		Mensagem.obterMensagem(4);
		Mensagem.obterMensagem(22);
		
		//Emprestimo
		
		System.out.println("Emprestimo: ");
		Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5);
        
     // Retornos
        System.out.println("Exercício retornos");

        double areaQuadrado = Return.area(3);
        System.out.println("Área do quadrado:" + areaQuadrado);

        double areaRetangulo = Return.area(5,5);
        System.out.println("Área do retângulo:" + areaRetangulo);

        double areaTrapezio = Return.area(7,8,9);
        System.out.println("Área do trapézio:" + areaTrapezio);

    }

}


