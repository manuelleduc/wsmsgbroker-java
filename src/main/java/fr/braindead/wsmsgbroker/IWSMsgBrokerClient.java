package fr.braindead.wsmsgbroker;

import fr.braindead.wsmsgbroker.callback.*;

/**
 * Created by leiko on 30/10/14.
 */
public interface IWSMsgBrokerClient {

    String getId();

    void close();

    void setAutoReconnectTiming(int ms);

    void send(Object data, String dest);

    void send(Object data, String[] dest);

    void send(Object data, String dest, AnswerCallback callback);

    void send(Object data, String[] dest, AnswerCallback callback);

    AnswerCallback getAnswerCallback(String ack);

    void unregister();
}
