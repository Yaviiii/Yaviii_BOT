package listeners;

import net.dv8tion.jda.api.events.guild.voice.GuildVoiceJoinEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;


public class voiceListener extends ListenerAdapter  {

    public void onGuildVoiceJoin(GuildVoiceJoinEvent event) {
        event.getGuild().getTextChannelsByName("logs", true) .get(0) .sendMessage(
                ""
        ) .queue();
    }

}
