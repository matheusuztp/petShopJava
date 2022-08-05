package Controllers;


import Helpers.LoginHelper;
import Data.BDUsuario;
import Views.MenuPrincipal;
import Views.Login;
import Classes.Usuario;

/*
 * Matheus de Mello Bueno RA:2070286 - POO ENGENHARIA DE SOFTWARE
 */

public class LoginController {
    
    private final Login view;
    private LoginHelper ajudante;
    
    Usuario teste = new Usuario(99,"teste","123");
    
    public LoginController(Login view) {
        this.view = view;
        this.ajudante = new LoginHelper(view);
    }
    
    public void acessaSistema()
    {
        Usuario novo = ajudante.obterModelo();        
        BDUsuario BDUsuario = new BDUsuario();
        Usuario autenticacao = BDUsuario.selectPorNomeESenha(novo);
        
        if(autenticacao != null)
        {
            MenuPrincipal menu = new MenuPrincipal();
            menu.setVisible(true);
            this.view.dispose();
        }
        else
        {
            view.exibirMensagem("Usuario ou senha inválidos.");
            ajudante.limparTela();
        }
    }
}
