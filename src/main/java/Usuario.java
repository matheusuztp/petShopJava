/*
 * Matheus de Mello Bueno RA: 2070286 - POO Engenharia de Software
 */
public class Usuario extends Pessoa
{
    private String senha;

    //sobrecarga
    public Usuario(int id, String nome, String senha) 
    {
        super(id, nome);
        this.senha = senha;
    }

    public String getSenha() 
    {
        return senha;
    }

    public void setSenha(String senha) 
    {
        this.senha = senha;
    }
}
