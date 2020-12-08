
//partner
package commands;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;

import java.awt.*;

public class partner implements Commands {

    EmbedBuilder error = new EmbedBuilder().setColor(Color.YELLOW);

    @Override
    public boolean called(String[] args, MessageReceivedEvent event) {



        return false;
    }

    @Override
    public void action(String[] args, MessageReceivedEvent event) {

        if (args.length < 1) {
            event.getTextChannel().sendMessage(
                    error.setDescription("---------» **Partner** «---------" +
                            "\n " +
                            "\n**Partner** " +
                            "\n``` " +
                            "\nDark Clan (726038374544310369) " +
                            "\nMC Gang (728705196816990278) " +
                            "\nYaviii's Community (674722878981406770) " +
                            "\n``` " +
                            "\n " +
                            "\n**Verifizierte Partner** " +
                            "\n``` " +
                            "\nYaviii's Community (674722878981406770) ✔︎ " +
                            "\n``` " +
                            "\n " +
                            "\n**Info »** *Man kann Partner bei mir beantragen und Verifiziert sein kann man erst ab 30 Mitglieder* ***(Keine BOTS!)*** " +
                            "\n " +
                            "\n-----------------------------").build()
            ).queue();
        }
    }

    @Override
    public void executed(boolean sucess, MessageReceivedEvent event) {
        System.out.println("[INFO] '/partner' wurde ausgeführt");
    }

    @Override
    public String help() {
        return null;
    }
}

// ✔︎ ✔︎ ✔︎ ✔ ︎✅ ✔️ ☑️ ✓