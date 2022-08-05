/*
 * Matheus de Mello Bueno RA:2070286
 */

import java.util.ArrayList;

public class BDUsuario {
    
    public void insert(Usuario usuario)
    {
        usuario.setId(proximoId());
        Banco.usuario.add(usuario);
    }
    
    public boolean update(Usuario usuario)
    {
        for (int i = 0; i < Banco.usuario.size(); i++) 
        {
            if(idSaoIguais(Banco.usuario.get(i),usuario))
            {
                Banco.usuario.set(i, usuario);
                return true;
            }
        }
        return false;      
    }
    
    public boolean delete(Usuario usuario)
    {
        for (Usuario usuarioLista : Banco.usuario) {
            if(idSaoIguais(usuarioLista,usuario))
            {
                Banco.usuario.remove(usuarioLista);
                return true;
            }
        }
        return false;
    }
    
    public ArrayList<Usuario> selectAll()
    {
        return Banco.usuario;
    }
    
    public Usuario selectPorNomeESenha(Usuario usuario)
    {
        for (Usuario usuarioLista : Banco.usuario) 
        {
            if(nomeESenhaSaoIguais(usuarioLista,usuario)){
                return usuarioLista;
            }
        }
        return null;
    }

    private boolean nomeESenhaSaoIguais(Usuario usuario, Usuario usuarioAPesquisar) 
    {
        return usuario.getNome().equals(usuarioAPesquisar.getNome()) && usuario.getSenha().equals(usuarioAPesquisar.getSenha());
    }

    private boolean idSaoIguais(Usuario usuario, Usuario usuarioAComparar) 
    {
        return usuario.getId() ==  usuarioAComparar.getId();
    }
    
    private int proximoId()
    {
        int maiorId = 0;
        
        for (Usuario usuario : Banco.usuario) 
        {
           int id = usuario.getId();
            if(maiorId < id)
                maiorId = id;
        }
        return maiorId + 1;
    }
    
}
