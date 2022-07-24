
public class Cliente {
    
	private String cpf;
	private String nome;
    private String sobrenome;

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getCpf(){
        return cpf;
    }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    public String getSobrenome() {
        return sobrenome;
    }
	
}
