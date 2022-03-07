/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author OSCAR
 */
class Proyecto2_corregido {
    




    private static class receiveNotes {
        
        boolean receiveNotes1;

        public receiveNotes() {
             this.receiveNotes1 = true;                    
        
        }
    }
    
    /**public static void Counter(int value){
        
        int V = 0;
        V += value;
        return;
        
    }
    */

    static class Alumno{
        private String name;
        private String lastname;
        private int NumberExam;
        private int note;       

        private Alumno(String name, String lastname, int NumberExam, int note) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        
    }
    
    public static void main (String[] args){
        
        ArrayList<Alumno> alumnoList = new ArrayList<Alumno>();

        Scanner scan = new Scanner(System.in);
        
        
        for(int i = 0;  i< alumnoList.size(); i++) {
            System.out.println("Ingrese el nombre del alumno: ");
            String name = scan.next();
            
            System.out.println("Ingrese el apellido del alumno: ");
            String lastname = scan.next();
            
            System.out.println("Ingrese el nombre del alumno: ");
            int NumberExam = scan.nextInt();
            
            System.out.println("Ingrese el nombre del alumno: ");
            int note = scan.nextInt();
            scan.next();
            
            Alumno alumno = new Alumno(name, lastname, NumberExam, note);
            alumnoList.add(alumno);
            
            /**if( i > 5){
                
                System.out.println("Registro Completado");
                
                return false;
                
            }*/
        }
        
        ArrayList<Alumno> NameApproved = new ArrayList<Alumno>();
        ArrayList<Alumno> NombreDisapproved = new ArrayList<Alumno>();
        ArrayList<Alumno> NombreAverageList = new ArrayList<Alumno>();
        
        for(int x= 0;  x< alumnoList.size(); x++){
            System.out.println("Nombre: " + alumnoList.get(x).name + "\n Nota: " + alumnoList.get(x).note );
            if(alumnoList.get(x).note >=7){
                NameApproved.add(alumnoList.get(x));
            }
            else if(alumnoList.get(x).note > 0 && alumnoList.get(x).note < 7){
                NombreDisapproved.add(alumnoList.get(x));
            }
        }
        
    }
}
