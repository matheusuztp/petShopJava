/*
 * Matheus de Mello Bueno RA:2070286 - POO ENGENHARIA DE SOFTWARE
 */

public class LoginHelper implements InterfaceHelper{
    
    private final Login view;

    public LoginHelper(Login view) {
        this.view = view;
    }
    
    public Usuario obterModelo(){
        String user = view.getTxtUsuario().getText();
        String password = view.getTxtSenha().getText();
        
        Usuario novo = new Usuario(1, user, password);
        return novo;
    }
    
    public void setaUsuario(Usuario novo){
        String user = novo.getNome();
        String senha = novo.getSenha();
        
        view.getTxtUsuario().setText(user);
        view.getTxtSenha().setText(senha);
   }
    
    public void limparTela(){
        view.getTxtUsuario().setText("");
        view.getTxtSenha().setText("");
    }
        
}
