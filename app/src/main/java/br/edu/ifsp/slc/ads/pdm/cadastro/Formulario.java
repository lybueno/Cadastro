package br.edu.ifsp.slc.ads.pdm.cadastro;

public class Formulario {

    private String nomeCompleto;
    private String telefone;
    private String email;
    private Boolean ingressarLista;
    private String sexo;
    private String cidade;
    private String uf;

    public Formulario() {

    }

    public Formulario(String nomeCompleto, String telefone, String email, Boolean ingressarLista,
                      String sexo, String cidade, String uf) {
        this.nomeCompleto = nomeCompleto;
        this.telefone = telefone;
        this.email = email;
        this.ingressarLista = ingressarLista;
        this.sexo = sexo;
        this.cidade = cidade;
        this.uf = uf;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getIngressarLista() {
        return ingressarLista;
    }

    public void setIngressarLista(Boolean ingressarLista) {
        this.ingressarLista = ingressarLista;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    @Override
    public String toString() {
        return "Nome Completo = " + nomeCompleto +
                "\nTelefone = " + telefone +
                "\nEmail = " + email +
                "\nIngressar na Lista = " + ingressarLista +
                "\nSexo = " + sexo +
                "\nCidade = " + cidade +
                "\nUF = " + uf;
    }
}
