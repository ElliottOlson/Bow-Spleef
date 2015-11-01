package me.elliottolson.bowspleef.commands;

import me.elliottolson.bowspleef.game.GameManager;

/**
 * Copyright Elliott Olson (c) 2015. All Rights Reserved.
 * Any code contained within this document, and any associated APIs with similar brandings
 * are the sole property of Elliott Olson. Distribution, reproduction, taking snippits, or
 * claiming any contents as your own will break the terms of the license, and void any
 * agreements with you, the third party.
 */
public class CreateCommand extends Command {

    public CreateCommand(){
        setName("create");
        setAlias("c");
        setDescription("Create a game.");
        setUsage("<Name>");
        setPermission("bowspleef.admin.game.create");
        setBePlayer(true);
    }

    @Override
    public CommandResult execute() {

        if (getArgs().size() == 2){

            String name = getArgs().get(1);
            GameManager.getInstance().createGame(name, player);

            return CommandResult.SUCCESS;

        }

        return CommandResult.INVALID_USAGE;
    }
}