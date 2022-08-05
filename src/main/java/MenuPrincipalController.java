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

    void abreRelatorioAnimais() {
        RelatorioAnimais relAni = new RelatorioAnimais();
        relAni.setVisible(true);
    }

    void abreRelatorioUsuarios() {
        RelatorioUsuarios relUsu = new RelatorioUsuarios();
        relUsu.setVisible(true);
    }
    
}
