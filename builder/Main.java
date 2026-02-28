class Usuario {
    private String nome;
    private int idade;
    private String profissao;

    private Usuario(Builder builder) {
        this.nome = builder.nome;
        this.idade = builder.idade;
        this.profissao = builder.profissao;
    }

    public void exibir() {
        System.out.println(nome + " - " + idade + " anos - " + profissao);
    }

    // Classe Builder
    public static class Builder {
        private String nome;
        private int idade;
        private String profissao;

        public Builder setNome(String nome) {
            this.nome = nome;
            return this;
        }

        public Builder setIdade(int idade) {
            this.idade = idade;
            return this;
        }

        public Builder setProfissao(String profissao) {
            this.profissao = profissao;
            return this;
        }

        public Usuario build() {
            return new Usuario(this);
        }
    }
}

// Classe principal
public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario.Builder()
                .setNome("Janderson")
                .setIdade(22)
                .setProfissao("Desenvolvedor")
                .build();

        usuario.exibir();
    }
}