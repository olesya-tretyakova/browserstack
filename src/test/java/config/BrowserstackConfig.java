package config;

import org.aeonbits.owner.Config;

@Config.Sources({"classpath:credential.properties"})
public interface BrowserstackConfig extends Config {
    String userName();

    String mobileKey();

    String appURL();
}

