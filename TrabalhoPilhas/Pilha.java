
public class Pilha {

	private String[] operador;
	private String top;
	private String aChar = "";
	private int size=0;
	
	public String getaChar() {
		return aChar;
	}

	public void setaChar(String aChar) {
		this.aChar = aChar;
	}

//	public Pilha(String aChar) {
//		this.aChar = aChar;
//	}

	//VERIFICA SE ESTÁ VAZIA
	public boolean isEmpty(){
		
		if(this.size==0)
			return true;
		else
			return false;
	}
	
	//TOPO DA PILHA
	public void top() {
		this.top = this.aChar;
	}
	
	//EMPILHA
	public void push() {
		this.operador[this.size] = this.aChar;
		this.size++;
	}
	
	//DESEMPILHA
	public String pop() {
		if (isEmpty())
			System.out.println("Pilha vazia!");
		else
		this.size--;	
		return this.operador[this.size];
	}

}
