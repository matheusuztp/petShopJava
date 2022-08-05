package Helpers;

import Data.BDAgendamento;
import Classes.Agendamento;
import Views.Agenda;
import Classes.Animal;
import Classes.Cliente;
import Classes.Servico;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

/*
 * Matheus de Mello Bueno RA:2070286 - POO ENGENHARIA DE SOFTWARE
 */

public class AgendaHelper implements InterfaceHelper
{
    private final Agenda view;
    
    public AgendaHelper(Agenda view) 
    {
        this.view = view;
    }

    public void preencheTabela(ArrayList<Agendamento> agendamentos)
    {
        DefaultTableModel tabelaModelo =  (DefaultTableModel) view.getjTableAgendamento().getModel();
        tabelaModelo.setNumRows(0);
        
        for (Agendamento agendamento : agendamentos)
        {
            tabelaModelo.addRow(new Object[]{
                agendamento.getId(),
                agendamento.getCliente().getNome(),
                agendamento.getServico().getDescricao(),
                agendamento.getData(),
                (float) agendamento.getServico().getValor(),
                agendamento.getAnimal().getNome(),
                agendamento.getAnimal().getTipo(),
                agendamento.getObs()
            });
        }
    }
    
    public Servico obterServico()
    {
        return (Servico) view.getjComboServico().getSelectedItem();
    }
    
    public Cliente obterCliente()
    {
        return (Cliente) view.getjComboCliente().getSelectedItem();
    }
    
    public Animal obterAnimal()
    {
        return (Animal) view.getjComboAnimal().getSelectedItem();
    }

    public void preencheServico(ArrayList<Servico> servicos) 
    {
        DefaultComboBoxModel cbServico = (DefaultComboBoxModel) view.getjComboServico().getModel();
        for (Servico servico : servicos) 
            cbServico.addElement(servico);
    }

    public void preencheCliente(ArrayList<Cliente> clientes) 
    {
        DefaultComboBoxModel cbCliente = (DefaultComboBoxModel) view.getjComboCliente().getModel();
        for (Cliente cliente : clientes) 
            cbCliente.addElement(cliente);
    }

    public void preencheAnimal(ArrayList<Animal> animais) 
    {
        DefaultComboBoxModel cbAnimal = (DefaultComboBoxModel) view.getjComboAnimal().getModel();
        
        for(Animal animal: animais)
            cbAnimal.addElement(animal);
    }
    
    @Override
    public Agendamento obterModelo()
    {
        String txtID = view.getjTxtIdAgendamento().getText();
        int id = Integer.parseInt(txtID);
        Cliente cliente = obterCliente();
        Servico servico = obterServico();
        Animal animal = obterAnimal();
        String data = view.getjTxtData().getText();
        String hora = view.getjTxtHora().getText();
        String dataHora = data + " " + hora;
        String observacao = view.getjTxtObservacao().getText();
        
        Agendamento novoAgendamento = new Agendamento(id, cliente, servico, 
                                                        dataHora, observacao, animal);
        
        return novoAgendamento;
    }
    
    public Agendamento obterDaTabela(int linha)
    {
        int idAgendamento = (int) view.getjTableAgendamento().getValueAt(linha, 0);
        
        BDAgendamento BDAgendamento = new BDAgendamento();
        ArrayList<Agendamento> agendamentos = BDAgendamento.selectAll();
        
        
        for(Agendamento agendamento : agendamentos)
        {
            if(agendamento.getId() == idAgendamento)
                return agendamento;
        }
        
        return null;
    }
    
    @Override
    public void limparTela()
    {
        view.getjTxtIdAgendamento().setText("0");
        view.getjTxtData().setText("");
        view.getjTxtHora().setText("");
        view.getjTxtObservacao().setText("");
    }
    
}