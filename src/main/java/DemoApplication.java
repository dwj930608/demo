import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.*"})
@MapperScan("com.example.mapper")
public class DemoApplication {
    /**
     * 董文杰
     * @param args
     */
    public static void main(String[] args) {

        SpringApplication.run(DemoApplication.class, args);
    }

}
