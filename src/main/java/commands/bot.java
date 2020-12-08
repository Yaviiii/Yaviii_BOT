
//bot
package commands;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;

import java.awt.*;

public class bot implements Commands {

    EmbedBuilder error = new EmbedBuilder().setColor(Color.GREEN);

    @Override
    public boolean called(String[] args, MessageReceivedEvent event) {



        return false;
    }

    @Override
    public void action(String[] args, MessageReceivedEvent event) {

        if (args.length < 1) {
            event.getTextChannel().sendMessage(
                    error.setDescription("**------------------** \n**Hallo ich bims der** *<@711325437585916085>* \n**------------------**").build()
            ).queue();
        }
    }

    @Override
    public void executed(boolean sucess, MessageReceivedEvent event) {
        System.out.println("[INFO] '/bot' wurde ausgeführt");
    }

    @Override
    public String help() {
        return null;
    }
}
