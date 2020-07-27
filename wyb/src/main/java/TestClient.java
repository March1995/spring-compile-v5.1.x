import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Marcher丶
 */
public class TestClient {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.refresh();
        context.register(HelloSpring.class);
        HelloSpring helloSpring = (HelloSpring) context.getBean("helloSpring");
        helloSpring.say();
    }
}
