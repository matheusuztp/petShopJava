package Controllers;

import Helpers.CadastroAnimalHelper;
import Data.BDCliente;
import Data.BDAnimal;
import Views.CadastroAnimal;
import Classes.Animal;
import Classes.Cliente;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/*
 * Matheus de Mello Bueno RA:2070286 - POO Engenharia de Software
 */

public class CadastroAnimalController
{
    
    private final CadastroAnimal view;
    private final CadastroAnimalHelper helper;

    public CadastroAnimalController(CadastroAnimal view)
    {
        this.view = view;
        this.helper = new CadastroAnimalHelper(view);
    }

    public void atualizaCliente() 
    {
        BDCliente BDCliente = new BDCliente();
        ArrayList<Cliente> clientes = BDCliente.selectAll();
        helper.preencheCliente(clientes);
    }

    public void cadastrarAnimal() {
        Animal animal = helper.obterModelo();
        
        if(animal.getNome().isEmpty())
            JOptionPane.showMessageDialog(view, "Preencha o nome.", "Erro", JOptionPane.ERROR_MESSAGE);
        
        else if(animal.getRegistro() != 0)
        {
            if(!helper.verificaCampos(animal))
            {
                int resposta = JOptionPane.showConfirmDialog(view, "Deseja alterar este cadastro?", "Atenção", JOptionPane.YES_NO_OPTION);

                if(resposta == JOptionPane.YES_OPTION)
                {                
                    new BDAnimal().update(animal);
                    JOptionPane.showMessageDialog(view, "Alterado com sucesso.", "Informação", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        }
        else
        {
            new BDAnimal().insert(animal);
            JOptionPane.showMessageDialog(view, "Registrado com sucesso.", "Informação", JOptionPane.INFORMATION_MESSAGE);
            helper.limparTela();
        }
    }

    public void consultarAnimal() {
        
        String consultaNome = JOptionPane.showInputDialog(view, "Nome do Animal");
        
        Animal animal = helper.obterAnimalNome(consultaNome);
        
        if(animal != null)
        {
            String txtRegistro = String.valueOf(animal.getRegistro());
            view.getjRegistroAnimal().setText(txtRegistro);
            view.getjNomeAnimal().setText(animal.getNome());
            view.getjRacaAnimal().setText(animal.getRaca());
            view.getjCorAnimal().setText(animal.getCor());
            view.getjComboTipoAnimal().setSelectedItem(animal.getCliente());
            view.getjComboTipoAnimal().setSelectedItem(animal.getTipo());
        }
        else
            JOptionPane.showMessageDialog(view, "Registro não encontrado", "Atenção", JOptionPane.INFORMATION_MESSAGE);
        
    }

    public void cancelarCadastro() 
    {
        if(!view.getjNomeAnimal().getText().equalsIgnoreCase(""))
        {    
            int resposta = JOptionPane.showConfirmDialog(view, "Deseja cancelar a operação?", "Atenção", JOptionPane.YES_NO_OPTION);
            if(resposta == JOptionPane.YES_OPTION)
                helper.limparTela();
        }
    }

    public void excluirAnimal() 
    {
        Animal animal = helper.obterModelo();
        
        if(animal == null)
            JOptionPane.showMessageDialog(view, "Consulte um animal registrado", "Erro", JOptionPane.ERROR);

        else
        {
            int resposta = JOptionPane.showConfirmDialog(view, "Deseja excluir o animal?", "Atenção", JOptionPane.YES_NO_OPTION);
            if(resposta == JOptionPane.YES_OPTION)
            {
                new BDAnimal().delete(animal);
                JOptionPane.showMessageDialog(view, "Registro excluído!", "Atenção", JOptionPane.INFORMATION_MESSAGE);
                helper.limparTela();
            }
        }
        
    }
}
