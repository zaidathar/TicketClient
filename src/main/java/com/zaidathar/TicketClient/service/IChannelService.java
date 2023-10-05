package com.zaidathar.TicketClient.service;

public interface IChannelService {
    void addChannel(String channelId) throws Exception;
    void removeChannel(String channelId) throws Exception;
}
