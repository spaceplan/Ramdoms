package com.xutongxin.randoms.item;

import com.github.dawnflyc.processtree.IScanResultHandler;

import com.github.dawnflyc.processtree.Result;
import com.github.dawnflyc.processtree.ScanNode;
import com.xutongxin.randoms.block.IBlockRegistered;
import com.xutongxin.randoms.xtxgroup;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.HashSet;
import java.util.Set;


@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
@ScanNode(target  = ItemRegistered.class)
public class ItemRegistry implements IScanResultHandler<ItemRegistered> {

    private static final Set<Item> REG_BLOCKS = new HashSet<Item>();

    @SubscribeEvent
    public static void registerItem(RegistryEvent.Register<Item> event) {
        REG_BLOCKS.forEach(item -> event.getRegistry().register(new Item(new Item.Properties().group(xtxgroup.Modgroup.itemGroup)).setRegistryName(item.getRegistryName())));
    }
    @Override
    public void handle(Result<ItemRegistered> result) {
        result.build().forEach(itemRegistered -> REG_BLOCKS.add(itemRegistered.getItem()));
    }

}