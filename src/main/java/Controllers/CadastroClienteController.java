package Controllers;

import Helpers.CadastroClienteHelper;
import Data.BDCliente;
import Views.CadastroCliente;
import Classes.Cliente;
import javax.swing.JOptionPane;

/*
 * Matheus de Mello Bueno RA:2070286 - POO Engenharia de Software
 */

public class CadastroClienteController
{
    
    private final CadastroCliente view;
    private final CadastroClienteHelper helper;
    
    public CadastroClienteController(CadastroCliente view)
    {
        this.view = view;
        this.helper = new CadastroClienteHelper(view);
    }
    
    public void cadastrarCliente() 
    {
        Cliente cliente = helper.obterModelo();
        
        if(cliente != null)
        {
            if(cliente.getNome().isEmpty())
            JOptionPane.showMessageDialog(view, "Preencha o nome.", "Erro", JOptionPane.ERROR_MESSAGE);
            else if(cliente.getCpf().trim().length() < 14)
                JOptionPane.showMessageDialog(view, "Preencha o CPF corretamente.", "Erro", JOptionPane.ERROR_MESSAGE);
            else if(cliente.getTelefone().trim().length() < 14)
                JOptionPane.showMessageDialog(view, "Preencha o telefone corretamente.", "Erro", JOptionPane.ERROR_MESSAGE);
            else if(cliente.getEndereco().isEmpty())
                JOptionPane.showMessageDialog(view, "Preencha o endereço.", "Erro", JOptionPane.ERROR_MESSAGE);
            else if(cliente.getCep().trim().length() < 10)
                JOptionPane.showMessageDialog(view, "Preencha o CEP.", "Erro", JOptionPane.ERROR_MESSAGE);

            else
            {
                if(cliente.getId() != 0)
                {
                    if(!helper.verificaCampos(cliente))
                    {
                        int resposta = JOptionPane.showConfirmDialog(view, "Deseja alterar este cadastro?", "Atenção", JOptionPane.YES_NO_OPTION);

                        if(resposta == JOptionPane.YES_OPTION)
                        {
                            new BDCliente().update(cliente);
                            JOptionPane.showMessageDialog(view, "Alterado com sucesso.", "Informação", JOptionPane.INFORMATION_MESSAGE);
                        }
                    }
                }
                else
                {
                    new BDCliente().insert(cliente);
                    JOptionPane.showMessageDialog(view, "Registrado com sucesso.", "Informação", JOptionPane.INFORMATION_MESSAGE);
                    helper.limparTela();
                }
            }
        }
    }
    
    public void cancelar() 
    {
        if(!view.getjNomeCliente().getText().equalsIgnoreCase(""))
        {
            int resposta = JOptionPane.showConfirmDialog(view, "Deseja cancelar a operação?", "Atenção", JOptionPane.YES_NO_OPTION);
            if(resposta == JOptionPane.YES_OPTION)
                helper.limparTela();
        }
        else 
            helper.limparTela();
    }

    public void consultar() {
        
        String[] opcoes = {"Nome","CPF","Cancelar"};
        
        int resposta = JOptionPane.showOptionDialog(null, "Selecione uma opção de consulta:",
                                                    "Consulta", JOptionPane.DEFAULT_OPTION,
                                                    JOptionPane.INFORMATION_MESSAGE, null, opcoes, null);
        
        if(resposta == 0)
        {
            String consultaNome = JOptionPane.showInputDialog(view, "Nome do Cliente");
            
            Cliente cliente = helper.obterClienteNome(consultaNome);
            
            if(cliente != null)
            {
                String txtID = String.valueOf(cliente.getId());
                view.getjIdCliente().setText(txtID);
                view.getjNomeCliente().setText(cliente.getNome());
                view.getjCPFCliente().setText(cliente.getCpf());
                view.getjTelefone().setText(cliente.getTelefone());
                view.getjTxtData().setText(cliente.getDataFormatada(cliente.getDataNascimento()));
                view.getjEmailCliente().setText(cliente.getEmail());
                view.getjEnderecoCliente().setText(cliente.getEndereco());
                view.getjCEP().setText(cliente.getCep());
            }
            else
                JOptionPane.showMessageDialog(view, "Registro não encontrado", "Atenção", JOptionPane.INFORMATION_MESSAGE);
        }
        else if(resposta == 1)
        {
            String consultaCPF = JOptionPane.showInputDialog(view, "CPF do Cliente (SEM PONTUAÇÂO)");
            
            Cliente cliente = helper.obterClienteCPF(consultaCPF);
            
            if(cliente != null)
            {
                String txtID = String.valueOf(cliente.getId());
                view.getjIdCliente().setText(txtID);
                view.getjNomeCliente().setText(cliente.getNome());
                view.getjCPFCliente().setText(cliente.getCpf());
                view.getjTelefone().setText(cliente.getTelefone());
                view.getjTxtData().setText(cliente.getDataFormatada(cliente.getDataNascimento()));
                view.getjEmailCliente().setText(cliente.getEmail());
                view.getjEnderecoCliente().setText(cliente.getEndereco());
                view.getjCEP().setText(cliente.getCep());
            }
            else
                JOptionPane.showMessageDialog(view, "Registro não encontrado", "Atenção", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public void excluir() 
    {
        Cliente cliente  = helper.obterModelo();

        if(cliente == null)
            JOptionPane.showMessageDialog(view, "Consulte um cliente registrado", "Erro", JOptionPane.ERROR);

        else
        {
            int resposta = JOptionPane.showConfirmDialog(view, "Deseja excluir o cliente?", "Atenção", JOptionPane.YES_NO_OPTION);
            if(resposta == JOptionPane.YES_OPTION)
            {
                new BDCliente().delete(cliente);
                JOptionPane.showMessageDialog(view, "Registro excluído!", "Atenção", JOptionPane.INFORMATION_MESSAGE);
                helper.limparTela();
            }
        }
        
    }
}
