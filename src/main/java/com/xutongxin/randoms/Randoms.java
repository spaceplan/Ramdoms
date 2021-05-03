package com.xutongxin.randoms;

import com.github.dawnflyc.processtree.ProcessTree;
import net.minecraftforge.fml.common.Mod;

@Mod("randoms")
public class Randoms {

    public static final String MODID = "randoms";
    public static final String NAME = "Randoms";

    public Randoms() {
        ProcessTree tree = new ProcessTree(this.getClass().getPackage().getName());
        tree.start();
    }
}

