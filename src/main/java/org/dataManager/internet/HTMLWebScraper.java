package org.dataManager.internet;

import org.dataManager.util.DataManagerLogger;
import org.dataManager.util.WebUtility;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.net.http.HttpClient;
import java.net.http.HttpResponse;
import java.util.Map;
import java.util.logging.Level;

public class HTMLWebScraper {
    public Document getResponse(String url, Map<String, Object> headers) {
        try (HttpClient client = WebClient.getINSTANCE()) {
            DataManagerLogger.log(Level.INFO, STR."Calling api \{url}");

            var request = WebUtility.buildGetRequest(url, headers);
            HttpResponse<String> body = client.send(request, HttpResponse.BodyHandlers.ofString());
            return Jsoup.parse(body.body());
        } catch (Exception ex) {
            DataManagerLogger.log(Level.SEVERE, STR."Exception occurred in sendGetRequest(): cause \{ex.getMessage()}");
            return null;
        }
    }
}
