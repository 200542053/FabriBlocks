package com.yanis48.fabriblocks.block;

import com.yanis48.fabriblocks.FabriBlocks;

import net.fabricmc.fabric.api.block.FabricBlockSettings;
import net.minecraft.block.FenceBlock;
import net.minecraft.block.Material;
import net.minecraft.block.MaterialColor;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.BlockItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class FBFence extends FenceBlock {
	
	public FBFence(String name, float hardness, float resistance) {
		super(FabricBlockSettings.of(Material.STONE, MaterialColor.NETHER).strength(hardness, resistance).build());
		Registry.register(Registry.BLOCK, new Identifier(FabriBlocks.MOD_ID, name), this);
		Registry.register(Registry.ITEM, new Identifier(FabriBlocks.MOD_ID, name), new BlockItem(this, new Item.Settings().maxCount(64).group(ItemGroup.DECORATIONS)));
	}

}
