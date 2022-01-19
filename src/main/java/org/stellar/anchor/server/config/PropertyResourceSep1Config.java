package org.stellar.anchor.server.config;

import lombok.Data;
import org.stellar.anchor.config.Sep1Config;

import javax.annotation.PostConstruct;

import static org.stellar.anchor.util.Log.infoB;

@Data
public class PropertyResourceSep1Config implements Sep1Config {
    String stellarFile;
    boolean enabled = false;

    @PostConstruct
    void logConfig() {
        infoB("Sep1Config:", this);
    }
}
