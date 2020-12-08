
//updates
package commands;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;

import java.awt.*;

public class updates implements Commands {

    EmbedBuilder error = new EmbedBuilder(). setColor(Color.YELLOW);

    @Override
    public boolean called(String[] args, MessageReceivedEvent event) {



        return false;
    }

    @Override
    public void action(String[] args, MessageReceivedEvent event) {

        if (args.length < 1) {
            event.getTextChannel().sendMessage(
                    error.setDescription("---------» **Updates** «--------- " +
                            "\n" +
                            "\n**Neusten** " +
                            "\n" +
                            "\n``` " +
                            "\nNew Update!! » /clear - gibe eine Zahl zwischen 2 und 100 ein! (/clear 5) (Alpha 1.1.1) " +
                            "\nNew Update!! » Es gibt jetzt Partner! mach /partner (Alpha 1.1.0) " +
                            "\nNew Update!! » Neuer command /bot (Pre Alpha 1.0.9) " +
                            "\n``` " +
                            "\n" +
                            "\n**Alle** " +
                            "\n``` " +
                            "\nNew Update!! » /clear - gibe eine Zahl zwischen 2 und 100 ein! (/clear 5) (Alpha 1.1.1) " +
                            "\nNew Update!! » Es gibt jetzt Partner! mach /partner (Alpha 1.1.0) " +
                            "\nNew Update!! » Neuer command /bot (Pre Alpha 1.0.9) " +
                            "\nNew Update!! » Es gibt jetzt 2 Secrets (Psst /cmds) ;D (Pre Alpha 1.0.8) " +
                            "\nNew Update!! » Alle Nachrichten sehen anders aus BIG UPDATE! (Pre Alpha 1.0.7) " +
                            "\nNew Update!! » Mitglieder bei /beta! (Pre Alpha 1.0.6) " +
                            "\nNew Update!! » Update bei /infos, /help (Pre Alpha 1.0.5) " +
                            "\nNew Update!! » User bei Beta (Pre Alpha 1.0.4) " +
                            "\nNew Update!! » /update (Pre Alpha 1.0.3) " +
                            "\nNew Update!! » /beta (Pre Alpha 1.0.2) " +
                            "\nNew Update!! » /commands, /cmds (Pre Alpha 1.0.1) " +
                            "\nNew Update!! » Pre Alpha RELEASE! (Pre Alpha 1.0.0) " +
                            "\n``` " +
                            "\n-----------------------------").build()
            ).queue();
        }
    }

    @Override
    public void executed(boolean sucess, MessageReceivedEvent event) {
        System.out.println("[INFO] '/updates/update' wurde ausgeführt");
    }

    @Override
    public String help() {
        return null;
    }
}
