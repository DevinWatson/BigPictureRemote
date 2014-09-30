package opensteam.bigpictureremote.Discovery;

import java.net.InetSocketAddress;
import java.net.SocketAddress;
import opensteam.bigpictureremote.Discovery.proto.SteamMsgRemoteClient.*;

public class ServerListItem {
    public InetSocketAddress address;
    public long clientId;
    public CMsgRemoteClientBroadcastStatus status;
    public String Hostname;

    public ServerListItem(InetSocketAddress address, long clientId, CMsgRemoteClientBroadcastStatus status) {
        this.address = address;
        this.clientId = clientId;
        this.status = status;
        this.Hostname = address.getHostName();
    }
    @Override
    public String toString() {
        return this.address.toString();
    }
}