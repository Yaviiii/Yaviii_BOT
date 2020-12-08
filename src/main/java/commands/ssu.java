
//ssu
package commands;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;

import javax.management.relation.RoleInfo;
import java.awt.*;

public class ssu implements Commands {

    EmbedBuilder error = new EmbedBuilder().setColor(Color.LIGHT_GRAY);

    @Override
    public boolean called(String[] args, MessageReceivedEvent event) {



        return false;
    }

    @Override
    public void action(String[] args, MessageReceivedEvent event) {

        if (args.length < 1) {
            event.getTextChannel().sendMessage(
                    error.setDescription("**@everyone Server start up, Server name »** *Military RP Corona Lock Down*, **Server Owner »** *Youknowitsmeoscar*, **Server code »** *HiDOA*").build()
            ).queue();
        }
    }

    @Override
    public void executed(boolean sucess, MessageReceivedEvent event) {
        System.out.println("[INFO] '/ssu' wurde ausgeführt");
    }

    @Override
    public String help() {
        return null;
    }
}
