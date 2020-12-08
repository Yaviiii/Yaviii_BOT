
//beta
package commands;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;

import java.awt.*;

public class beta implements Commands {

    EmbedBuilder error = new EmbedBuilder().setColor(Color.YELLOW);

    @Override
    public boolean called(String[] args, MessageReceivedEvent event) {



        return false;
    }

    @Override
    public void action(String[] args, MessageReceivedEvent event) {

        if (args.length < 1) {
            event.getTextChannel().sendMessage(
                    error.setDescription("---------» **Beta Tester** «---------" +
                            "\n " +
                            "\n**Servers** " +
                            "\n``` " +
                            "\nEЯЯОЯ Clan (717833475117416539) " +
                            "\nDark Studios (722566073488113684) " +
                            "\nServer von Yaviii (706795329449754635) " +
                            "\nTEST SERVER BOT (727567342003027998) " +
                            "\nTiSh.net (585153140068974603) " +
                            "\nDark Clan (726038374544310369) " +
                            "\nMC Gang (728705196816990278) " +
                            "\nYaviii's Community (674722878981406770) " +
                            "\n``` " +
                            "\n" +
                            "\n**Users** " +
                            "\n``` " +
                            "\nCrafter#0697" +
                            "\nYaviii 1.0#1287" +
                            "\nfischgang.fizzle#9290" +
                            "\nDarky#2484" +
                            "\nHyper_Apuexo#9593" +
                            "\n``` " +
                            "\n**Verifizierte Mitglieder** " +
                            "\n``` " +
                            "\nCrafter#0697 ✔︎ | Admin " +
                            "\nYaviii 1.0#1287 ✔︎ | Admin" +
                            "\nfischgang.fizzle#9290 ✔︎ " +
                            "\nDarky#2484 ✔︎ " +
                            "\nHyper_Apuexo#9593 ✔︎ " +
                            "\n``` " +
                            "\n-----------------------------").build()
            ).queue();
        }
    }

    @Override
    public void executed(boolean sucess, MessageReceivedEvent event) {
        System.out.println("[INFO] '/beta' wurde ausgeführt");
    }

    @Override
    public String help() {
        return null;
    }
}

// ✔︎ ✔︎ ✔︎ ✔ ︎✅ ✔️ ☑️ ✓