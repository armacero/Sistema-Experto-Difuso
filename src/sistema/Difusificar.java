/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema;

/**
 *
 * @author Antony-PC
 */
public class Difusificar {
    
    public Difusificar(){
        
    }
    public String Difusificar(String competencia,int calificacion){
        String dif = "";
        switch(competencia){
            case "Solucion":
                if(calificacion>=0 && calificacion<=40){
                    dif = "Mala " + Pendiente(calificacion, 0.0, 0.0, 40.0, 1.0);
                }
                if(calificacion>=40 && calificacion<=60){
                    dif = "Mala " + Pendiente(calificacion, 40.0, 1.0, 60.0, 0.0);
                }
                if(calificacion>=80 && calificacion<=90){
                    dif = "Regular " + Pendiente(calificacion, 80.0, 1.0, 100.0, 0.0);
                }
                if(calificacion>=60 && calificacion<=90){
                    if(calificacion<=66){
                        dif = "Regular " + Recta(calificacion, 60.0, 0.0, 80.0, 1.0);
                    }
                    if(calificacion>66){
                        dif = "Regular " + Recta(calificacion, 40.0, 1.0, 80.0, 0.0);
                    }
                }if(calificacion>=90 && calificacion<=100){
                    if(calificacion<=94){
                        dif = "Regular " + Recta(calificacion, 80.0, 1.0, 100.0, 0.0);
                    }
                    if(calificacion>94){
                        dif = "Regular " + Recta(calificacion, 90.0, 0.0, 100.0, 1.0);
                    }
                }
                break;
            case "Trabajo":
                if(calificacion>=0 && calificacion<=30){
                    dif = "Mala " + Pendiente(calificacion, 0.0, 0.0, 30.0, 1.0);
                }
                if(calificacion>=30 && calificacion<=40){
                    dif = "Mala " + Pendiente(calificacion, 30.0, 1.0, 60.0, 0.0);
                }
                if(calificacion>=45 && calificacion<=60){
                    if(calificacion<50){
                        dif = "Regular " + Recta(calificacion, 30.0, 1.0, 60.0, 0.0);
                    }
                    if(calificacion>=50){
                        dif = "Regular " + Recta(calificacion, 45.0, 0.0, 60.0, 1.0);
                    }
                }
                if(calificacion>=60 && calificacion<=70){
                    dif = "Regular " + Pendiente(calificacion, 60.0, 1.0, 74.0, 0.0);
                }
                if(calificacion>=68 && calificacion<74){
                    if(calificacion<70){
                        dif = "Buena " + Recta(calificacion, 60.0, 1.0, 74.0, 0.0);
                    }
                    if(calificacion>=70){
                        dif = "Buena " + Recta(calificacion, 68.0, 0.0, 74.0, 1.0);
                    }
                }
                if(calificacion>=74 && calificacion<92){
                    dif = "Buena " + 1.0;
                }
                if(calificacion>=92){
                    dif = "Buena " + Pendiente(calificacion, 92.0, 1.0, 100.0, 0.0);
                }
                break;
            case "Conocimientos":
                if(calificacion>=0 && calificacion<=30){
                    dif = "Mala " + Pendiente(calificacion, 0.0, 0.0, 30.0, 1.0);
                }
                if(calificacion>=30 && calificacion<=40){
                    dif = "Mala " + Pendiente(calificacion, 30.0, 1.0, 60.0, 0.0);
                }
                if(calificacion>=45 && calificacion<=60){
                    if(calificacion<50){
                        dif = "Mala " + Recta(calificacion, 30.0, 1.0, 60.0, 0.0);
                    }
                    if(calificacion>=50){
                        dif = "Regular " + Recta(calificacion, 45.0, 0.0, 60.0, 1.0);
                    }
                }
                if(calificacion>=60 && calificacion<=70){
                    dif = "Regular " + Pendiente(calificacion, 60.0, 1.0, 74.0, 0.0);
                }
                if(calificacion>=68 && calificacion<74){
                    if(calificacion<70){
                        dif = "Buena " + Recta(calificacion, 60.0, 1.0, 74.0, 0.0);
                    }
                    if(calificacion>=70){
                        dif = "Buena " + Recta(calificacion, 68.0, 0.0, 74.0, 1.0);
                    }
                }
                if(calificacion>=74){
                    dif = "Buena " + Recta(calificacion, 74.0, 0.0, 100.0, 1.0);
                }
                break;
            case "Investigacion":
                if(calificacion>=0 && calificacion<=40){
                    dif = "Mala " + Pendiente(calificacion, 0.0, 0.0, 40.0, 1.0);
                }
                if(calificacion>=40 && calificacion<=60){
                    dif = "Mala " + Pendiente(calificacion, 40.0, 1.0, 60.0, 0.0);
                }
                if(calificacion>=80 && calificacion<=90){
                    dif = "Mala " + Pendiente(calificacion, 80.0, 1.0, 100.0, 0.0);
                }
                if(calificacion>=60 && calificacion<=80){
                    if(calificacion<=66){
                        dif = "Regular " + Recta(calificacion, 60.0, 0.0, 80.0, 1.0);
                    }
                    if(calificacion>66){
                        dif = "Regular " + Recta(calificacion, 40.0, 1.0, 80.0, 0.0);
                    }
                }if(calificacion>=90 && calificacion<=100){
                    if(calificacion<=94){
                        dif = "Buena " + Recta(calificacion, 80.0, 1.0, 100.0, 0.0);
                    }
                    if(calificacion>94){
                        dif = "Buena " + Recta(calificacion, 90.0, 0.0, 100.0, 1.0);
                    }
                }
                break;
            case "Autonoma":
                if(calificacion>=0 && calificacion<=35){
                    dif = "Mala " + Pendiente(calificacion, 0.0, 0.0, 35.0, 1.0);
                }
                if(calificacion>=35 && calificacion<=52){
                    dif = "Mala " + Pendiente(calificacion, 35.0, 1.0, 70.0, 0.0);
                }
                if(calificacion>=52 && calificacion<=70){
                    if(calificacion<=58){
                        dif = "Regular " + Recta(calificacion, 52.0, 0.0, 70.0, 0.0);
                    }
                    if(calificacion>58){
                        dif = "REgular " + Recta(calificacion, 35.0, 1.0, 70.0, 1.0);
                    }
                }
                if(calificacion>=70 && calificacion<=78){
                    dif = "Regular " + Pendiente(calificacion, 70.0, 1.0, 78.0, 0.0);
                }
                if(calificacion>=78 && calificacion<=88){
                    if(calificacion<=82){
                        dif = "Buena " + Recta(calificacion, 80.0, 0.0, 88.0, 1.0);
                    }
                    if(calificacion>82){
                        dif = "Buena " + Recta(calificacion, 70.0, 1.0, 88.0, 0.0);
                    }
                }
                if(calificacion>=88 && calificacion<=92){
                    dif = "Buena " + Pendiente(calificacion, 88.0, 1.0, 92.0, 1.0);
                }
                break;
            case "Diseñar":
                if(calificacion>=0 && calificacion<=40){
                    dif = "Malo " + Pendiente(calificacion, 0.0, 0.0, 40.0, 1.0);
                }
                if(calificacion>=40 && calificacion<=60){
                    dif = "Malo " + Pendiente(calificacion, 40.0, 1.0, 80.0, 0.0);
                }
                if(calificacion>=60 && calificacion<=80){
                    if(calificacion<=66){
                        dif = "Regular " + Recta(calificacion, 40.0, 1.0, 80.0, 0.0);
                    }
                    if(calificacion>66){
                        dif = "Regular " + Recta(calificacion, 60.0, 0.0, 80.0, 1.0);
                    }
                }
                if(calificacion>=80 && calificacion<=90){
                    dif = "Regular " + Pendiente(calificacion, 80.0, 1.0, 100.0, 0.0);
                }
                if(calificacion>=90 && calificacion<=100){
                    if(calificacion<=94){
                        dif = "Buena " + Recta(calificacion, 90.0, 0.0, 100.0, 1.0);
                    }
                    if(calificacion>94){
                        dif = "Buena " + Recta(calificacion, 80.0, 1.0, 100.0, 0.0);
                    }
                }
                break;
            case "Analisis":
                if(calificacion>=0 && calificacion<=30){
                    dif = "Malo " + Pendiente(calificacion, 0.0, 0.0, 30.0, 1.0);
                }
                if(calificacion>=30 && calificacion<=45){
                    dif = "Malo " + Pendiente(calificacion, 30.0, 1.0, 60.0, 0.0);
                }
                if(calificacion>=40 && calificacion<=60){
                    if(calificacion<=50){
                        dif = "Regular " + Recta(calificacion, 45.0, 0.0, 60.0, 1.0);
                    }
                    if(calificacion>50){
                        dif = "Regular " + Recta(calificacion, 30.0, 1.0, 60.0, 0.0);
                    }
                }
                if(calificacion>=60 && calificacion<=68){
                    dif = "Regular " + Pendiente(calificacion, 60.0, 1.0, 74.0, 0.0);
                }
                if(calificacion>=68 && calificacion<=74){
                    if(calificacion<=70){
                        dif = "Regular " + Recta(calificacion, 68.0, 0.0, 74.0, 1.0);
                    }
                    if(calificacion>70){
                        dif = "Regular " + Recta(calificacion, 60.0, 1.0, 74.0, 0.0);
                    }
                }
                if(calificacion>=74 && calificacion<=92){
                    dif = "Buena " + Pendiente(calificacion, 74.0, 1.0, 92.0, 1.0);
                }
                if(calificacion>=92 && calificacion<=100){
                    dif = "Buena " + Pendiente(calificacion, 92.0, 1.0, 100.0, 0.0);
                }
                break;
            case "Logro":
                if(calificacion>=0 && calificacion<=40){
                    dif = "Malo " + Pendiente(calificacion, 0.0, 0.0, 40.0, 1.0);
                }
                if(calificacion>=40 && calificacion<=60){
                    dif = "Malo " + Pendiente(calificacion, 40.0, 1.0, 80.0, 0.0);
                }
                if(calificacion>=60 && calificacion<=80){
                    if(calificacion<=66){
                        dif = "Regular " + Recta(calificacion, 40.0, 1.0, 80.0, 0.0);
                    }
                    if(calificacion>66){
                        dif = "Regular " + Recta(calificacion, 60.0, 0.0, 80.0, 1.0);
                    }
                }
                if(calificacion>=80 && calificacion<=90){
                    dif = "Regular " + Pendiente(calificacion, 80.0, 1.0, 100.0, 0.0);
                }
                if(calificacion>=90 && calificacion<=100){
                    if(calificacion<=83){
                        dif = "Buena " + Recta(calificacion, 80.0, 1.0, 100.0, 0.0);
                    }
                    if(calificacion>83){
                        dif = "Buena " + Recta(calificacion, 90.0, 0.0, 100.0, 1.0);
                    }
                }
                break;
        }
        return dif;
    }
    
    public double Pendiente(double x,double x1,double y1,double x2,double y2){
        double y = 0.0;
        y = ((x-x1)*(y2-y1)/(x2-x1)) + y1;
        return y;
    }
    public double Recta(double x,double x1,double y1,double x2,double y2){
        double y = 0.0;
        double m = (y2-y1)/(x2-1);
        y=m*x-m*x1+y1;
        return y;
    }
}
