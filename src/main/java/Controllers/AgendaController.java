package Controllers;

import Helpers.AgendaHelper;
import Data.BDServico;
import Data.BDCliente;
import Data.BDAnimal;
import Data.BDAgendamento;
import Classes.Agendamento;
import Views.Agenda;
import Classes.Animal;
import Classes.Cliente;
import Classes.Servico;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/*
* Matheus de Mello Bueno RA:2070286 - POO ENGENHARIA DE SOFTWARE
 */

public class AgendaController 
{
    private final Agenda view; 
    private final AgendaHelper helper;
    BDAgendamento BDAgenda = new BDAgendamento();
    BDCliente BDCliente = new BDCliente();
    BDServico BDServico = new BDServico();
    BDAnimal BDAnimal = new BDAnimal();
    
    public AgendaController(Agenda view) 
    {
        this.view = view;
        this.helper = new AgendaHelper(view);
    }
    
    public void atualizaTabela()
    {
        ArrayList<Agendamento> agendamentos = BDAgenda.selectAll();
        helper.preencheTabela(agendamentos);
    }
    
    public void atualizaServido()
    {
        ArrayList<Servico> servicos = BDServico.selectAll();
        helper.preencheServico(servicos);
    }
    
    public void atualizaCliente()
    {
        ArrayList<Cliente> clientes = BDCliente.selectAll();
        helper.preencheCliente(clientes);
    }
    
    public void atualizaAnimal() 
    {
        ArrayList<Animal> animais = BDAnimal.selectAll();
        helper.preencheAnimal(animais);
    }
    
    public String validaDataHora(String dateTime)
    {
        String erro = "";
        String data = dateTime.substring(0, 11);
        
        int dia = 0, mes = 0, ano = 0;
        
        try
        {
            mes = Integer.parseInt(data.substring(3, 5));
            dia = Integer.parseInt(data.substring(0, 2));
            ano = Integer.parseInt(data.substring(6, 10));
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
        else if(ano < 2000)
            return erro = "Ano inválido.";
        else if(ano > 2030)
            return erro = "Ano fora do limite.";
        
        
        String dataHora = dateTime.substring(11);
        
        int hora = Integer.parseInt(dataHora.substring(0, 2));
        int minuto = Integer.parseInt(dataHora.substring(3, 5));
        
        if(hora == 0)
            return erro = "Hora inválida.";
        else if (hora < 8 || hora > 18)
            return erro = "Horário fora de atendimento.";
        else if( hora > 23)
            return erro = "Hora inválida.";
        
        if(minuto > 59)
            return erro = "Hora inválida.";
            
        return erro;
    }

    public void agendar()
    {
        
        Agendamento agendamento = helper.obterModelo();
        
        String erroData = validaDataHora(agendamento.getData());
        
        if(agendamento.getAnimal() == null)
            JOptionPane.showMessageDialog(view, "Animal não registrado.", "Erro", JOptionPane.ERROR_MESSAGE);
        
        else if(!erroData.isEmpty())
            JOptionPane.showMessageDialog(view, erroData , "Erro", JOptionPane.ERROR_MESSAGE);
        
        else
        {
            new BDAgendamento().insert(agendamento);
            atualizaTabela();
            helper.limparTela();
        }
    }
    
    public void excluir(int linhaSelecionada) 
    {
        
        Agendamento excluir = helper.obterDaTabela(linhaSelecionada);
        new BDAgendamento().delete(excluir);
        atualizaTabela();
        helper.limparTela();
    }
}