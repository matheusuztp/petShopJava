/*
 * Matheus de Mello Bueno RA:2070286
 */
import java.util.ArrayList;

public class BDServico 
{
    public void insert(Servico servico)
    {
        servico.setId(proximoId());
        Banco.servico.add(servico);
    }
    
    public boolean update(Servico servico)
    {
        for (int i = 0; i < Banco.servico.size(); i++) 
        {
            if(idSaoIguais(Banco.servico.get(i),servico))
            {
                Banco.servico.set(i, servico);
                return true;
            }
        }
        return false;      
    }
    
    public boolean delete(Servico servico)
    {
        for (Servico servicoLista : Banco.servico) 
        {
            if(idSaoIguais(servicoLista,servico))
            {
                Banco.servico.remove(servicoLista);
                return true;
            }
        }
        return false;
    }
    
    public ArrayList<Servico> selectAll()
    {
        return Banco.servico;
    }
    
    private boolean idSaoIguais(Servico servico, Servico servicoAComparar) 
    {
        return servico.getId()==  servicoAComparar.getId();
    }
    
    private int proximoId()
    {
        int maiorId = 0;
        
        for (Servico servico : Banco.servico) 
        {
           int id = servico.getId();
            if(maiorId < id)
                maiorId = id;
        }
        return maiorId + 1;
    }
    
}
