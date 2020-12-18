package com.xutongxin.randoms.event;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.text.StringTextComponent;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class Join {
    
    
    @SubscribeEvent
    public static void onPlayerJoin(EntityJoinWorldEvent event)
    {
        if (!event.getWorld().isRemote){
            Entity entity=event.getEntity();
            if(entity instanceof PlayerEntity)
            {
                String message="Hello world";
                StringTextComponent text=new StringTextComponent(message);
                entity.sendMessage(text,entity.getUniqueID());
                PlayerEntity playerEntity= (PlayerEntity) entity;
                playerEntity.sendMessage(new StringTextComponent("菜鸟<"+playerEntity.getName().getString()+">上线了~"),playerEntity.getUniqueID());
            }

        }
    }
}
