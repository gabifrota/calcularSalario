import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import testaMorse.TestaMorse;

public class testacodMorse {
    private TestaMorse morse;
    
    @Before
    public void inicializa(){
        morse = new TestaMorse ();
        
    
    } 
    @Test
    public void testa (){
        morse.setMensagem ("gabi");
        assertEquals ("--* *- -*** **", morse.codifica());
        
    }
   @Test
    public void testa1 (){
        morse.setMensagem("SOS");
        assertEquals ("*** --- ***", morse.codifica());
    
    
    }
  @Test
  public void testa2 (){
      morse.setMensagem("boa");
      assertEquals ("-*** --- *-", morse.codifica());
  
  
  }
  @Test
  public void testa3 (){
      morse.setMensagem("3");
      assertEquals("***--", morse.codifica());
  
  
  }
  
    
    
    
}
