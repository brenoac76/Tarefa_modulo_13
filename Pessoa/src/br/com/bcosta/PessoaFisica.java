package br.com.bcosta;

class PessoaFisica extends Pessoa {
    private String cpf;
    private String rg;

    public PessoaFisica(String nome, String endereco, String cpf, String rg) {
        super(nome, endereco);
        this.cpf = cpf;
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public String getRg() {
        return rg;
    }

    @Override
    public void exibirDados() {
        System.out.println("Pessoa Física:");
        System.out.println("Nome: " + getNome());
        System.out.println("Endereço: " + getEndereco());
        System.out.println("CPF: " + getCpf());
        System.out.println("RG: " + getRg());
    }
}
