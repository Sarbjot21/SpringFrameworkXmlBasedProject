import com.spring.model.Doctor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringFrameworkXmlBasedApplication {
    public static void main(String[] args) {
        //Doctor doctor = new Doctor();
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        Doctor doctor = context.getBean(Doctor.class);
        System.out.println(doctor);
        doctor.assist();
    }
}
