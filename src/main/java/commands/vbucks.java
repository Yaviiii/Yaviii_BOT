
//vbucks
package commands;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;

import java.awt.*;
import java.util.Random;

public class vbucks implements Commands {

    EmbedBuilder error = new EmbedBuilder().setColor(Color.GREEN).setAuthor("Furznite,").setThumbnail("https://cdn02.nintendo-europe.com/media/images/10_share_images/games_15/nintendo_switch_download_software_1/H2x1_NSwitchDS_Fortnite_Chapter2_Season2_image1600w.jpg");
    private int Min;

    @Override
    public boolean called(String[] args, MessageReceivedEvent event) {



        return false;
    }

    @Override
    public void action(String[] args, MessageReceivedEvent event) {

        if (args.length < 1) {
            event.getTextChannel().sendMessage(
                    error.setDescription("**hat dir gerade** *66742846378* **V-Bucks geschenkt!**").build()
            ).queue();
        }
    }

    @Override
    public void executed(boolean sucess, MessageReceivedEvent event) {
        System.out.println("[INFO] '/givemevbucks' wurde ausgeführt");
    }

    @Override
    public String help() {
        return null;
    }
}
