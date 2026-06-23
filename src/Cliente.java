public class Cliente {

	private static int ultimoID = 10_000;

    private String nome;
    private int documento;

    /**
     * Construtor do cliente. Cria um novo cliente a partir do nome informado.
     * utilize obrigatoriamente o método setNome para atribuir o nome ao cliente.
     * atribua ao cliente um número de documento gerado sequencialmente a partir
     * do contador estático ultimoID (e incremente o contador).
     */
    public Cliente (String nome) {
    	setNome(nome);
        documento = ultimoID;
        ultimoID++;
    }

    /**
     * retorne o nome do cliente.
     */
    public String getNome() {
    	return nome;
    }

    /**
     * Atribui ao cliente o nome informado como parâmetro.
     * esse nome deve conter, pelo menos, duas palavras; caso contrário,
     * lance a exceção adequada (IllegalArgumentException).
     */
    public void setNome(String nome) {
        if (nome.contains(" ")) {
            this.nome = nome;
        }else{
            throw new IllegalArgumentException("Todo nome deve conter pelo menos duas palavras!");
        }
        
    }

    /**
     * retorne uma representação textual do cliente, incluindo seu nome e documento.
     */
    @Override
    public String toString() {
        return String.format("%s%nDocumento: %d%n", nome, documento);
    }

    /**
     * retorne um código hash para o cliente, que corresponde a seu documento.
     */
    @Override
    public int hashCode(){
        return documento;
    }
}