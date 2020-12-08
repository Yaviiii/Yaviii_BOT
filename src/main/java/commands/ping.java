
//Ping
package commands;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;

import javax.management.relation.RoleInfo;
import java.awt.*;

public class ping implements Commands {

    EmbedBuilder error = new EmbedBuilder().setColor(Color.darkGray);

    @Override
    public boolean called(String[] args, MessageReceivedEvent event) {



        return false;
    }

    @Override
    public void action(String[] args, MessageReceivedEvent event) {

        if (args.length < 1) {
            event.getTextChannel().sendMessage(
                    error.setDescription("**Pong!**").build()
            ).queue();
        }
    }

    @Override
    public void executed(boolean sucess, MessageReceivedEvent event) {
        System.out.println("[INFO] '/ping' wurde ausgeführt");
    }

    @Override
    public String help() {
        return null;
    }
}
