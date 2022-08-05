import java.util.ArrayList;
import javax.swing.JOptionPane;

/*
 * Matheus de Mello Bueno RA:2070286 - POO Engenharia de Software
 */

public class CadastroClienteHelper implements InterfaceHelper
{
    
    private final CadastroCliente view;

    public CadastroClienteHelper(CadastroCliente view) 
    {
        this.view = view;
    }
    
    @Override
    public void limparTela()
    {
        view.getjIdCliente().setText("0");
        view.getjNomeCliente().setText("");
        view.getjEmailCliente().setText("");
        view.getjEnderecoCliente().setText("");
        view.getjTelefone().setText("");
        view.getjTxtData().setText("");
        view.getjCEP().setText("");
        view.getjCPFCliente().setText("");
    }

    @Override
    public Cliente obterModelo()
    {
        String txtID = view.getjIdCliente().getText();
        int id = Integer.parseInt(txtID);
        String nome = view.getjNomeCliente().getText();
        String cpf = view.getjCPFCliente().getText();
        String telefone = view.getjTelefone().getText();
        String data = view.getjTxtData().getText();
        String email = view.getjEmailCliente().getText();
        String endereco = view.getjEnderecoCliente().getText();
        String cep = view.getjCEP().getText();

        String erro = validaData(data);
        
        Cliente novoCliente = null;
        if(erro.isEmpty())
            novoCliente = new Cliente(id, nome, cpf, data, telefone, email, endereco, cep);
        else
            JOptionPane.showMessageDialog(view, erro, "ERRO!", JOptionPane.ERROR_MESSAGE);
        
        return novoCliente;
    }

    public Cliente obterClienteNome(String consultaNome) 
    {
        BDCliente BDCliente = new BDCliente();
        ArrayList<Cliente> clientes = BDCliente.selectAll();
        
        for(Cliente cliente : clientes)
        {
            if(cliente.getNome().toLowerCase().contains(consultaNome.toLowerCase()))
                return cliente;
        }
        return null;
    }

    public Cliente obterClienteCPF(String consultaCPF) 
    {
        BDCliente BDCliente = new BDCliente();
        ArrayList<Cliente> clientes = BDCliente.selectAll();
        
        String novoCliente = "";
       
        for(Cliente cliente : clientes)
        {
            novoCliente = cliente.getCpf().replaceAll("\\.", "");
            novoCliente = novoCliente.replaceAll("-", "");
            
            if(novoCliente.equalsIgnoreCase(consultaCPF))
                return cliente;
        }
        return null;
    }
    
    public boolean verificaCampos(Cliente clienteTela) 
    {
        BDCliente BDCliente = new BDCliente();
        ArrayList<Cliente> clientes = BDCliente.selectAll();
        
        for(Cliente cliente : clientes)
        {
            if(cliente.getId()== clienteTela.getId())
            {
                if(cliente.getNome().equalsIgnoreCase(clienteTela.getNome())
                   && cliente.getCpf().equalsIgnoreCase(clienteTela.getCpf())
                   && cliente.getTelefone().equalsIgnoreCase(clienteTela.getTelefone())
                   && cliente.getDataNascimento().equals(clienteTela.getDataNascimento())
                   && cliente.getEmail().equalsIgnoreCase(clienteTela.getEmail())
                   && cliente.getEndereco().equalsIgnoreCase(clienteTela.getEndereco())
                   && cliente.getCep().equalsIgnoreCase(clienteTela.getCep()))
                    return true;
            }
        }
        return false;
    }
    
    public String validaData(String dateTime)
    {
        String erro = "";
        
        int dia = 0, mes = 0, ano = 0;
        
        try
        {
            mes = Integer.valueOf(dateTime.substring(3, 5));
            dia = Integer.valueOf(dateTime.substring(0, 2));
            ano = Integer.parseInt(dateTime.substring(6, 10));
        }
        catch(NumberFormatException ex)
        {
            return erro = "Preencha a data.";
        }
        
        if(dia == 0)
            return erro = "Dia inválido.";

        if(mes == 0)
            return erro = "Mês invalido.";
        else if(mes == 2)
        {
            if(dia > 28)
                return erro = "Dia inválido para mês de fevereiro.";
        }
        else if(mes < 8)
        {
            if(mes % 2 == 1)
            {
                if(dia > 31)
                    return erro = "Dia inválido (maior que 31).";
            }
            else
            {
                if(dia > 30)
                    return erro = "Dia inválido (maior que 30).";
            }
        }
        else if(mes > 7 && mes <= 12)
        {
            if(mes % 2 == 0)
            {
                if(dia > 31)
                    return erro = "Dia inválido (maior que 31).";
            }
            else
            {
                if(dia > 30)
                    return erro = "Dia inválido (maior que 30).";
            }
        }
        else
            return erro = "Mês inválido.";
        
        if(ano == 0)
            return erro = "Ano inválido.";
        else if(ano > 2012 && ano < 2022)
            return erro = "Por favor, chame seus pais para realizarem o seu cadastro.";
        else if(ano > 2022)
            return erro = "Ano inválido.";

        
        return erro;
    }
    
}
