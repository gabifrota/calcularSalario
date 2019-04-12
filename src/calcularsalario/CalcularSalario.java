package calcularsalario;
public class CalcularSalario {
    
    private String nome;
    public double salarioBa;
    public  String cargo;
    public double salarioLiq;
    public double calculando;
    
   public void setCargo (String cargo){
       this.cargo = cargo;
   
   } 
   public void setSalarioBa (double salarioBa){
         this.salarioBa = salarioBa;
         
   }
    
    public double calcula (){
        if (cargo.equals("desenvolvedor")){
            if (salarioBa >=3000){
                calculando = salarioBa * 0.2;
                salarioLiq = salarioBa - calculando;
            }else{
                calculando = salarioBa *0.1;
                salarioLiq = salarioBa - calculando;
            }
        }
        if (cargo.equals("DBA")){
            if (salarioBa >=2000){
              calculando = salarioBa * 0.25;
              salarioLiq = salarioBa - calculando;
            }else {
              calculando =  salarioBa * 0.15;
              salarioLiq = salarioBa - calculando;
            }
        }
        if (cargo.equals("testador")){
            if (salarioBa >= 2000){
              calculando = salarioBa * 0.25;
              salarioLiq = salarioBa - calculando;
            }else {
              calculando = salarioBa * 0.15;
              salarioLiq = salarioBa - calculando;
            }
        }
        if (cargo.equals("gerente")){
            if (salarioBa >= 5000){
                calculando = salarioBa * 0.3;
                salarioLiq = salarioBa - calculando;
            }else{
                calculando = salarioBa * 0.2;
                salarioLiq = salarioBa - calculando;
            }
        }
        return salarioLiq;
    }
}





   
    

