package commands;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.MessageHistory;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;

import java.awt.*;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class clear implements Commands{

    EmbedBuilder error = new EmbedBuilder().setColor(Color.RED);

    private  int getInt(String string) {
        try {
            return Integer.parseInt(string);
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    @Override
    public boolean called(String[] args, MessageReceivedEvent event) {
        return false;
    }

    @Override
    public void action(String[] args, MessageReceivedEvent event) {

        int numb  = getInt(args[0]);

        if (args.length < 1) {
            event.getTextChannel().sendMessage(
                    error.setDescription("Bitte gib eine an wie viel Nachrichten du löschen möchtest").build()
            ).queue();
        }

        if (numb > 1 && numb <= 100) {

            try {

                MessageHistory history = new MessageHistory(event.getTextChannel());
                List<Message> msgs;

                event.getMessage().delete().queue();

                msgs = history.retrievePast(numb).complete();
                event.getTextChannel().deleteMessages(msgs).queue();

                Message msg = event.getTextChannel().sendMessage(
                        "**Es wurden** *" + args[0] + "* **Nachrichten erfolgreich gelöscht!** :white_check_mark: "
                 ).complete();

                new Timer().schedule(new TimerTask() {
                    @Override
                    public void run() {
                        msg.delete().queue();
                    }
                }, 3000);

            } catch (Exception e) {
                e.printStackTrace();
            }

        } else {
            event.getTextChannel().sendMessage(
                    error.setDescription("Bitte gebe eine Zahl zwischen 2 und 100 ein!").build()
            ).queue();
        }

    }

    @Override
    public void executed(boolean sucess, MessageReceivedEvent event) {

    }

    @Override
    public String help() {
        return null;
    }
}
