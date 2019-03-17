package sistema;

/**
 ** @author Antony-PC
 **/
public class FuncionHash {
    public FuncionHash(){
        
    }
    
    public int FuncionHash(String llave){
        int token = 0;
        for (int x=0;x<llave.length();x++)
            token = token + (llave.codePointAt(x))*(x+1);
        return token;
    }
}
