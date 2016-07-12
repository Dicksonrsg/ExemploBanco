
package gui;

import dao.UsuarioDAO;
import javax.swing.JOptionPane;
import model.Usuario;

public class Principal {

    public static void main(String[] args) {
        
        UsuarioDAO dao = new UsuarioDAO();
        Usuario usuario  = new Usuario();
        
//        usuario.setNome( JOptionPane.showInputDialog("Nome do Usuário"));
//        
//        usuario.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Idade do Usuário")));
//        
//        usuario.setId(
//                Integer.parseInt(JOptionPane.showInputDialog("Idade do Usuário"))
//                
//        );
//        
//       if( dao.excluir(usuario)){}
//       JOptionPane.showMessageDialog(null, "Sucesso!");
//        
//    } else {JOptionPane.showMessageDialog(null, "Falha!");}
    
    String texto = null;
    for (Usuario u: dao.ListarTudo()){
         texto += u.getId() + "\t" + u.getNome() + "\t" + u.getIdade() + "\n";
    
    }
}
}
