package com.xutongxin.randoms.block;

import com.xutongxin.randoms.Randoms;
import com.xutongxin.randoms.entity.ITileEntityRegistered;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.state.IntegerProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;

public class Counter extends Block implements IBlockRegistered, ITileEntityRegistered {

    public static Counter counter;
    private int count = 0;
    private static final IntegerProperty state = IntegerProperty.create("count", 0, 1);

    public Counter() {
        super(Properties.create(Material.IRON, MaterialColor.WATER).hardnessAndResistance(1));
        counter = this;
        this.setRegistryName(Randoms.MODID, "counter");
        this.setDefaultState(this.stateContainer.getBaseState().with(state, 0));
    }


    @Override
    public Block getBlock() {
        return this;
    }

    @Override
    public TileEntityType getType() {
        return RegistryObject<TileEntityType<ObsidianCounterTileEntity>> obsidianCounterTileEntity = TILE_ENTITIES.register("obsidian_counter_tileentity", () -> TileEntityType.Builder.create(ObsidianCounterTileEntity::new, BlockRegistry.obsidianCounterBlock.get()).build(null));;
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

    @Override
    public ActionResultType onBlockActivated(BlockState state, World worldIn, BlockPos pos, PlayerEntity player, Hand handIn, BlockRayTraceResult hit) {
        if (!worldIn.isRemote && handIn == Hand.MAIN_HAND) {
            //ObsidianCounterTileEntity obsidianCounterTileEntity = (ObsidianCounterTileEntity) worldIn.getTileEntity(pos);
            int counter = increase();
            TranslationTextComponent translationTextComponent = new TranslationTextComponent("message.neutrino.counter", counter);
            player.sendStatusMessage(translationTextComponent, false);
        }
        return ActionResultType.SUCCESS;
    }

    public int increase()
    {
        count++;
        return count;
    }
}
