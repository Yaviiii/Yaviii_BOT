
//fortnite
package commands;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;

import java.awt.*;

public class fortnite implements Commands {

    EmbedBuilder error = new EmbedBuilder().setColor(Color.RED);

    @Override
    public boolean called(String[] args, MessageReceivedEvent event) {



        return false;
    }

    @Override
    public void action(String[] args, MessageReceivedEvent event) {

        if (args.length < 1) {
            event.getTextChannel().sendMessage(
                    error.setDescription("***FORTNITE IST SCHEI?E!***").build()
            ).queue();
        }
    }

    @Override
    public void executed(boolean sucess, MessageReceivedEvent event) {
        System.out.println("[INFO] '/fortnite' wurde ausgeführt");
    }

    @Override
    public String help() {
        return null;
    }
}
