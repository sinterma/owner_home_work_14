package config;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE) // помогает взять следующий путь до файла, если в какой то недоступен

@Config.Sources({

        "file:/user/api.properties", // абсолютный  путь до файла, предварительно создать файл

        // и заполнить его данными из api.properties

        "classpath:api.properties" //файл в папочке resources

})

public interface ApiConfig extends Config {

    @Key("baseUrl")

    String baseUrl();

    @Key("token")

    String token();
}