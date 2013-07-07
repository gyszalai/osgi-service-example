package hu.vanio.osgi.service;

/**
 * Example OSGi service implementation
 *
 * @author Gyula Szalai <gyula.szalai@vanio.hu>
 */
public class ExampleOsgiServiceImpl implements ExampleOsgiService {

    @Override
    public String greeting() {
        return "VANIO rocks! We can impement anything! ;D";
    }
    
}
