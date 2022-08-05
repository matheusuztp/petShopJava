package Data;

import Classes.Banco;
import Classes.Animal;
import java.util.ArrayList;

/*
 * Matheus de Mello Bueno RA:2070286 - POO ENGENHARIA DE SOFTWARE
*/

public class BDAnimal 
{
    public void insert(Animal animal)
    {
        if(animal.getRegistro() == 0)
        {
            animal.setRegistro(proximoId());
            Banco.animal.add(animal);
        }
    }
    
    public boolean update(Animal animal)
    {
        for (int i = 0; i < Banco.animal.size(); i++) 
        {
            if(registroSaoIguais(Banco.animal.get(i),animal))
            {
                Banco.animal.set(i, animal);
                return true;
            }
        }
        return false;      
    }
    
    public boolean delete(Animal animal)
    {
        for (Animal animalLista : Banco.animal) 
        {
            if(registroSaoIguais(animalLista ,animal))
            {
                Banco.animal.remove(animalLista);
                return true;
            }
        }
        return false;
    }
    
    public ArrayList<Animal> selectAll()
    {
        return Banco.animal;
    }
    
    private boolean registroSaoIguais(Animal animal, Animal animalComparacao) 
    {
        return animal.getRegistro() ==  animalComparacao.getRegistro();
    }
    
    private int proximoId()
    {
        int maiorId = 0;
        
        for (Animal animal : Banco.animal) 
        {
           int id = animal.getRegistro();
            if(maiorId < id)
                maiorId = id;
        }
        return maiorId + 1;
    }
}
