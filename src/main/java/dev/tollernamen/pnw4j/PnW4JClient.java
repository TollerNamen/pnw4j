package dev.tollernamen.pnw4j;

public class PnW4JClient {
    public static String graphQLEndpoint = "https://api.politicsandwar.com/graphql?api_key=";

    private final String apiKey;

    public PnW4JClient(String apiKey) {
        this.apiKey = apiKey;
    }
}
