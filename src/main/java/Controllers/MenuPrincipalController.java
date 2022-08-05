package Controllers;


import Relatorios.RelatorioUsuarios;
import Relatorios.RelatorioServicos;
import Relatorios.RelatorioClientes;
import Relatorios.RelatorioAnimais;
import Views.MenuPrincipal;
import Views.CadastroUsuario;
import Views.CadastroServico;
import Views.CadastroCliente;
import Views.CadastroAnimal;
import Views.Agenda;

/*
 * Matheus de Mello Bueno Ra.:2070286 - POO Engenharia de Software
 */

public class MenuPrincipalController
{
    
    private final MenuPrincipal view;

    public MenuPrincipalController(MenuPrincipal view) {
        this.view = view;
    }
    
    public void abreAgendamento()
    {
        Agenda agenda = new Agenda();
        agenda.setVisible(true);
    }
    
    public void abreCadastroCliente()
    {
        CadastroCliente cadCliente = new CadastroCliente();
        cadCliente.setVisible(true);
    }
    
    public void abreCadastroServico()
    {
        CadastroServico cadServico = new CadastroServico();
        cadServico.setVisible(true);
    }
    
    public void abreCadastroAnimal()
    {
        CadastroAnimal cadAnimal = new CadastroAnimal();
        cadAnimal.setVisible(true);
    }
    
    public void abreCadastroUsuario()
    {
        CadastroUsuario cadUsuSimples = new CadastroUsuario();
        cadUsuSimples.setVisible(true);
    }
    
    public void abreRelatorioClientes()
    {
        RelatorioClientes relCli = new RelatorioClientes();
        relCli.setVisible(true);
    }

    public void abreRelatorioServicos() {
        RelatorioServicos relServ = new RelatorioServicos();
        relServ.setVisible(true);
    }

    public void abreRelatorioAnimais() {
        RelatorioAnimais relAni = new RelatorioAnimais();
        relAni.setVisible(true);
    }

    public void abreRelatorioUsuarios() {
        RelatorioUsuarios relUsu = new RelatorioUsuarios();
        relUsu.setVisible(true);
    }
    
}
