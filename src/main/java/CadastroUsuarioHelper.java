import java.util.ArrayList;

/*
 * Matheus de Mello Bueno RA:2070286 - POO Engenharia de Software
 */

public class CadastroUsuarioHelper implements InterfaceHelper
{
    
    private final CadastroUsuario view;

    public CadastroUsuarioHelper(CadastroUsuario view) {
        this.view = view;
    }
    
    //gerencia a view
    @Override
    public Usuario obterModelo()
    {
        String txtID = view.getjIdUsuario().getText();
        int id = Integer.parseInt(txtID);
        String nome = view.getjNome().getText();
        String senha = view.getjSenha().getText();
        
        Usuario novoUsuario = new Usuario(id, nome, senha);
        
        return novoUsuario;
    }

    @Override
    public void limparTela() 
    {
        view.getjIdUsuario().setText("0");
        view.getjNome().setText("");
        view.getjSenha().setText("");
    }

    public Usuario obterUsuarioNome(String consultaNome) 
    {
        BDUsuario BDUsuario = new BDUsuario();
        ArrayList<Usuario> usuarios = BDUsuario.selectAll();
        
        for(Usuario usuario : usuarios)
        {
            if(usuario.getNome().equalsIgnoreCase(consultaNome))
                return usuario;
        }
        return null;
    }    

    public boolean verificaCampos(Usuario usuarioTela) 
    {
        BDUsuario BDUsuario = new BDUsuario();
        ArrayList<Usuario> usuarios = BDUsuario.selectAll();
        
        for(Usuario usuario : usuarios)
        {
            if(usuario.getId() == usuarioTela.getId())
            {
                if(usuario.getNome().equalsIgnoreCase(usuarioTela.getNome())
                   && usuario.getSenha().equalsIgnoreCase(usuarioTela.getSenha()))
                    return true;
            }
        }
        return false;
    }
}
