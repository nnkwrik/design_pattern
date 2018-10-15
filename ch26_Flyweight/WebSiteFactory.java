package ch26_Flyweight;

import java.util.HashMap;
import java.util.Hashtable;

/**
 * Created by nnkwrik
 * 18/10/15 15:41
 */
public class WebSiteFactory {

    private HashMap<String, WebSite> flyweights = new HashMap();

    public WebSite getWebSiteCategory(String key) {
        if (!flyweights.containsKey(key))
            flyweights.put(key, new ConcreteWebSite(key));
        return flyweights.get(key);
    }

}
