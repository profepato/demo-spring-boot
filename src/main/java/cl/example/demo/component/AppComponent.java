package cl.example.demo.component;

import cl.example.demo.domain.App;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class AppComponent {
    @Value("${app.name}")
    private String appName;

    @Value("${app.version}")
    private String appVersion;

    @Bean("appInfo")
    private App loadAppInfo() {
        App app = new App();

        app.setName(appName);
        app.setVersion(appVersion);

        return app;
    }
}
