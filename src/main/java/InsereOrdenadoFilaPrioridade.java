public class InsereOrdenadoFilaPrioridade implements FilaPrioridade {

	private Pair[] fila;
	private int head;
	private int last;

	public InsereOrdenadoFilaPrioridade(int capacidade) {
		this.fila = new Pair[capacidade];
		this.last = -1;
		this.head = -1;
	}
	
	// criar um Pair e inserir de forma ordenada decrescente no array.
	public void add(String elemento, int prioridade) {
		if(this.last >= this.fila.length -1)
			resize();
		int index = 0;
		for(int i = 1; i < this.fila.length - 1; i++){
			if(this.fila[0].getPrioridade() < prioridade)
				index = 0;
			if(this.fila[i].getPrioridade() < prioridade && this.fila[i - 1].getPrioridade() > prioridade){
				index = i;
			}
		}
		this.last += 1;
		Pair p = new Pair(elemento, prioridade);
		this.fila[this.last] = p;
		for(int i = this.last; i > index; i--){
			Pair aux = this.fila[i];
			this.fila[i] = this.fila[i - 1];
			this.fila[i - 1] = aux;
		}
	}
	private void resize(){
		Pair[] novaFila = new Pair[this.fila.length * 2];
		for (int i = 0; i <= last; i++)
			novaFila[i] = this.fila[i];

		this.fila = novaFila;
	}

	// remover e retornar o primeiro elemento do array, que é o de maior prioridade. lembrar manipular head e tail
	// para ser uma fila circular. assim a remoção fica O(1)
	public String removeNext() {

		return "";
	}

}
