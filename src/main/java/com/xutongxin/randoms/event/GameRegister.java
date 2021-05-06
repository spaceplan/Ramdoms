package com.xutongxin.randoms.event;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class GameRegister {

    private static final Logger LOGGER = LogManager.getLogger();

    public static final Map<String,Item> REG_ITEMS=new HashMap<>();

    public static final Map<String,Block> REG_BLOCKS=new HashMap<>();

    /**
     * 注册单个物品
     * @param item
     */
    public static void RegistryItem(Item item){
        REG_ITEMS.put(item.getRegistryName().getPath(),item);
    }

    /**
     * 注册多个物品
     * @param items
     */
    public static void RegistryItems(Item ... items){
        for (Item item : items) {
            REG_ITEMS.put(item.getRegistryName().getPath(),item);
        }
    }

    /**
     * 注册多个物品
     * @param collection
     */
    public static void RegistryItems(Collection<Item> collection){
        collection.forEach(item -> REG_ITEMS.put(item.getRegistryName().getPath(),item));
    }

    /**
     * 注册单个方块
     * @param block
     */
    public static void RegistryBlock(Block block){
        REG_BLOCKS.put(block.getRegistryName().getPath(),block);
    }

    /**
     * 注册多个方块
     * @param blocks
     */
    public static void RegistryBlocks(Block ... blocks){
        for (Block block : blocks) {
            REG_BLOCKS.put(block.getRegistryName().getPath(),block);
        }
    }

    /**
     * 注册多个方块
     * @param collection
     */
    public static void RegistryBlocks(Collection<Block> collection){
        collection.forEach(item -> REG_BLOCKS.put(item.getRegistryName().getPath(),item));
    }

    @SubscribeEvent
    public static void onItemsRegistry(final RegistryEvent.Register<Item> itemRegistryEvent) {
        for (Item value : REG_ITEMS.values()) {
            itemRegistryEvent.getRegistry().register(value);
            LOGGER.info("registeredItems:" + value.getRegistryName().getPath() + "success！");
        }
        for (Block value : REG_BLOCKS.values()) {
            itemRegistryEvent.getRegistry().register(new BlockItem(value,new Item.Properties()).setRegistryName(value.getRegistryName()));
            LOGGER.info("registeredItems:" + value.getRegistryName().getPath() + "success！");
        }
    }

    @SubscribeEvent
    public static void onBlocksRegistry(final RegistryEvent.Register<Block> itemRegistryEvent) {
        for (Block value : REG_BLOCKS.values()) {
            itemRegistryEvent.getRegistry().register(value);
            LOGGER.info("registeredItems:" + value.getRegistryName().getPath() + "success！");
        }
    }

}
