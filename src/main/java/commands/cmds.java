
//commands
package commands;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;

import java.awt.*;

public class cmds implements Commands {

    EmbedBuilder error = new EmbedBuilder().setColor(Color.YELLOW).setThumbnail("https://cdn.discordapp.com/attachments/769862980812013571/769919386169376788/y_logo_glitch.jpg");

    @Override
    public boolean called(String[] args, MessageReceivedEvent event) {



        return false;
    }

    @Override
    public void action(String[] args, MessageReceivedEvent event) {

        if (args.length < 1) {
            event.getTextChannel().sendMessage(
                    error.setDescription("---------» **COMMANDS** «---------" +
                            "\n " +
                            "\n***-Info-*** " +
                            "\n:regional_indicator_i: **INFO** :heavy_minus_sign: :screwdriver: **BOT Creator** :heavy_minus_sign: :b: **BETA**" +
                            "\n*/info,/help* :heavy_minus_sign: */yavi,/yaviii* :heavy_minus_sign: */beta*" +
                            "\n " +
                            "\n:new: **Updates** :heavy_minus_sign: :robot: **Bot**" +
                            "\n*/updates* :heavy_minus_sign: */bot*" +
                            "\n " +
                            "\n " +
                            "\n***-Commands-*** " +
                            "\n:broom: **Clear** :heavy_minus_sign: :musical_note: **Music**" +
                            "\n*/clear [2-100]* :heavy_minus_sign: *KOMMT BALD!*" +
                            "\n " +
                            "\n " +
                            "\n***-Fun Stuff-*** " +
                            "\n:ping_pong: **Ping Pong** :heavy_minus_sign: :video_game: **Fortnite** :heavy_minus_sign: :coin: **V-Bucks**" +
                            "\n*/ping* :heavy_minus_sign: :heavy_minus_sign: */fortnite,/furznite* :heavy_minus_sign: */givemevbucks*" +
                            "\n " +
                            "\n-----------------------------").build()
            ).queue();
        }
    }

    @Override
    public void executed(boolean sucess, MessageReceivedEvent event) {
        System.out.println("[INFO] '/commands/cmds' wurde ausgeführt");
    }

    @Override
    public String help() {
        return null;
    }
}
