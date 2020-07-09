/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaclinico;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Luis
 */
public class Receta {
    
    protected Paciente paciente;
    
    protected Date fecha;
    
    protected PlanNutricional planNut;
    
    protected Doctor doctor;
    
    protected ArrayList<Medicamentos> medicamentos;
    
}
