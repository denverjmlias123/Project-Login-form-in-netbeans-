package liaz;
import java.sql.Connection;
public class Liaz {
    public static void main(String[] args) {
        
       LiasCRUD l = new LiasCRUD();
       l.setVisible(true);

//       ActivityNo3 t = new ActivityNo3();
//       t.setVisible(true);
//        
//       MyFrame m = new MyFrame();
//       m.setVisible(true);
//        
//       MyFrame1 a = new MyFrame1();
//       a.setVisible(true);
//        
//        Login s = new Login();
//       s.setVisible(true);
       
       Connection conn = MySQLConnect.getConnection();
       
        
        
        
        
        
        
    }
}
