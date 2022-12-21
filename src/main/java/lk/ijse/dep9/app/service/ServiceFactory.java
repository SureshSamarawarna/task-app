package lk.ijse.dep9.app.service;

import lk.ijse.dep9.app.service.custom.ProjectTaskServiceImpl;
import lk.ijse.dep9.app.service.custom.UserServiceImpl;
import net.bytebuddy.implementation.bind.annotation.Super;

public class ServiceFactory {
    private static ServiceFactory serviceFactory;
    private ServiceFactory(){}
    public static ServiceFactory getInstance(){
        return (serviceFactory==null)? (serviceFactory = new ServiceFactory()):serviceFactory;
    }

    public <T extends SuperService> T getService(ServiceTypes serviceTypes,Class<T> clazz){
        switch (serviceTypes){
            case USER:
                return clazz.cast(new UserServiceImpl());
            case PROJECT_TASK:
                return clazz.cast(new ProjectTaskServiceImpl());
            default:
                return null;
        }

    }
}
