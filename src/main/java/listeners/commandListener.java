package listeners;

import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import util.STATIC;
import core.*;

import javax.annotation.Nonnull;

public class commandListener  extends ListenerAdapter {

    public void onMessageReceived(@Nonnull MessageReceivedEvent event) {

        if (event.getMessage().getContentDisplay().startsWith(STATIC.PREFIX) && event.getMessage().getAuthor().getId() != event.getJDA().getSelfUser().getId())
            commandHandler.handleCommand(commandParser.parser(event.getMessage().getContentRaw(), event));

    }
    
}
