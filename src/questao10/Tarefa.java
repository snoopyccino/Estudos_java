package questao10;

public class Tarefa {

    private String Descricao;
    private String Prioridade;
    private String Situacao;

    public void setDescricao(String descricao) {
        this.Descricao = descricao;
    }

    public void setPrioridade(String prioridade) {
        if (prioridade.equals("Baixa") || prioridade.equals("Média") || prioridade.equals("Alta")) {
            this.Prioridade = prioridade;
        }
    }

    public void setSituacao(String situacao) {
        this.Situacao = situacao;
    }

    public String getDescricao() {
        return this.Descricao;
    }

    public String getPrioridade() {
        return this.Prioridade;
    }

    public String getSituacao() {
        return this.Situacao;
    }
}
