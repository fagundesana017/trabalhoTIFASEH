public class QuestaoNove {
    public static void main(String[] args){
        Usuario usuario = new Usuario();
        Solicitacao solicitacao = new Solicitacao();

        usuario.nome = "Ana Clara";
        usuario.cfp = "100.000.000-00";
        usuario.telefone = "3188000162";
        solicitacao.nomeSolicitante = "Maria Jose";
        solicitacao.cpfSolicitante = "000.001.000-80";
        solicitacao.problemaRelatado = "Falta de energia no bairro Celvia";
        solicitacao.solucaoProblema = "Enviar um tecnico na propriedade do usuario";

        usuario.cadastrarUsuario();
        usuario.fazerLogin();
        solicitacao.cadatrarSolitacao();
        solicitacao.alterarSolicitacao();
        solicitacao.buscarSolitacao();

    }

    public static class Solicitacao {

        private int idSolicitacao;
        String nomeSolicitante;
        String telefoneSolicitante;
        String cpfSolicitante;
        String problemaRelatado;
        String solucaoProblema;
        int idAtedente;
        int idAnalisaSolucionador;
        String statusSolicitacao;

        void cadatrarSolitacao(){

        }
        void buscarSolitacao(){

        }
        void alterarSolicitacao(){

        }

    }

    public static class Usuario {

        private int id;
        String nome;
        String cfp;
        String telefone;
        private String senha;

        void cadastrarUsuario() {
            System.out.println("Id: " + id);
            System.out.println("Nome do usuario: " + nome);
            System.out.println("CPF: " + cfp);
            System.out.println("Telefone: " + telefone);
        }
        void fazerLogin(){

        }
    }
}
