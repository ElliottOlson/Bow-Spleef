/*
 * Copyright Elliott Olson (c) 2016. All Rights Reserved.
 * Any code contained within this document, and any associated APIs with similar brandings
 * are the sole property of Elliott Olson. Distribution, reproduction, taking snippits, or
 * claiming any contents as your own will break the terms of the license, and void any
 * agreements with you, the third party.
 */

package me.elliottolson.bowspleef.manager;

import java.util.UUID;

public class StatManager {

    public static int getPoints(UUID uuid){
        ConfigurationManager.loadStatConfig();
        return ConfigurationManager.getStatisticsConfig().getInt(uuid.toString() + ".points");
    }

    public static void setPoints(UUID uuid, int points){
        ConfigurationManager.getStatisticsConfig().set(uuid.toString() + ".points", points);
        ConfigurationManager.saveStatConfig();
    }

    public static int getWins(UUID uuid){
        ConfigurationManager.loadStatConfig();
        return ConfigurationManager.getStatisticsConfig().getInt(uuid.toString() + ".wins");
    }

    public static void setWins(UUID uuid, int wins){
        ConfigurationManager.getStatisticsConfig().set(uuid.toString() + ".wins", wins);
        ConfigurationManager.saveStatConfig();
    }

    public static int getLosses(UUID uuid){
        ConfigurationManager.loadStatConfig();
        return ConfigurationManager.getStatisticsConfig().getInt(uuid.toString() + ".losses");
    }

    public static void setLosses(UUID uuid, int losses){
        ConfigurationManager.getStatisticsConfig().set(uuid.toString() + ".losses", losses);
        ConfigurationManager.saveStatConfig();
    }

    public static int getGames(UUID uuid){
        ConfigurationManager.loadStatConfig();
        return ConfigurationManager.getStatisticsConfig().getInt(uuid.toString() + ".games");
    }

    public static void setGames(UUID uuid, int games){

        ConfigurationManager.getStatisticsConfig().set(uuid.toString() + ".games", games);
        ConfigurationManager.saveStatConfig();
    }

}
