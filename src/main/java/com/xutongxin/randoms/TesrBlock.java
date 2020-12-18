package com.xutongxin.randoms;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class TesrBlock extends Block {

    public TesrBlock() {
        super(Properties.create(Material.ANVIL));
        this.setRegistryName("testblock");
    }
}
