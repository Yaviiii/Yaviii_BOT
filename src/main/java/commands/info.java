
//info
package commands;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;

import java.awt.*;

public class info implements Commands {

    EmbedBuilder error = new EmbedBuilder().setColor(Color.YELLOW);

    @Override
    public boolean called(String[] args, MessageReceivedEvent event) {



        return false;
    }

    @Override
    public void action(String[] args, MessageReceivedEvent event) {

        if (args.length < 1) {
            event.getTextChannel().sendMessage(
                    error.setDescription("---------» **INFO** «---------" +
                            "\n " +
                            "\n**Ich bin derzeit in der »** *1.1.1 Version Alpha!* " +
                            "\n**Mein Prefix » ** *'/'* " +
                            "\n**Leute die Alpha Version ist draußen!** **Cool!** *Mach /updates da siehst du was alles schon passiert ist!* " +
                            "\n**Wenn du Mitglied werden möchtest dann melde dich bitte bei** \n`Yaviii 1.0#1287` **Danke!** " +
                            "\n " +
                            "\n---------------- " +
                            "\n**Hier kannst du jetzt sehen wir du alle Commands siehst!** " +
                            "\n " +
                            "\n**Commands** " +
                            "\n``` " +
                            "\n/commands - Commands " +
                            "\n/cmds - Commands " +
                            "\n``` " +
                            "\n-----------------------------").build()
            ).queue();
        }
    }

    @Override
    public void executed(boolean sucess, MessageReceivedEvent event) {
        System.out.println("[INFO] '/help/info' wurde ausgeführt");
    }

    @Override
    public String help() {
        return null;
    }
}
