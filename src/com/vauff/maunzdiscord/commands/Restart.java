package com.vauff.maunzdiscord.commands;

import com.vauff.maunzdiscord.core.AbstractCommand;
import com.vauff.maunzdiscord.core.Logger;
import com.vauff.maunzdiscord.core.Util;
import discord4j.core.event.domain.message.MessageCreateEvent;
import discord4j.core.object.entity.MessageChannel;
import discord4j.core.object.entity.User;

import java.util.ArrayList;

public class Restart extends AbstractCommand<MessageCreateEvent>
{
	@Override
	public void exe(MessageCreateEvent event, MessageChannel channel, User author) throws Exception
	{
		if (Util.hasPermission(author))
		{
			final ArrayList<String> command = new ArrayList<>();

			command.add("java");
			command.add("-jar");
			command.add("Maunz-Discord.jar");
			Util.msg(channel, author, "Maunz is restarting...");
			Logger.log.info("Maunz is restarting...");
			new ProcessBuilder(command).start();
			System.exit(0);
		}
		else
		{
			Util.msg(channel, author, "You do not have permission to use that command");
		}
	}

	@Override
	public String[] getAliases()
	{
		return new String[] { "*restart" };
	}
}