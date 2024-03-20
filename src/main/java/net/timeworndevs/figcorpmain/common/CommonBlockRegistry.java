package net.timeworndevs.figcorpmain.common;

import com.fizzware.dramaticdoors.fabric.blocks.ShortDoorBlock;
import com.fizzware.dramaticdoors.fabric.blocks.TallCreateSlidingDoorBlock;
import com.fizzware.dramaticdoors.fabric.blocks.TallDoorBlock;
import com.fizzware.dramaticdoors.fabric.blocks.TallSlidingDoorBlock;
import com.simibubi.create.AllBlocks;
import com.simibubi.create.content.decoration.slidingDoor.SlidingDoorBlock;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.resource.metadata.BlockEntry;
import net.minecraft.sound.BlockSoundGroup;
import net.timeworndevs.figcorpmain.init.FigCorpRegistry;
import org.jetbrains.annotations.Nullable;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import static net.timeworndevs.figcorpmain.Main.tryLink;

public class CommonBlockRegistry {

    public static Block SRF_LOGO;
    public static Block SRF_BLASTPLATE;
    @Nullable
    public static Block SHORT_SRF_BLAST_DOOR;
    public static Block SRF_BLAST_DOOR;
    @Nullable
    public static Block TALL_SRF_BLAST_DOOR;
    public static Block SRF_LOGO_QUARTZ;
    @Nullable
    public static Block SHORT_SRF_DOOR;
    public static Block SRF_DOOR;
    @Nullable
    public static Block TALL_SRF_DOOR;

    public static Block OBSOL_BLOCK;
    public static Block OBSOL_NEON;
    public static Block OBSOL_LOGO;

    public static Block EXPLOIT_LOGO;
    public static Block EXPLOIT_PLATING;
    public static Block EXPLOIT_IMMOBILE_PLATING;

    public static Block KMD_PLATING;
    public static Block KMD_HEAVY_PLATING;
    public static Block KMD_LOGO;

    @Nullable
    public static Block CREATE_BB_LOGO;
    @Nullable
    public static Block CREATE_BB_LOGO_CASING;
    @Nullable
    public static Block CREATE_BB_BRASS_DOOR;

    public static Block BLUE_METAL_LOGO;

    //public static Block TEST_SLIDING_DOOR;

