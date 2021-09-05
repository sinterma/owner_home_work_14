package config;

import org.aeonbits.owner.Config;

@Config.Sources({

        "classpath:${remote}.properties" //файл в папочке resources

})

public interface WebConfig extends Config {

    @Key("browser.name")
    String browserName();

    @Key("browser.version")
    String browserVersion();

    @Key("is_remote")
    boolean isRemote();

}