
package bancobrasil;

import java.util.ArrayList;

public class GerenteRepository {
    
    ArrayList <Gerente> gerente = new ArrayList<>();
    
    
    
    public ArrayList<Gerente> addGerente(){
        gerente.add(new Gerente("Gato","240801","Matheus","Vinícius","85998193237"));
        gerente.add(new Gerente("Macaco","101000","Iury","Mendes","8869241119"));
        
        return gerente;
    }
}
