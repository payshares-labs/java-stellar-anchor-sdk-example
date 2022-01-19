package org.stellar.anchor.server.config;


import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.stellar.anchor.config.AppConfig;

import javax.annotation.PostConstruct;
import java.util.List;

import static org.stellar.anchor.util.Log.infoB;

@Data
public class PropertyResourceAppConfig implements AppConfig {
    private String stellarNetworkPassPhrase = "Test SDF Network ; September 2015";
    private String hostUrl = "http://localhost:9800";
    private String horizonURI = "https://horizon-testnet.stellar.org";

    private String jwtSecretKey;
    private String assets = "assets-test.json";

    private List<String> languages;

    @PostConstruct
    void logConfig() {
        infoB("AppConfig:", this);
    }
}
