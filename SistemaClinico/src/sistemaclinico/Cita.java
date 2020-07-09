/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaclinico;

import java.util.Date;

/**
 *
 * @author Luis
 */
public class Cita {
    
    protected Paciente paciente;
    
    protected Date fecha;
    
    protected boolean pagada;
    
    protected String registradoPor;
    
    public void realizarPago(Pago pago){
        
    }
    
}
