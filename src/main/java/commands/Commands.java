package commands;

import net.dv8tion.jda.api.events.message.MessageReceivedEvent;

import javax.management.relation.RoleInfo;

public interface Commands {

    boolean called(String[] args, MessageReceivedEvent event);
    void action(String[] args, MessageReceivedEvent event);
    void executed (boolean sucess, MessageReceivedEvent event);
    String help();

}
