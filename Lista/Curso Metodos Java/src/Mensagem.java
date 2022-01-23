
public class Mensagem {

	

	public static void obterMensagem(int hora) {

		if (hora >= 5 && hora < 12) {
			mensagemBomDia();
		}

		else if (hora >= 12 && hora < 18) {
			mensagemBoaTarde();
		}

		else if (hora >= 18 && hora < 24) {
			mensagemBoaNoite();

		}
		else if (hora >= 0 && hora < 5) {
			mensagemBoaMadrugada();
		}else 
			System.out.println("hora Inválida ");
	}

	public static void mensagemBomDia() {
		System.out.println("Bom Dia! ");
	}

	public static void mensagemBoaTarde() {
		System.out.println("Bom tarde! ");
	}

	public static void mensagemBoaNoite() {
		System.out.println("Boa noite! ");
	}

	public static void mensagemBoaMadrugada() {
		System.out.println("Boa madrugada! ");
	}
}
