package org.stellar.anchor.server.config;

import lombok.Data;
import org.stellar.anchor.config.Sep24Config;

import javax.annotation.PostConstruct;

import static org.stellar.anchor.util.Log.infoB;

@Data
public class PropertyResourceSep24Config implements Sep24Config {
    int interactiveJwtExpiration = 300;
    String interactiveUrl = "NA";

    @PostConstruct
    void logConfig() {
        infoB("Sep24Config:", this);
    }
}
