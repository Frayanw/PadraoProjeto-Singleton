package singleton;

public class AcessoBancoDeDados {

    //Atributo statico de privado
    private static AcessoBancoDeDados conexaoBD = null;

    //Construtor privado
    private AcessoBancoDeDados() {

    }
    
    public static AcessoBancoDeDados getAcessoBancoDeDados(){
        if (conexaoBD == null) {
            conexaoBD = new AcessoBancoDeDados();
        }
        return conexaoBD;
    }
}
