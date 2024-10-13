package br.com.bcosta;

public class Main {
    public static void main(String[] args) {
        PessoaFisica pf = new PessoaFisica("João da Silva", "Rua A, 123", "123.456.789-00", "MG-12.345.678");
        PessoaJuridica pj = new PessoaJuridica("Empresa XYZ", "Av. B, 456", "12.345.678/0001-90", "XYZ Ltda");

        pf.exibirDados();
        System.out.println();
        pj.exibirDados();
    }
}
