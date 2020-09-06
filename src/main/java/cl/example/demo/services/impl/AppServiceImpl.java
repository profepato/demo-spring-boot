package cl.example.demo.services.impl;

import cl.example.demo.domain.App;
import cl.example.demo.domain.responses.AppResponse;
import cl.example.demo.services.AppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class AppServiceImpl implements AppService {
    @Autowired
    @Qualifier("appInfo")
    private App appInfo;

    @Override
    public AppResponse getApp() {
        AppResponse appResponse = new AppResponse();

        appResponse.setApp(appInfo);

        return appResponse;
    }
}
