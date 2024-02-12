import java.util.Arrays;

// implementation de l'interface File via une table circulaire

/**
 * @author 
 *
 */

public class FileImplViaTable<E> implements File<E>{

	private Object[] table;  // ne modifiez pas cet identifiant, la classe test l'utilise
	private int indiceTete;  // ne modifiez pas cet identifiant, la classe test l'utilise			
	private int taille;		// ne modifiez pas cet identifiant, la classe test l'utilise	
	// N'ajoutez pas d'autres attributs, la classe test risquerait de ne pas fonctionner

	public static void main(String[] args) {

	}
	public FileImplViaTable(){
		table = new Object[4];

		taille = 0;
		indiceTete = 0;
	}
	

	public boolean estVide(){
		return taille == 0;
	}


	public int taille(){
		return taille;
	}

	public E premier()throws FileVideException{
		if(estVide()){
			throw new FileVideException();
		}
		return (E) table[indiceTete];
		//TODO
		
	}


	public E defile() throws FileVideException{
		if(estVide()){
			throw new FileVideException();
		}
		E elt = (E) table[indiceTete];
		indiceTete = (indiceTete + 1) % table.length;
		taille--;
		return elt;
		//TODO
	}

	public void enfile(E element){
		//TODO
		if(table.length == taille){
			agrandirTable();
		}

		System.out.println("Indice = "+indiceTete);
		System.out.println("Taille = "+taille);
		System.out.println("Table size = "+ table.length);
		System.out.println((indiceTete +taille) % table.length);
		int i = (indiceTete +taille) % table.length;
		table[i] = element;
		taille++;
	}

	private void agrandirTable(){
		Object[] objects = new Object[table.length*2];
		for (int i = 0; i < taille; i++) {
			objects[i] = table[(indiceTete+i) % table.length];
		}
		table = objects;
		indiceTete = 0;
	}

} 
