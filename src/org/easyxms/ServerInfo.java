package org.easyxms;


/**
 *
 * 服务器的各个信息对象
 *
 * */
class ServerInfo {

    private String ip = null;
    private String server_group = null;
    private String username = null;
    private String password = null;
    private int port = 22;


    ServerInfo(String server_group, String username,
               int port, String password) {
        this.server_group = server_group;
        this.username = username;
        this.port = port;
        this.password = password;
    }

    ServerInfo(String ip, String server_group,
               String password, String username, int port) {
        this.ip = ip;
        this.server_group = server_group;
        this.password = password;
        this.username = username;
        this.port = port;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getServer_group() {
        return server_group;
    }

    public void setServer_group(String server_group) {
        this.server_group = server_group;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }
}