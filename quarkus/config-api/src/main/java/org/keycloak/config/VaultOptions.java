package org.keycloak.config;

import java.io.File;
import java.util.Map;

public class VaultOptions {

    public enum Provider {
        file,
        hashicorp;
    }

    public static final Option VAULT = new OptionBuilder<>("vault", Provider.class)
            .category(OptionCategory.VAULT)
            .description("Enables a vault provider.")
            .buildTime(true)
            .build();

    public static final Option VAULT_DIR = new OptionBuilder<>("vault-dir", File.class)
            .category(OptionCategory.VAULT)
            .description("If set, secrets can be obtained by reading the content of files within the given directory.")
            .build();

    public static final Option VAULT_UNMAPPED = new OptionBuilder<>("vault-", String.class)
            .category(OptionCategory.VAULT)
            .description("Maps any vault option to their corresponding properties in quarkus-vault extension.")
            .hidden()
            .buildTime(true)
            .build();

    public static final Option VAULT_URL = new OptionBuilder<>("vault-url", String.class)
            .category(OptionCategory.VAULT)
            .description("The vault server url.")
            .hidden()
            .buildTime(true)
            .build();

    public static final Option VAULT_KV_PATHS = new OptionBuilder("vault-kv-paths", Map.class, String.class)
            .category(OptionCategory.VAULT)
            .description("A set of one or more key/value paths that should be used when looking up secrets.")
            .hidden()
            .build();
}
