package com.xutongxin.randoms.block;

import com.github.dawnflyc.processtree.ITreeHandler;
import com.github.dawnflyc.processtree.Result;
import com.github.dawnflyc.processtree.TreeScan;
import com.xutongxin.randoms.event.GameRegister;
import net.minecraft.block.Block;

@TreeScan(packageName = "com.xutongxin.test.block",method = Block.class)
public class BlockRegister implements ITreeHandler<Block> {

    @Override
    public void handle(Result<Block> result) {
        GameRegister.RegistryBlocks(result.build());
    }
}
