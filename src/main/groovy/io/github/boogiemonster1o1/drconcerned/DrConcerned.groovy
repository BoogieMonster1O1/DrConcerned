package io.github.boogiemonster1o1.drconcerned

import discord4j.core.DiscordClient
import discord4j.gateway.GatewayClient

class DrConcerned {
    public static String NOGUI
    public static String TOKEN
    public static DiscordClient CLIENT
    public static GatewayClient GATEWAY

    static void main(String[] args) {
        try{
            TOKEN = args[0]
            CLIENT = DiscordClient.create(TOKEN)
            NOGUI = args[1]
            GATEWAY = CLIENT.login().block() as GatewayClient
            if(NOGUI != "nogui") throw new Exception()
            println("Starting with Gui")
        } catch(Exception ignored){
            println("Starting without Gui")
        }
    }
}
