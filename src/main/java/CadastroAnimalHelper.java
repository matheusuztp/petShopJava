import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
/*
 * Matheus de Mello Bueno RA:2070286 - POO Engenharia de Software
 */

public class CadastroAnimalHelper implements InterfaceHelper
{
    
    private final CadastroAnimal view;

    public CadastroAnimalHelper(CadastroAnimal view)
    {
        this.view = view;
    }
    

    @Override
    public Animal obterModelo() 
    {
        String txtRegistro = view.getjRegistroAnimal().getText();
        int registro = Integer.parseInt(txtRegistro);
        String nome = view.getjNomeAnimal().getText();
        String raca = view.getjRacaAnimal().getText();
        String cor = view.getjCorAnimal().getText();
        int tipo = 0;
        if(view.getjComboTipoAnimal().getSelectedItem().toString().equalsIgnoreCase("Cachorro"))
            tipo = 1;
        else
            tipo = 2;
        Cliente cliente = obterCliente();
        
        Animal novoAnimal = new Animal(registro, nome, tipo, raca, cor, cliente);
        
        return novoAnimal;
    }

    @Override
    public void limparTela()
    {
        view.getjCorAnimal().setText("");
        view.getjNomeAnimal().setText("");
        view.getjRacaAnimal().setText("");
        view.getjRegistroAnimal().setText("0");
        view.getjComboTipoAnimal().setSelectedIndex(0);
    }

    public void preencheCliente(ArrayList<Cliente> clientes) 
    {
        DefaultComboBoxModel cbCliente = (DefaultComboBoxModel) view.getjComboClienteAnimal().getModel();
        for(Cliente cliente : clientes)
            cbCliente.addElement(cliente);
    }
    
    public Cliente obterCliente()
    {
        return (Cliente) view.getjComboClienteAnimal().getSelectedItem();
    }

    public Animal obterAnimalNome(String consultaNome) 
    {
        BDAnimal BDAnimal = new BDAnimal();
        ArrayList<Animal> animais = BDAnimal.selectAll();
        
        for(Animal animal : animais)
        {
            if(animal.getNome().equalsIgnoreCase(consultaNome))
                return animal;
        }
        return null;
    }

    public boolean verificaCampos(Animal animalTela) 
    {
        BDAnimal BDAnimal = new BDAnimal();
        ArrayList<Animal> animais = BDAnimal.selectAll();
        
        for(Animal animal : animais)
        {
            if(animal.getRegistro() == animalTela.getRegistro())
            {
                if(animal.getTipo().equalsIgnoreCase(animalTela.getTipo())
                   && animal.getNome().equalsIgnoreCase(animalTela.getNome())
                   && animal.getRaca().equalsIgnoreCase(animalTela.getRaca())
                   && animal.getCor().equalsIgnoreCase(animalTela.getCor())
                   && animal.getCliente().equals(animalTela.getCliente()))
                    return true;
            }
        }
        return false;
    }
}
