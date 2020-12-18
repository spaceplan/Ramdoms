package com.xutongxin.randoms;

import com.xutongxin.randoms.event.GameRegister;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class xtxgroup extends ItemGroup
{

    public xtxgroup()
    {
        super("xtx_group");
        this.setBackgroundImageName("image.png");
    }
    @Override
    public ItemStack createIcon() {
        return new ItemStack(GameRegister.REG_ITEMS.get("iron"));
    }
    public static class Modgroup
    {
        public static ItemGroup itemGroup=new xtxgroup();

    }

}

