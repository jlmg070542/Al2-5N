import java.io.*;

public class Conversor {

	private String expressao;
	private String saida="";

	public Conversor(String expressao) {
		this.expressao = expressao;
	}

	public void leitorConversor() {
		// ESTE MÉTODO LÊ CADA CARACTER DA STRING EXPRESSÃO.
		this.expressao.length();
		PilhaString PilhaString = new PilhaString(0);
		Object p;
		for (int i = 1; i <= this.expressao.length(); i++) {
			String aChar = this.expressao.substring(i - 1, i);
			switch (aChar) {
			
			case "(":
			case ")":
			case "+": 
			case "-":
			case "*":
			case "/":
				//EMPILHA				
				((Object) p).setaChar(aChar);
				((Object) p).push();
				break;
			default: //OPERANDOS
				this.saida=this.saida+" "+aChar;
				System.out.println(this.saida);
				break;
			}

		}
		
		for (int cont=0; cont<5; cont++) {
			this.saida=this.saida+" "+((PilhaString) p).pop();
		}
	}

}
