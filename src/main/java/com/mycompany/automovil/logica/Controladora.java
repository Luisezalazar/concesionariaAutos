
package com.mycompany.automovil.logica;

import com.mycompany.automovil.persistencia.ControladoraPersistencia;
import java.util.List;


public class Controladora {

    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    public void agregarAutomovil(String modelo, String marca, String motor, String color, String patente, int cantPuertas) {
        //Instancio auto y seteo los valores para la persistencia
        Automovil auto = new Automovil();
        auto.setModelo(modelo);
        auto.setMarca(marca);
        auto.setMotor(motor);
        auto.setColor(color);
        auto.setPatente(patente);
        auto.setCantPuertas(cantPuertas);
        //Coloco la instancia dentro y la mando a la persistencia
        controlPersis.agregarAutomovil(auto);
        
    }

    public List<Automovil> traerAutos() {
        
        return controlPersis.traerAutos();
        
    }

    public void borrarAuto(int idAuto) {
        
        controlPersis.borrarAuto(idAuto);
        
    }

    public Automovil traerAutos(int idAuto) {
    
        return controlPersis.traerAutos(idAuto);
        
    }

    public void modificarAuto(Automovil auto, String modelo, String marca, String motor, String color, String patente, int cantPuertas) {
        //Seteo los valores nuevos
        auto.setColor(color);
        auto.setModelo(modelo);
        auto.setMarca(marca);
        auto.setPatente(patente);
        auto.setMotor(motor);
        auto.setCantPuertas(cantPuertas);
        
        //Persistencia modifica
        controlPersis.modificarAuto(auto);
    }

    
    
    
}
