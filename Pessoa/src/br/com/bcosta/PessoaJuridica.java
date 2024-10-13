package br.com.bcosta;

class PessoaJuridica extends Pessoa {
    private String cnpj;
    private String razaoSocial;

    public PessoaJuridica(String nome, String endereco, String cnpj, String razaoSocial) {
        super(nome, endereco);
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    @Override
    public void exibirDados() {
        System.out.println("Pessoa Jurídica:");
        System.out.println("Nome: " + getNome());
        System.out.println("Endereço: " + getEndereco());
        System.out.println("CNPJ: " + getCnpj());
        System.out.println("Razão Social: " + getRazaoSocial());
    }
}

