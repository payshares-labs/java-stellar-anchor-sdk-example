package org.stellar.anchor.server.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.stellar.anchor.config.Sep10Config;

import javax.annotation.PostConstruct;
import java.util.List;

import static org.stellar.anchor.util.Log.infoB;

@Data
public class PropertyResourceSep10Config implements Sep10Config {
    private String homeDomain;
    private boolean clientAttributionRequired = false;
    private Boolean enabled = true;

    private String signingSeed;

    private Integer authTimeout = 900;
    private Integer jwtTimeout = 86400;
    private List<String> clientAttributionDenyList;
    private List<String> clientAttributionAllowList;

    @PostConstruct
    void logConfig() {
        // TODO: Hide secret
        infoB("Sep10Config:", this);
    }
}
