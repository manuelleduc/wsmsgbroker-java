package fr.braindead.wsmsgbroker.actions.client;

import com.google.gson.JsonObject;
import fr.braindead.wsmsgbroker.client.Client;
import org.java_websocket.client.WebSocketClient;

/**
 * Created by leiko on 30/10/14.
 */
public interface ClientAction {

    void execute(Client client, WebSocketClient ws, JsonObject msg);
}
