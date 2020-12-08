package listeners;

import net.dv8tion.jda.api.entities.Guild;
import net.dv8tion.jda.api.entities.TextChannel;
import net.dv8tion.jda.api.events.ReadyEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import javax.annotation.Nonnull;

public class readyListener extends ListenerAdapter {

    public void onReady(@Nonnull ReadyEvent event) {

        String out = "\nDer Bot ist auf diesen Servern: \n";

        for ( Guild g : event.getJDA() .getGuilds() ) {
            out += g.getName() + " (" + g.getId() + ") \n";
        }

        System.out.println(out);

        for (Guild g : event.getJDA().getGuilds() ) {
            g.getTextChannels(). get(0).sendMessage(
                    " "





            ) .queue();
        }

    }

}

//"> **Neues Update!!!** *» Es gibt jetzt 2 Secrets (Psst /cmds) ;D, /bot command!, Es gibt jetzt Partner! mach /partner* " +
        //"\n``` " +
        //"\nSiehe alle Updates unter /updates, /update ! " +
        //"\n``` "
