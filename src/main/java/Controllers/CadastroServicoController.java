package Controllers;


import Helpers.CadastroServicoHelper;
import Data.BDServico;
import Views.CadastroServico;
import Classes.Servico;
import javax.swing.JOptionPane;

/*
 * Matheus de Mello Bueno RA:2070286 - POO Engenharia de Software
 */

public class CadastroServicoController
{
    
    private final CadastroServico view;
    private final CadastroServicoHelper helper;

    public CadastroServicoController(CadastroServico view)
    {
        this.view = view;
        this.helper = new CadastroServicoHelper(view);
    }
    
    public void cadastraServico() 
    {
        Servico servico = helper.obterModelo();
        
        if(servico.getDescricao().isEmpty())
            JOptionPane.showMessageDialog(view, "Preencha a descrição.", "Erro", JOptionPane.ERROR_MESSAGE);
        
        else if(servico.getValor() == 0)
            JOptionPane.showMessageDialog(view, "Preencha o valor.", "Erro", JOptionPane.ERROR_MESSAGE);
        
        else
        {
            if(servico.getId() != 0)
            {
                if(!helper.verificaCampos(servico))
                {
                    int resposta = JOptionPane.showConfirmDialog(view, "Deseja alterar este cadastro?", "Atenção", JOptionPane.YES_NO_OPTION);
            
                    if(resposta == JOptionPane.YES_OPTION)
                    {
                        new BDServico().update(servico);
                        JOptionPane.showMessageDialog(view, "Alterado com sucesso.", "Informação", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
            }
            else
            {
                new BDServico().insert(servico);
                JOptionPane.showMessageDialog(view, "Registrado com sucesso.", "Informação", JOptionPane.INFORMATION_MESSAGE);
                helper.limparTela();
            }
        }
    }

    public void cancelar() 
    {
        if(!view.getjDescricao().getText().equalsIgnoreCase(""))
        {
            int resposta = JOptionPane.showConfirmDialog(view, "Deseja cancelar a operação?", "Atenção", JOptionPane.YES_NO_OPTION);
            if(resposta == JOptionPane.YES_OPTION)
                helper.limparTela();
        }
        else
            helper.limparTela();
    }

    public void consultar() {
        
        String consultaDescricao = JOptionPane.showInputDialog(view, "Descrição do serviço:");
        
        Servico servico = helper.obterServicoNome(consultaDescricao);
        
        if(servico != null)
        {
            String txtID = String.valueOf(servico.getId());
            view.getjIDServico().setText(txtID);
            view.getjDescricao().setText(servico.getDescricao());
            view.getjValorServico().setText(String.format("R$ %.2f", servico.getValor()));
        }
        else
            JOptionPane.showMessageDialog(view, "Registro não encontrado", "Atenção", JOptionPane.INFORMATION_MESSAGE);
    }

    public void excluir() 
    {
        Servico servico = helper.obterModelo();
        
        if(servico == null)
            JOptionPane.showMessageDialog(view, "Consulte um serviço registrado", "Erro", JOptionPane.ERROR);

        else
        {
            int resposta = JOptionPane.showConfirmDialog(view, "Deseja ecluir o serviço?", "Atenção", JOptionPane.YES_NO_OPTION);
            if(resposta == JOptionPane.YES_OPTION)
            {
                new BDServico().delete(servico);
                JOptionPane.showMessageDialog(view, "Registro excluído!", "Atenção", JOptionPane.INFORMATION_MESSAGE);
                helper.limparTela();
            }
        }
        
    }
}
