package fiche2;

import lombok.Getter;

@Getter
public class Adresse {

    private String numero;
    private String rue;
    private String ville;
    private String codePostal;

    public Adresse(String rue, String numero, String ville, String  codePostal){
        this.rue = rue;
        this.numero = numero;
        this.ville = ville;
        this.codePostal = codePostal;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getRue() {
        return rue;
    }

    public void setRue(String rue) {
        this.rue = rue;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }
}
