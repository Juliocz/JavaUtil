package DATOS;


import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.text.JTextComponent;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Julio
 */
public class DValidacion {
    private static String messageOnlyText="Por favor ingrese solo texto";
    private static String messageOnlyNum="Por favor ingrese solo numeros.";
    private static String message_maxSize="El campo supera el tamaño de caracteres que es : ";
    private static String message_isEmpty="El campo esta vacio";
    
    public static boolean validate(JTextComponent jtext,int maxsize,boolean onlyNum,JLabel report){
        String t=jtext.getText().toString();
        boolean result=true;
        if(t.isEmpty()){
            report.setText(message_isEmpty);
            result=false;
        }else
        if(t.length()>maxsize){
            report.setText(message_maxSize+maxsize);
            result=false;
        }else
        //si no tiene solo numeros y pide solo  numero, no se cumple
         if(!(t.matches("[0-9]+")) && onlyNum){
             //report.setText("contiene solo numeros y pide solo texto");
             //report.setText("Por favor solo ingrese texto sin numeros.");
             report.setText(messageOnlyNum);
            //jtext.setBackground(new Color(255,240,240));
           // jtext.setForeground(new Color(255,255,255));
            result=false;
         }
         //Si no tiene solo texto y pide solo texto, no se cumple
         if(!t.matches("^[a-zA-Z\\s]*$") && !onlyNum){
            //System.out.println("contiene solo texto y pide solo numeros");
            //report.setText("Por favor solo ingrese numeros.");
            report.setText(messageOnlyText);
            result=false;    
        }
         //si ninguna condicion no se incumplio, sale todo true
         if(result){
        jtext.setBackground(new Color(255,255,255));
        jtext.setForeground(new Color(0,0,0));
        report.setText("Bien :)");
         }else{
        jtext.setBackground(new Color(200,10,10));
        jtext.setForeground(new Color(255,255,255));
         }return result;  
    }
    /*public static boolean validate(JTextComponent jtext,int maxsize,boolean onlyNum,JLabel report){
        String t=jtext.getText().toString();
        boolean result=true;
        if(t.isEmpty()){
            report.setText("El campo esta vacio.");
            result=false;
        }else
        if(t.length()>maxsize){
            report.setText("El campo supera el tamaño de caracteres maximo: "+maxsize);
            result=false;
        }else
        //si no tiene solo numeros y pide solo  numero, no se cumple
         if(!(t.matches("[0-9]+")) && onlyNum){
             //report.setText("contiene solo numeros y pide solo texto");
             //report.setText("Por favor solo ingrese texto sin numeros.");
             report.setText("Por favor ingrese solo numeros");
            //jtext.setBackground(new Color(255,240,240));
           // jtext.setForeground(new Color(255,255,255));
            result=false;
         }
         //Si no tiene solo texto y pide solo texto, no se cumple
         if(!t.matches("^[a-zA-Z\\s]*$") && !onlyNum){
            //System.out.println("contiene solo texto y pide solo numeros");
            //report.setText("Por favor solo ingrese numeros.");
            report.setText("Por favor solo texto");
            result=false;    
        }
         //si ninguna condicion no se incumplio, sale todo true
         if(result){
        jtext.setBackground(new Color(255,255,255));
        jtext.setForeground(new Color(0,0,0));
        report.setText("Bien :");
         }else{
        jtext.setBackground(new Color(200,10,10));
        jtext.setForeground(new Color(255,255,255));
         }return result;  
    }*/
}
