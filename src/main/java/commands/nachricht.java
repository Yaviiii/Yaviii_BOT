
//nachricht
package commands;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;

import java.awt.*;

public class nachricht implements Commands {

    EmbedBuilder error = new EmbedBuilder().setColor(Color.RED);

    @Override
    public boolean called(String[] args, MessageReceivedEvent event) {



        return false;
    }

    @Override
    public void action(String[] args, MessageReceivedEvent event) {

        if (args.length < 1) {
            event.getTextChannel().sendMessage(
                    error.setDescription("⭕️ **DIE OFFIZIELEN DISCORD REGELN VON SUCHTGAMES.NET** ⭕️" +
                            "\n⭕️ **Dieses Regelwerk ist zu beachten und wird bei so einem Falle mit einem Ban bestraft** ⭕️" +
                            "\n " +
                            "\n ⭕️ **Absatz 1 Regeln im Chat** ⭕️" +
                            "\n " +
                            "\n- Spammen auf dem Server ist nicht erlaubt und wird mit einem Mute bestraft. " +
                            "\n- CAPS auf dem Server ist nicht gestattet und wird mit einem Mute bestraft. " +
                            "\n- Beleidigungen sind auf dem nicht gestattet und wird mit einem Mute bestraft. " +
                            "\n- Keine Links posten - Streitigkeiten sollten PRIVAT geklärt werden, und nicht auf dem Server. " +
                            "\n- Keine pornografischen oder ähnliche Inhalte posten " +
                            "\n- Drohung wird von keinem erwartet und auch dies wird mit einem Ban bestraft. " +
                            "\n- Keine YouTube Werbung! Auch nicht durch Erlaubnis von Admins oder Moderatoren! AUßER man ist YouTuber!! " +
                            "\n- Eigene discord Werbung ist verboten " +
                            "\n " +
                            "\n ⭕️ **Absatz 2 Verhalten im Sprachbereich** ⭕️ " +
                            "\n " +
                            "\n- Laute Geräusche vermeiden (Schreien, rauschen, etc.) " +
                            "\n- Kein Stimmenverzerrer " +
                            "\n- Keine Beleidigungen " +
                            "\n- keine Drohung " +
                            "\n " +
                            "\n⭕️ **Absatz 3 ALLGEMEIN** ⭕️ " +
                            "\n " +
                            "\n- Seid Freundlich zueinander! " +
                            "\n- YouTuber Sollten 1 Mal in der Woche mindestens den Server erwähnen, tut man das nicht könnte der Rang entzogen werden " +
                            "\n- Jeder der sich für was besonderes hält nur wegen seines Ranges wird diesem der Rang wieder entzogen " +
                            "\n- Aufforderungen von Team Mitglieder sind zu machen! " +
                            "\n " +
                            "\n**Falls ihr mit einer Aufforderung nicht zu frieden seid! Meldet das bitte der Serverleitung**.️ " +
                            "\n**LG Dein SUCHTGAMES Team @everyone** " +
                            "\n------------------------------------------------------")


                            .build()
            ).queue();
        }
    }

    @Override
    public void executed(boolean sucess, MessageReceivedEvent event) {
        System.out.println("[INFO] '/nachricht' wurde ausgeführt");
    }

    @Override
    public String help() {
        return null;
    }
}
