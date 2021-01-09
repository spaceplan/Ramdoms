package com.xutongxin.randoms.block;

import com.xutongxin.randoms.Randoms;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;

public class TestBlock extends Block implements IBlockRegistered {

    public static TestBlock testBlock;
    public TestBlock(Properties properties) {
        super(properties);
    }
    public TestBlock() {
        super(Properties.create(Material.IRON, MaterialColor.WATER).hardnessAndResistance(2));
        testBlock = this;
        this.setRegistryName(Randoms.MODID, "steel_furnace");
    }


    @Override
    public Block getBlock() {
        return this;
    }

}
