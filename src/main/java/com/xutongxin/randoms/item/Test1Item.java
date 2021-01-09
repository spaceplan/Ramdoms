package com.xutongxin.randoms.item;

import com.xutongxin.randoms.Randoms;
import com.xutongxin.randoms.block.TestBlock;
import com.xutongxin.randoms.xtxgroup;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.Food;
import net.minecraft.item.Item;

public class Test1Item extends Item {

    public Test1Item(String registryName, float sweet) {
        super(new Properties().food(new Food.Builder().saturation(sweet).hunger((int) sweet).build()).group(xtxgroup.Modgroup.itemGroup));
        this.setRegistryName(registryName);
        
    }
    public static Test1Item TestItem;
    public Test1Item() {
        super(new Properties().food(new Food.Builder().saturation(1).hunger((int) 1).build()).group(xtxgroup.Modgroup.itemGroup));
        TestItem = this;
        this.setRegistryName(Randoms.MODID, "testitem");
    }
}
