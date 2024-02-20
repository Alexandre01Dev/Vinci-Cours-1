import java.util.LinkedList;
import java.util.NoSuchElementException;

public class DocumentsLRU {

	private final LinkedList<String> listeLRU;
	/**
	 * construit une liste de nombreDocuments documents : doc1 doc2 ...
	 * @param nombreDocuments
	 * @throws IllegalArgumentException il faut au moins 1 document
	 */
	public DocumentsLRU(int nombreDocuments){
		// TODO
		if(nombreDocuments < 1)
			throw new NoSuchElementException();
		listeLRU = new LinkedList<>();
		for (int i = 1; i <= nombreDocuments; i++) {
			listeLRU.add("doc"+i);
		}
	}
	

	/**
	 * place le document passe en parametre dans la liste selon le mecanisme LRU
	 * @param le document qui est ouvert
	 * @throws IllegalArgumentException si le document est null ou ""
	 */
	public void ouvrirDocument(String document){
		//TODO
		if(listeLRU.contains(document)){
			listeLRU.remove(document);
		}
		listeLRU.addFirst(document);

		if(listeLRU.size() > 5){
			listeLRU.removeLast();
		}
	}
	
	
	public String toString(){
		return listeLRU.toString();
	}
	
}
