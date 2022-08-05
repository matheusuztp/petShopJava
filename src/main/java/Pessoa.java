/*
 * Matheus de Mello Bueno RA: 2070286 - POO Engenharia de Software
 */
import static java.awt.image.ImageObserver.HEIGHT;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

abstract public class Pessoa
{
    protected int id;
    protected String nome;
    protected Date dataNascimento;
    protected String telefone;
    protected String email;
    protected String cpf;
    
    public Pessoa()
    {
        
    }    
    
    //sobrecarga
    public Pessoa(int id, String nome) 
    {
        this.id = id;
        this.nome = nome;
    }

    public Pessoa(int id, String nome, String dataNascimento, String telefone, String email, String cpf) 
    {
        this.id = id;
        this.nome = nome;
        try 
        {
            this.dataNascimento = new SimpleDateFormat("dd/MM/yyyy").parse(dataNascimento);
        }
        catch (ParseException ex) 
        {
            JOptionPane.showMessageDialog(null, "Data Inválida.", "Atenção", HEIGHT);
        }
        this.telefone = telefone;
        this.email = email;
        this.cpf = cpf;
    }

    public int getId() 
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public Date getDataNascimento()
    {
            return dataNascimento;
    }
    
    public void setDataNascimento(String dataNascimento)
    {
        
        try 
        {
            this.dataNascimento = new SimpleDateFormat("dd/MM/yyyy").parse(dataNascimento);
        }
        catch (ParseException ex) 
        {
            JOptionPane.showMessageDialog(null, "Data Inválida.", "Atenção", HEIGHT);
        }
    }

    public String getTelefone() 
    {
        return telefone;
    }

    public void setTelefone(String telefone)
    {
        this.telefone = telefone;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email) 
    {
        this.email = email;
    }

    public String getCpf()
    {
        return cpf;
    }

    public void setCpf(String cpf) 
    {
        this.cpf = cpf;
    }
    
    public String getDataFormatada(Date data)
    {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String dataFormatada = dateFormat.format(data);
        return dataFormatada;
    }
}
