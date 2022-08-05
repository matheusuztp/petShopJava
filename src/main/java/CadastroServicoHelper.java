import java.util.ArrayList;
import javax.swing.JOptionPane;

/*
 * Matheus de Mello Bueno RA:2070286 - POO Engenharia de Software
 */

public class CadastroServicoHelper implements InterfaceHelper{
    
    private final CadastroServico view;

    public CadastroServicoHelper(CadastroServico view) {
        this.view = view;
    }

    @Override
    public Servico obterModelo() 
    {
        String txtID = view.getjIDServico().getText();
        int id = Integer.parseInt(txtID);
        String descricao = view.getjDescricao().getText();
        String txtvalor = view.getjValorServico().getText();
        
        if(txtvalor.contains(","))
            txtvalor = txtvalor.replaceAll("\\,", "\\.");
        
        if(txtvalor.contains("R$"))
            txtvalor = txtvalor.substring(3);
        
        float valor = Float.parseFloat(txtvalor);
        
        Servico novoServico = new Servico(id, descricao, valor);
        
        return novoServico;
    }

    @Override
    public void limparTela() 
    {
        view.getjIDServico().setText("0");
        view.getjDescricao().setText("");
        view.getjValorServico().setText("");
    }

    public Servico obterServicoNome(String consultaDescricao) 
    {
        BDServico BDServico = new BDServico();
        ArrayList<Servico> servicos = BDServico.selectAll();
        
        for(Servico servico : servicos)
        {
            if(servico.getDescricao().equalsIgnoreCase(consultaDescricao))
                return servico;
        }
        return null;
    }

    public boolean verificaCampos(Servico servicoTela) 
    {
        BDServico BDServico = new BDServico();
        ArrayList<Servico> servicos = BDServico.selectAll();
        
        for(Servico servico : servicos)
        {
            if(servico.getId() == servicoTela.getId())
            {
                if(servico.getDescricao().equalsIgnoreCase(servicoTela.getDescricao())
                   && servico.getValor() == servicoTela.getValor())
                    return true;
            }
        }
        return false;
    }
    
}
