import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import calcularsalario.CalcularSalario;

public class testaCalSala {
    public CalcularSalario calcul;
    
    @Before
    public void inicia(){
     calcul = new CalcularSalario();
     
    }
     @Test
    public void testa (){
    calcul.setCargo("desenvolvedor");
    calcul.setSalarioBa(3000);
    assertEquals (2400,calcul.calcula(),0);
    } 
     @Test
    public void testa1 (){
    calcul.setCargo("DBA");
    calcul.setSalarioBa(2000);
    assertEquals (1500,calcul.calcula(),0);
    } 
     @Test
    public void testa2 (){
    calcul.setCargo("testador");
    calcul.setSalarioBa(2000);
    assertEquals (1500,calcul.calcula(),0);
    } 
    @Test
    public void testa3 () {
    calcul.setCargo("gerente");
    calcul.setSalarioBa(5000);
    assertEquals(3500, calcul.calcula(),0);
    }
     @Test
    public void testa4 (){
    calcul.setCargo("desenvolvedor");
    calcul.setSalarioBa(2500);
    assertEquals (2250,calcul.calcula(),0);
    } 
    
   
   
}
