import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
public class BCryptGen {
  public static void main(String[] args) {
    BCryptPasswordEncoder enc = new BCryptPasswordEncoder();
    String pwd = args.length>0?args[0]:"adminpass";
    System.out.println(enc.encode(pwd));
  }
}