    public static void register() {
        Class<ShortDoorBlock> ShortDoorBlock = tryLink("com.fizzware.dramaticdoors.fabric.blocks.ShortDoorBlock");
        Class<TallDoorBlock>  TallDoorBlock  = tryLink("com.fizzware.dramaticdoors.fabric.blocks.TallDoorBlock");
        Class<SlidingDoorBlock> SlidingDoorBlock = tryLink("com.simibubi.create.content.decoration.slidingDoor.SlidingDoorBlock");
        Class<TallCreateSlidingDoorBlock> TallCreateSlidingDoorBlock = tryLink("import com.fizzware.dramaticdoors.fabric.blocks.TallSlidingDoorBlock");

        SRF_LOGO = FigCorpRegistry.register("srf_logo", new GlazedTerracottaBlock(FabricBlockSettings.of().sounds(BlockSoundGroup.NETHERITE).strength(50,1200).requiresTool().mapColor(MapColor.WHITE).pistonBehavior(PistonBehavior.BLOCK)));
        SRF_BLASTPLATE = FigCorpRegistry.register("srf_plate", new Block(FabricBlockSettings.of().sounds(BlockSoundGroup.NETHERITE).strength(50,1200).requiresTool().mapColor(MapColor.WHITE).pistonBehavior(PistonBehavior.BLOCK)));
        SRF_BLAST_DOOR = FigCorpRegistry.register("srf_blast_door", new DoorBlock(FabricBlockSettings.of().sounds(BlockSoundGroup.NETHERITE).strength(50,1200).requiresTool().mapColor(MapColor.WHITE).pistonBehavior(PistonBehavior.BLOCK), BlockSetType.IRON));
        SRF_LOGO_QUARTZ = FigCorpRegistry.register("srf_logo_quartz", new GlazedTerracottaBlock(FabricBlockSettings.of().sounds(BlockSoundGroup.STONE).strength(0.8F,0.8F).requiresTool().mapColor(MapColor.OFF_WHITE)));
        SRF_DOOR = FigCorpRegistry.register("srf_door", new DoorBlock(FabricBlockSettings.of().sounds(BlockSoundGroup.STONE).strength(5,5).requiresTool().mapColor(MapColor.OFF_WHITE).pistonBehavior(PistonBehavior.DESTROY), BlockSetType.CHERRY));

        OBSOL_BLOCK = FigCorpRegistry.register("obsol_block", new Block(FabricBlockSettings.of().sounds(BlockSoundGroup.NETHERITE).strength(50,1200).requiresTool().mapColor(MapColor.GRAY)));
        OBSOL_NEON = FigCorpRegistry.register("obsol_neon", new Block(FabricBlockSettings.of().sounds(BlockSoundGroup.NETHERITE).strength(50,1200).requiresTool().mapColor(MapColor.GRAY).luminance(15)));
        OBSOL_LOGO = FigCorpRegistry.register("obsol_logo", new Block(FabricBlockSettings.of().sounds(BlockSoundGroup.NETHERITE).strength(50,1200).requiresTool().mapColor(MapColor.GRAY)));

        EXPLOIT_LOGO = FigCorpRegistry.register("exploit_logo", new GlazedTerracottaBlock(FabricBlockSettings.of().sounds(BlockSoundGroup.NETHERITE).strength(50, 1200).requiresTool().mapColor(MapColor.MAGENTA)));
        EXPLOIT_PLATING = FigCorpRegistry.register("exploit_plating", new Block(FabricBlockSettings.of().sounds(BlockSoundGroup.NETHERITE).strength(50,1200).requiresTool().mapColor(MapColor.MAGENTA)));
        EXPLOIT_IMMOBILE_PLATING = FigCorpRegistry.register("exploit_immobile_plating", new Block(FabricBlockSettings.of().sounds(BlockSoundGroup.NETHERITE).strength(50,1200).requiresTool().mapColor(MapColor.MAGENTA).pistonBehavior(PistonBehavior.BLOCK)));

        KMD_PLATING = FigCorpRegistry.register("kmd_plating", new Block(FabricBlockSettings.of().sounds(BlockSoundGroup.NETHERITE).strength(50,1200).requiresTool().mapColor(MapColor.TEAL)));
        KMD_HEAVY_PLATING = FigCorpRegistry.register("kmd_heavy_plating", new Block(FabricBlockSettings.of().sounds(BlockSoundGroup.NETHERITE).strength(50,1200).requiresTool().mapColor(MapColor.TEAL).pistonBehavior(PistonBehavior.BLOCK)));
        KMD_LOGO = FigCorpRegistry.register("kmd_logo", new GlazedTerracottaBlock(FabricBlockSettings.of().sounds(BlockSoundGroup.NETHERITE).strength(50,1200).requiresTool().mapColor(MapColor.TEAL)));


        try {
            if (ShortDoorBlock != null) {
                Constructor<ShortDoorBlock> c = ShortDoorBlock.getConstructor(AbstractBlock.Settings.class, BlockSetType.class);
                SHORT_SRF_BLAST_DOOR = FigCorpRegistry.register("short_srf_blast_door", c.newInstance(FabricBlockSettings.of().sounds(BlockSoundGroup.NETHERITE).strength(50, 1200).requiresTool().mapColor(MapColor.WHITE).pistonBehavior(PistonBehavior.BLOCK), BlockSetType.IRON));
                SHORT_SRF_DOOR = FigCorpRegistry.register("short_srf_door", c.newInstance(FabricBlockSettings.of().sounds(BlockSoundGroup.STONE).requiresTool().mapColor(MapColor.OFF_WHITE).pistonBehavior(PistonBehavior.DESTROY), BlockSetType.CHERRY));
            }
            if (TallDoorBlock != null) {
                Constructor<TallDoorBlock> c = TallDoorBlock.getConstructor(AbstractBlock.Settings.class, BlockSetType.class);
                TALL_SRF_BLAST_DOOR = FigCorpRegistry.register("tall_srf_blast_door", c.newInstance(FabricBlockSettings.of().sounds(BlockSoundGroup.NETHERITE).strength(50, 1200).requiresTool().mapColor(MapColor.WHITE).pistonBehavior(PistonBehavior.BLOCK), BlockSetType.IRON));
                TALL_SRF_DOOR = FigCorpRegistry.register("tall_srf_door", c.newInstance(FabricBlockSettings.of().sounds(BlockSoundGroup.STONE).strength(5, 5).mapColor(MapColor.OFF_WHITE).pistonBehavior(PistonBehavior.DESTROY), BlockSetType.CHERRY));
            }
            if (SlidingDoorBlock != null) {
                Constructor<SlidingDoorBlock> c = SlidingDoorBlock.getConstructor(AbstractBlock.Settings.class, BlockSetType.class, Boolean.class);
                //todo add the sliding doors

                //Brass Brigade blocks that are enabled only when Create exists
                CREATE_BB_LOGO = FigCorpRegistry.register("create_bb_logo", new GlazedTerracottaBlock(FabricBlockSettings.of().sounds(BlockSoundGroup.METAL).strength(5.0F, 6.0F).requiresTool().mapColor(MapColor.TERRACOTTA_YELLOW)));
                CREATE_BB_LOGO_CASING = FigCorpRegistry.register("create_bb_logo_casing", new GlazedTerracottaBlock(FabricBlockSettings.of().sounds(BlockSoundGroup.WOOD).strength(2,2).mapColor(MapColor.TERRACOTTA_BROWN)));

                CREATE_BB_BRASS_DOOR = FigCorpRegistry.register("bb_brass_door", c.newInstance(FabricBlockSettings.of(), BlockSetType.IRON, false));
            }
            if (TallCreateSlidingDoorBlock != null) {
                //todo add tall sliding doors
            }
        } catch (InvocationTargetException | NoSuchMethodException | InstantiationException | IllegalAccessException e) {
            throw new RuntimeException("Failed to initialize optionally-dependent blocks", e);
        }

        BLUE_METAL_LOGO = FigCorpRegistry.register("blue_metal_logo",new GlazedTerracottaBlock(FabricBlockSettings.of().sounds(BlockSoundGroup.NETHERITE).strength(50,1200).requiresTool().mapColor(MapColor.TERRACOTTA_CYAN)));
    }
}
