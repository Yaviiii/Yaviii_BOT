package core;

import commands.*;
import listeners.JoinListener;
import listeners.commandListener;
import listeners.readyListener;
import listeners.voiceListener;
import net.dv8tion.jda.api.AccountType;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.entities.RichPresence;
import util.SECRETS;
import util.STATIC;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.security.auth.login.LoginException;

public class Main {

    public static JDABuilder builder;

    public static void main(String[] Args) throws LoginException, InterruptedException {

        builder = new JDABuilder(AccountType.BOT);

        builder.setToken(SECRETS.TOKEN);
        builder.setAutoReconnect(true);

        builder.setStatus(OnlineStatus.ONLINE);

        builder.setActivity(new Activity() {
            @Override
            public boolean isRich() {
                return false;
            }

            @Nullable
            @Override
            public RichPresence asRichPresence() {
                return null;
            }

            @Nonnull
            @Override
            public String getName() {
                return "" + STATIC.VERSION;
            }

            @Nullable
            @Override
            public String getUrl() {
                return null;
            }

            @Nonnull
            @Override
            public ActivityType getType() { return ActivityType.WATCHING;
            }

            @Nullable
            @Override
            public Timestamps getTimestamps() {
                return null;
            }

            @Nullable
            @Override
            public Emoji getEmoji() {
                return null;
            }
        });

        addListeners();
        addCommands();

        builder.build().awaitReady();

    }

    public static void addCommands () {

        //info
        commandHandler.commands.put("info", new info());
        commandHandler.commands.put("help", new info());

        //yavi
        commandHandler.commands.put("yaviii", new yavi());
        commandHandler.commands.put("yavi", new yavi());

        //test
        commandHandler.commands.put("test", new test());

        //ping
        commandHandler.commands.put("ping", new ping());

        //cmds
        commandHandler.commands.put("commands", new cmds());
        commandHandler.commands.put("cmds", new cmds());

        //beta
        commandHandler.commands.put("beta", new beta());

        //updates
        commandHandler.commands.put("updates", new updates());
        commandHandler.commands.put("update", new updates());

        //test2
        commandHandler.commands.put("test2", new test2());

        //fortnite
        commandHandler.commands.put("fortnite", new fortnite());
        commandHandler.commands.put("furznite", new fortnite());

        //vbucks
        commandHandler.commands.put("givemevbucks", new vbucks());

        //nachricht
        commandHandler.commands.put("nachricht", new nachricht());

        //bot
        commandHandler.commands.put("bot", new bot());

        //partner
        commandHandler.commands.put("partner", new partner());

        //music
        commandHandler.commands.put("music", new music());

        //ssu
        commandHandler.commands.put("ssu", new ssu());

        //clear
        commandHandler.commands.put("clear", new clear());
        commandHandler.commands.put("Clear", new clear());

        //kick
        commandHandler.commands.put("kick", new kick());

    }

    public static void addListeners() {

        builder.addEventListeners(new commandListener() );
        builder.addEventListeners(new readyListener() );
        builder.addEventListeners(new voiceListener() );
        builder.addEventListeners(new JoinListener() );
    }

}