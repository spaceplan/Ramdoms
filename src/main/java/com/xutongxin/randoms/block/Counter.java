package com.xutongxin.randoms.block;

import com.xutongxin.randoms.Randoms;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.state.IntegerProperty;
import net.minecraft.state.StateContainer;

public class Counter extends Block implements IBlockRegistered {

    public static Counter counter;
    private static final IntegerProperty state=IntegerProperty.create("count",0,1);
    public Counter() {
        super(Properties.create(Material.IRON, MaterialColor.WATER).hardnessAndResistance(1));
        counter = this;
        this.setRegistryName(Randoms.MODID, "counter");
        this.setDefaultState(this.stateContainer.getBaseState().with(state,0));
    }


    @Override
    public Block getBlock() {
        return this;
    }

    @Override
    public boolean hasTileEntity(BlockState state) {
        return true;
    }

    @Override
    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(state);
        super.fillStateContainer(builder);
    }
}
