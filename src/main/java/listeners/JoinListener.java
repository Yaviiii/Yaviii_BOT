package listeners;

import net.dv8tion.jda.api.entities.TextChannel;
import net.dv8tion.jda.api.events.guild.member.GuildMemberJoinEvent;
import net.dv8tion.jda.api.events.guild.member.GuildMemberLeaveEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import javax.annotation.Nonnull;
import java.lang.reflect.Member;

public class JoinListener extends ListenerAdapter {

    @Override
    public void onGuildMemberJoin(@Nonnull GuildMemberJoinEvent event) {
        Member member = (Member) event.getMember();
        TextChannel channel;

        if((channel = (TextChannel) event.getGuild().getDefaultChannel()) != null) {
            channel.sendMessage("**Wilkommen auf dem Server**").queue();
        }
    }

    @Override
    public void onGuildMemberLeave(@Nonnull GuildMemberLeaveEvent event) {
        Member member = (Member) event.getMember();
        TextChannel channel;

        if((channel = event.getGuild().getDefaultChannel()) != null) {
            channel.sendMessage("**Bis Bald!**" +member.getName()).queue();
        }
    }

}
