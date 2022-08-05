package Data;

/*
 * Matheus de Mello Bueno RA:2070286
 */
import Classes.Banco;
import Classes.Cliente;
import java.util.ArrayList;

public class BDCliente 
{
    public void insert(Cliente cliente)
    {
        cliente.setId(proximoId());
        Banco.cliente.add(cliente);
    }

    public boolean update(Cliente cliente)
    {
        for (int i = 0; i < Banco.cliente.size(); i++) 
        {
            if(idSaoIguais(Banco.cliente.get(i),cliente))
            {
                Banco.cliente.set(i, cliente);
                return true;
            }
        }
        return false;      
    }
    
    public boolean delete(Cliente cliente)
    {
        for (Cliente clienteLista : Banco.cliente) 
        {
            if(idSaoIguais(clienteLista,cliente))
            {
                Banco.cliente.remove(clienteLista);
                return true;
            }
        }
        return false;
    }
    
    public ArrayList<Cliente> selectAll()
    {
        return Banco.cliente;
    }
    
    private boolean idSaoIguais(Cliente cliente, Cliente clienteAComparar) 
    {
        return cliente.getId() ==  clienteAComparar.getId();
    }
    
    private int proximoId()
    {
        int maiorId = 0;
        
        for (Cliente cliente : Banco.cliente) 
        {
           int id = cliente.getId();
            if(maiorId < id)
                maiorId = id;
        }
        return maiorId + 1;
    }
    
}
