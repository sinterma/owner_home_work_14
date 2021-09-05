package tests;

import config.WebConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class WebTest {

    @Test

    public void testWebLocal() {

        System.setProperty("remote", "local");

        WebConfig config = ConfigFactory.create(WebConfig.class, System.getProperties());

        assertThat(config.browserName()).isEqualTo("chrome");

        assertThat(config.browserVersion()).isEqualTo("91.0");

        assertThat(config.isRemote()).isEqualTo(false);

    }

    // команда для запуска теста ./gradlew clean test -Dremote=local

    @Test

    public void testRemote() {

        System.setProperty("remote", "remote");

        WebConfig config = ConfigFactory.create(WebConfig.class, System.getProperties());

        assertThat(config.browserName()).isEqualTo("firefox");

        assertThat(config.browserVersion()).isEqualTo("87.0");

        assertThat(config.isRemote()).isEqualTo(true);

    }




    // команда для запуска теста ./gradlew clean test -Dremote=remote

}