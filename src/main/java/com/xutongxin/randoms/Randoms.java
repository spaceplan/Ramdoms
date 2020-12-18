package com.xutongxin.randoms;

import com.github.dawnflyc.processtree.Tree;
import com.xutongxin.randoms.event.GameRegister;
import com.xutongxin.randoms.item.Test1Item;
import net.minecraftforge.fml.common.Mod;

import java.util.Random;

@Mod("randoms")
public class Randoms {

    public static final String MODID = "randoms";
    public static final String NAME = "Randoms";

    public Randoms() {
        Tree tree = new Tree(this.getClass().getPackage().getName());
        tree.run();
        Random random = new Random();
        String[] strs = {"cu", "iron", "cd", "d", "e"};
        for (String str : strs) {
            GameRegister.RegistryItem(new Test1Item(str, random.nextInt(10)));
        }
    }
}
