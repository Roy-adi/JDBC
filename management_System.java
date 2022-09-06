import java.sql.SQLException ;
    import java.util.Scanner ;
    public class Crudoperation {
   public static void main ( String [ ] args ) throws SQLException {
   Menudriven e = new Menudriven ( ) ;
    Scanner s = new Scanner ( System.in ) ;
    int ch ;
    do {
    System.out.println ( " 1 . INSERT \ n 2. DISPLAY \ n 3. UPDATE \ n 4. DELETE \ n 5. EXIT " ) ;
    System.out.println ( " Enter  your choice from 1-5 " ) 
    ch = Integer.parseInt ( s.nextLine ( ) ) ;
    System.out.println ( " --
    switch ( ch ) {
    case 1 :
        e.saveMenudriven ( ) ;
        break ;
    case 2 :
        e.fetchMenudriven ( ) ;
        break ;
                            INSERT \ n 2. DISPLAY \ n 3. UPDATE \ n 4. DELETE \ n 5. EXIT " ) ;
                               your choice from 1-5 " ) ;
    case 3 :
        e.updateMenudriven ( ) ;
        break ;
    case 4 :
        e.deleteMenudriven ( ) ;
        break;
    }
        while(ch!5);
                        }}}                    
         
                                             
