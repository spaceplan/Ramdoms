package com.xutongxin.randoms.auto;

import com.github.dawnflyc.processtree.ITreeHandler;
import com.github.dawnflyc.processtree.Result;
import com.github.dawnflyc.processtree.TreeScan;
import com.xutongxin.randoms.event.GameRegister;
import net.minecraft.item.Item;

@TreeScan(packageName = "com.xutongxin.test.item.auto",method = Item.class)
public class ItemRegister implements ITreeHandler<Item> {
    @Override
    public void handle(Result<Item> result) {
        GameRegister.RegistryItems(result.build());
    }
}
