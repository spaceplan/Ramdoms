package com.xutongxin.randoms;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class TestBlock extends Block {

    public TestBlock() {
        super(Properties.create(Material.ANVIL));
        this.setRegistryName("testblock");
    }

}
