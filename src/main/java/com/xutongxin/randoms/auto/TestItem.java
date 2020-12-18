package com.xutongxin.randoms.auto;

import com.xutongxin.randoms.xtxgroup;
import net.minecraft.item.Item;

public class TestItem extends Item {

    public TestItem() {
        super(new Properties().group(xtxgroup.Modgroup.itemGroup));
        this.setRegistryName("helloworld");
    }
}
