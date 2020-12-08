
//Test2
package commands;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;

import javax.management.relation.RoleInfo;
import java.awt.*;

public class test2 implements Commands {

    EmbedBuilder error = new EmbedBuilder().setColor(Color.RED);

    @Override
    public boolean called(String[] args, MessageReceivedEvent event) {



        return false;
    }

    @Override
    public void action(String[] args, MessageReceivedEvent event) {

        if (args.length < 1) {
            event.getTextChannel().sendMessage(
                    error.setDescription("TEST").build()
            ).queue();
        }

    }

    @Override
    public void executed(boolean sucess, MessageReceivedEvent event) {
        System.out.println("[INFO] '/test2' wurde ausgeführt");
    }

    @Override
    public String help() {
        return null;
    }
}
