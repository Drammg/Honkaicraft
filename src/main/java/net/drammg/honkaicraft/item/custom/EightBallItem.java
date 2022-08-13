package net.drammg.honkaicraft.item.custom;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;

import java.util.Set;

public class EightBallItem extends Item {
    public EightBallItem(Settings settings){
       super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        if(!world.isClient() && hand == Hand.MAIN_HAND){

            outputRandomNumber(user);

            user.getItemCooldownManager().set(this, 100);

        }

        return super.use(world, user, hand);
    }

    private void outputRandomNumber(PlayerEntity player) {
        player.sendMessage(Text.literal("The Number on the Ball appears to be " + getRandomNumber() ));
    }

    private int getRandomNumber() {
        return Random.createLocal().nextInt(10);
    }

}
