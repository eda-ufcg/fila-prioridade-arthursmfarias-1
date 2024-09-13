import java.util.ArrayList;

public class InsereFinalFilaPrioridade implements FilaPrioridade {

	private ArrayList<Pair> fila;

	public InsereFinalFilaPrioridade(int capacidade) {
		this.fila = new ArrayList<Pair>(capacidade);
	}
	
	// criar um Pair e adicionar no fim da fila
	public void add(String elemento, int prioridade) {
		Pair p = new Pair(elemento, prioridade);
		this.fila.add(p);
	}


	// buscar pelo elemento de maior prioridade na fila.
	public String removeNext() {
		int prio = 0;
		String elem = "";
		int index = 0;
		for(int i = 0; i < this.fila.size() - 1; i++){
			if(this.fila.get(i).getPrioridade() > prio){
				prio = this.fila.get(i).getPrioridade();
				elem = this.fila.get(i).getElemento();
				index = i;
			}
		}
		this.fila.remove(index);
		return elem;
	}

}
