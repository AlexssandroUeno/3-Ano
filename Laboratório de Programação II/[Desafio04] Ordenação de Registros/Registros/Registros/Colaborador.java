import java.text.NumberFormat;
import java.text.DecimalFormat;
import java.util.Optional;

/**
 * Classe que registra os dados individuais de colaboradores. O salário é um dado
 * opcional, portanto deve-se tomar as devidas precauções.
 * 
 * ATENÇÃO! Essa classe não deve ser modificada pelos alunos!
 *
 * @author Ricardo I. A. e Silva ricardo.silva@unifil.br
 * @version 201706061717
 */
public class Colaborador {
    
    /**
     * Construtor completo da classe.
     * 
     * @param nome nome completo do colaborador cadastrado.
     * @param anosServico o tempo de serviço que o colaborador tem na empresa,
     *                    em quantidade de anos.
     * @param salario salario do funcionário em questão.
     */
    public Colaborador(String nome, int anosServico, double salario) {
        assert nome != null : "Parâmetro nome não pode ser nulo.";
        
        this.nome = nome;
        this.anosServico = anosServico;
        this.salario = Optional.of(salario);
    }
    
    /**
     * Construtor para colaboradores cujo salario deve ser escondido, ou para 
     * voluntários.
     * 
     * @param nome nome completo do colaborador cadastrado.
     * @param anosServico o tempo de serviço que o colaborador tem na empresa,
     *                    em quantidade de anos.
     * @param salario salario do funcionário em questão.
     */
    public Colaborador(String nome, int anosServico) {
        this.nome = nome;
        this.anosServico = anosServico;
        this.salario = Optional.empty();
    }
    
    private static final NumberFormat dinheiro = new DecimalFormat("#0.00"); 
    @Override
    public String toString() {
        return nome + ", " + anosServico + (salario.isPresent() ?
            ", $" + dinheiro.format(salario.get()) : "");
    }
    
    @Override
    public boolean equals(Object other) {
        if (other instanceof Colaborador) {
            Colaborador otherColaborador = (Colaborador) other;
            return  this.nome.equals(otherColaborador.nome) &&
                    this.anosServico == otherColaborador.anosServico &&
                    this.salario.equals(otherColaborador.salario);
        }
        return false;
    }
    
    public String getNome() { return nome; }
    public int getAnosServico() { return anosServico; }
    public Optional<Double> getSalario() { return salario; }
    
    private String nome;
    private int anosServico;
    private Optional<Double> salario;
}
