package Classes;

/*
 * Matheus de Mello Bueno RA:2070286 - POO ENGENHARIA DE SOFTWARE
 */

import Classes.Animal;
import Classes.Cliente;
import Classes.Servico;
import static java.awt.image.ImageObserver.HEIGHT;
import javax.swing.JOptionPane;

public class Agendamento 
{
    private int id;
    private Cliente cliente;
    private Servico servico;
    private String data;
    private String obs;
    private Animal animal;
    
    public Agendamento(){ }

    public Agendamento(int id, Cliente cliente, Servico servico, String data, String obs, Animal animal) 
    {
        this.id = id;
        this.cliente = cliente;
        this.servico = servico;
        try
        {
            this.data = String.format(data, "dd/MM/aaaa HH:mm");
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, "Data Inválida: "+ex.getMessage(), "Atenção", HEIGHT);
        }
        this.obs = obs;
        this.animal = animal;
    }

    public Animal getAnimal()
    {
        return animal;
    }

    public void setAnimal(Animal animal)
    {
        this.animal = animal;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public Cliente getCliente()
    {
        return cliente;
    }

    public void setCliente(Cliente cliente)
    {
        this.cliente = cliente;
    }

    public Servico getServico() 
    {
        return servico;
    }

    public void setServico(Servico servico)
    {
        this.servico = servico;
    }

    public String getData()
    {
        return data;
    }

    public void setData(String data)
    {
        try 
        {
            this.data = String.format(data, "dd/MM/aaaa HH:mm");
        }
        catch (Exception ex) 
        {
            JOptionPane.showMessageDialog(null, "Data Inválida: "+ex.getMessage(), "Atenção", HEIGHT);
        }
    }

    public String getObs()
    {
        if(obs.isEmpty())
            return "Sem observação";
        else
            return obs;
    }

    public void setObs(String obs)
    {
        this.obs = obs;
    }
}
