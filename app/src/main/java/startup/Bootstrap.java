package startup;/* explains Tomcat's default container */

import core.SimpleContainer;
import org.apache.catalina.connector.http.HttpConnector;

public final class Bootstrap {
    public static void main(String[] args) {
        HttpConnector connector = new HttpConnector();
        SimpleContainer container = new SimpleContainer();
        connector.setContainer(container);
        try {
            connector.initialize();
            connector.start();

            // make the application wait until we press crtl+c.
            while(true){}
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}