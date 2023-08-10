
package aplicação;

import singleton.AcessoBancoDeDados;

public class main {
    public static void main(String[] args) {
        AcessoBancoDeDados conexao1 = AcessoBancoDeDados.getAcessoBancoDeDados();
        AcessoBancoDeDados conexao2 = AcessoBancoDeDados.getAcessoBancoDeDados();
        
        System.out.println(conexao1);
        System.out.println(conexao2);
        System.out.println(AcessoBancoDeDados.getAcessoBancoDeDados());
    }
}
