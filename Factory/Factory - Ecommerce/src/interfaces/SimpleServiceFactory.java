package interfaces;

import models.Service;

/**
 * Created by Elimane on Aug, 2020, at 13:37
 */
public class SimpleServiceFactory implements Platform{


    public Service callService(String serviceName)
    {
        //That function will call chooseService below
        //and perform service call
        return null;
    }

    @Override
    public Service chooseService(String category) {
        //Here we will return service
        //Acoording to the choosen one
        return null;
    }
}
