package com.xutongxin.randoms;

import com.github.dawnflyc.processtree.Tree;
import net.minecraftforge.fml.common.Mod;

@Mod("randoms")
public class Randoms {

    public static final String MODID = "randoms";
    public static final String NAME = "Randoms";

    public Randoms() {
        Tree tree = new Tree(this.getClass().getPackage().getName());
        tree.run();

    }
}
