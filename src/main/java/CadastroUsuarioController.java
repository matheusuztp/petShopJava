import javax.swing.JOptionPane;

/*
 * Matheus de Mello Bueno RA:2070286 - POO Engenharia de Software
 */

public class CadastroUsuarioController 
{
    
    private final CadastroUsuario view;
    private final CadastroUsuarioHelper helper;

    public CadastroUsuarioController(CadastroUsuario view) 
    {
        this.view = view;
        this.helper = new CadastroUsuarioHelper(view);
    }
    
    public void cadastrar() 
    {
        Usuario usuario = helper.obterModelo();
        
        if(usuario.getNome().isEmpty())
            JOptionPane.showMessageDialog(view, "Preencha o nome.", "Erro", JOptionPane.ERROR_MESSAGE);
        else if(usuario.getSenha().isEmpty())
            JOptionPane.showMessageDialog(view, "Preencha a senha.", "Erro", JOptionPane.ERROR_MESSAGE);
        
        else
        {
            if(usuario.getId() != 0)
            {
                if(!helper.verificaCampos(usuario))
                {
                    int resposta = JOptionPane.showConfirmDialog(view, "Deseja alterar este cadastro?", "Atenção", JOptionPane.YES_NO_OPTION);
            
                    if(resposta == JOptionPane.YES_OPTION)
                    {
                        new BDUsuario().update(usuario);
                        JOptionPane.showMessageDialog(view, "Alterado com sucesso.", "Informação", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
            }
            else
            {
                new BDUsuario().insert(usuario);
                JOptionPane.showMessageDialog(view, "Registrado com sucesso.", "Informação", JOptionPane.INFORMATION_MESSAGE);
                helper.limparTela();
            }
        }
    }

    public void cancelar()
    {
        if(!view.getjNome().getText().equalsIgnoreCase(""))
        {
            int resposta = JOptionPane.showConfirmDialog(view, "Deseja cancelar a operação?", "Atenção", JOptionPane.YES_NO_OPTION);
            if(resposta == JOptionPane.YES_OPTION)
                helper.limparTela();
        }
        else
            helper.limparTela();
    }

    public void consultar() 
    {
        String consultaNome = JOptionPane.showInputDialog(view, "Nome do usuário:");
        
        Usuario usuario = helper.obterUsuarioNome(consultaNome);
        
        if(usuario != null)
        {
            String txtID = String.valueOf(usuario.getId());
            view.getjIdUsuario().setText(txtID);
            view.getjNome().setText(usuario.getNome());
            view.getjSenha().setText(usuario.getSenha());
        }
        else
            JOptionPane.showMessageDialog(view, "Registro não encontrado", "Atenção", JOptionPane.INFORMATION_MESSAGE);
    }

    public void excluir() 
    {
        Usuario usuario = helper.obterModelo();
        
        if(usuario == null)
            JOptionPane.showMessageDialog(view, "Consulte um usuário registrado", "Erro", JOptionPane.ERROR);

        else
        {
            int resposta = JOptionPane.showConfirmDialog(view, "Deseja excluir o usuário?", "Atenção", JOptionPane.YES_NO_OPTION);
            if(resposta == JOptionPane.YES_OPTION)
            {
                new BDUsuario().delete(usuario);
                JOptionPane.showMessageDialog(view, "Registro excluído!", "Atenção", JOptionPane.INFORMATION_MESSAGE);
                helper.limparTela();
            }
        }
    }
}
