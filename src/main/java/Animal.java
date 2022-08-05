/*
 * Matheus de Mello Bueno RA:2070286 - POO ENGENHARIA DE SOFTWARE
 */
  
public class Animal
{
    
    private String raca;
    private int registro;
    private String cor;
    private String nome;
    private String tipo;
    private Cliente cliente;

    //sobrecarga
    public Animal()
    {

    }

    public Animal(int registro, String nome, int tipo, String raca, String cor, Cliente cliente) 
    {
        this.raca = raca;
        this.tipo =(tipo == 1? "Cachorro" : "Gato");
        this.registro = registro;
        this.cor = cor;
        this.nome = nome;
        this.cliente = cliente;
    }

    public Cliente getCliente() 
    {
        return cliente;
    }

    public void setCliente(Cliente cliente) 
    {
        this.cliente = cliente;
    }
    
    public String getTipo() 
    {
        return tipo;
    }

    public void setTipo(int tipo) 
    {
        this.tipo = (tipo == 1? "Cachorro" : "Gato");
    }
    
    public String getNome() 
    {
        return nome;
    }

    public void setNome(String nome) 
    {
        this.nome = nome;
    }
    
    public int defineTipo(int valor)
    {
        return valor;       
    }

    public String getRaca() 
    {
        return raca;
    }

    public void setRaca(String raca) 
    {
        this.raca = raca;
    }

    public int getRegistro() 
    {
        return registro;
    }

    public void setRegistro(int registro) 
    {
        this.registro = registro;
    }

    public String getCor() 
    {
        return cor;
    }

    public void setCor(String cor) 
    {
        this.cor = cor;
    }
    
    @Override
    public String toString()
    {
        return getNome();    
    }
}
