/*
 * Matheus de Mello Bueno RA:2070286 - POO ENGENHARIA DE SOFTWARE
 */

public class Cliente extends Pessoa
{
    private String endereco;
    private String cep; 
    
    public Cliente(int id, String nome, String cpf, String dataNascimento, String telefone, String email, String endereco, String cep) 
    {
        super(id, nome, dataNascimento, telefone, email, cpf);
        this.endereco = endereco;
        this.cep = cep;
    }
    
    public Cliente()
    {
        
    }
    
    public String getEndereco() 
    {
        return endereco;
    }

    public void setEndereco(String endereco) 
    {
        this.endereco = endereco;
    }

    public String getCep() 
    {
        return cep;
    }

    public void setCep(String cep) 
    {
        this.cep = cep;
    }

    @Override
    public String toString()
    {
        return getNome();    
    }
 
}
