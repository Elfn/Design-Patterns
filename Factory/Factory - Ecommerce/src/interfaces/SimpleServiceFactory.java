package interfaces;

import models.Service;

/**
 * Created by Elimane on Aug, 2020, at 13:37
 */
public class SimpleServiceFactory implements Platform{


    public Service callService(String serviceName)
    {
        return null;
    }

    @Override
    public Service chooseService(String category) {
        return null;
    }
}
