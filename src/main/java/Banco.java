/*
  * Matheus de Mello Bueno RA:2070286 - POO ENGENHARIA DE SOFTWARE
 */

import java.util.ArrayList;

public class Banco
{
    
    public static ArrayList<Usuario> usuario;
    public static ArrayList<Cliente> cliente;
    public static ArrayList<Servico> servico;
    public static ArrayList<Agendamento> agendamento;
    public static ArrayList<Animal> animal;
    
    public static void inicia()
    {
    
        //Instancia os Objetos
        usuario = new ArrayList<Usuario>();
        cliente = new ArrayList<Cliente>();
        servico = new ArrayList<Servico>();
        agendamento = new ArrayList<Agendamento>();
        animal = new ArrayList<Animal>();
        
        //Registro carregados ao iniciar
        
        //Usuarios
        Usuario usuario1 = new Usuario(1, "teste", "123");
        Usuario usuario2 = new Usuario(2, "admin", "admin");
        
        
        //Serviços
        Servico servico1 = new Servico(1, "Banho", (float) 65.00);
        Servico servico2 = new Servico(2, "Tosa", (float) 45.00);
        Servico servico3 = new Servico(3, "Tosa Higiênica", (float) 55.00);
        Servico servico4 = new Servico(4, "Banho + Tosa", (float) 110.00);
        Servico servico5 = new Servico(5, "Banho + Tosa Higiênica", (float) 120.00);
        Servico servico6 = new Servico(6, "Completo", (float) 150.00);
        
        //Clientes
        Cliente cliente1 = new Cliente(1, "Jose Arnaldo da Silva de Jesus", "088.795.563-10", "03/09/1976", "(43)98452-1352", "jose_123@hotmail.com", "Rua Tomaz, 32. Jardim das Flores. Cornélio Procópio - PR", "86.300-000");
        Cliente cliente2 = new Cliente(2, "Maria das Cruzes", "028.765.522-03", "21/06/1981", "(43)99652-4252", "maria_cruzes@hotmail.com", "Rua Jonas Raimundo, 46. Jardim Azul. Cornélio Procópio - PR", "86.300-000");
        Cliente cliente3 = new Cliente(3, "Paulo Roberto de Carvalho", "017.723.239-08", "22/01/1994", "(43)95321-1745", "pauloCarvalho@hotmail.com", "Rua Lourenço, 1445. Morumbi. Cornélio Procópio - PR", "86.300-000");
        Cliente cliente4 = new Cliente(4, "Ana Clara Afonso", "059.215.845-12", "19/06/2001", "(43)94512-6523", "ana_clara02@hotmail.com", "Rua dos caramujos, 62. Polones. Cornélio Procópio - PR", "86.300-000");
        Cliente cliente5 = new Cliente(5, "Paula Medeiros", "045.956.127-03", "26/08/1997", "(43)94567-7844", "paulaMed@hotmail.com", "Rua Bento de Souza, 32. Vila Santos. Cornélio Procópio - PR", "86.300-000");
        
        //Animal
        Animal animal1 = new Animal(1, "Sansão", 1, "Buldogue", "preto e branco", cliente1);
        Animal animal2 = new Animal(2, "Belinha", 1, "Labrador", "branco", cliente2);
        Animal animal3 = new Animal(3, "Jujuba", 1, "Chihuahua", "fulvo", cliente3);
        Animal animal4 = new Animal(4, "Roger", 2, "Siamês", "preto", cliente3);
        Animal animal5 = new Animal(5, "Buba", 2, "Siamês", "Branco", cliente4);
        
        //Agendamentos
        Agendamento agendamento1 = new Agendamento(1, cliente2, servico6, "12/07/2022 10:30", "", animal1);
        Agendamento agendamento2 = new Agendamento(2, cliente3, servico2, "15/06/2022 11:45", "Shampo antialérgico", animal2);
        Agendamento agendamento3 = new Agendamento(3, cliente4, servico4, "22/06/2022 16:30", "Gato bravo", animal4);
        
        //Adicionar elementos na lista
        usuario.add(usuario1);
        usuario.add(usuario2);
        
        cliente.add(cliente1);
        cliente.add(cliente2);
        cliente.add(cliente3);
        cliente.add(cliente4);
        cliente.add(cliente5);
        
        animal.add(animal1);
        animal.add(animal2);
        animal.add(animal3);
        animal.add(animal4);
        animal.add(animal5);
        
        servico.add(servico1);
        servico.add(servico2);
        servico.add(servico3);
        servico.add(servico4);
        servico.add(servico5);
        servico.add(servico6);
        
        agendamento.add(agendamento1);
        agendamento.add(agendamento2);
        agendamento.add(agendamento3);
    }
}
