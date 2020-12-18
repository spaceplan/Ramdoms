package com.xutongxin.randoms.item;

import com.xutongxin.randoms.xtxgroup;
import net.minecraft.item.Food;
import net.minecraft.item.Item;

public class Test1Item extends Item {

    public Test1Item(String registryName, float sweet) {
        super(new Properties().food(new Food.Builder().saturation(sweet).hunger((int) sweet).build()).group(xtxgroup.Modgroup.itemGroup));
        this.setRegistryName(registryName);
        
    }
}
