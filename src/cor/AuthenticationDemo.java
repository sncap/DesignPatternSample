package cor;

public class AuthenticationDemo {
    public static void main(String[] args) {
        AuthenticationProcessor oProcessor = new OAuthAuthenticationProcessor(null);
        AuthenticationProcessor uProcessor = new UsernamePasswordAuthenticationProcessor(oProcessor);

//        AuthenticationProvider token = new UsernamePasswordProvider();
//        AuthenticationProvider token = new OAuthTokenProvider();
        AuthenticationProvider token = new SamlAuthenticationProvider();

        if (uProcessor.isAuthorized(token)) {
            System.out.println("인증 성공");
        } else {
            System.out.println("인증 실패");
        }
    }
}
