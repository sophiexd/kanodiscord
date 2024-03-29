package com.vauff.maunzdiscord.commands;

import com.vauff.maunzdiscord.core.AbstractCommand;
import com.vauff.maunzdiscord.core.Util;
import discord4j.core.event.domain.message.MessageCreateEvent;
import discord4j.core.object.entity.MessageChannel;
import discord4j.core.object.entity.User;

public class Discord extends AbstractCommand<MessageCreateEvent>
{
	@Override
	public void exe(MessageCreateEvent event, MessageChannel channel, User author) throws Exception
	{
		Util.msg(channel, author, "Bot invite link: ~~<https://discordapp.com/oauth2/authorize?&client_id=230780946142593025&scope=bot>~~ (currently disabled)" + System.lineSeparator() + "Maunz Hub server invite link: https://discord.gg/v55fW9b");
	}

	@Override
	public String[] getAliases()
	{
		return new String[] {
				"*discord",
				"*invite"
		};
	}
}