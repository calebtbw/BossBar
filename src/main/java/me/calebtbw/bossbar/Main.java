package me.calebtbw.bossbar;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.boss.BarColor;
import org.bukkit.boss.BarStyle;
import org.bukkit.boss.BossBar;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    BossBar bossBar;

    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(new JoinListener(this),this);

        bossBar = Bukkit.createBossBar(
                ChatColor.GOLD + "SMP by " + ChatColor.DARK_RED + "Helevator " + ChatColor.GOLD +  "courtesy of " + ChatColor.BLUE + "GGServers!",
                BarColor.BLUE,
                BarStyle.SOLID);

    }
}
