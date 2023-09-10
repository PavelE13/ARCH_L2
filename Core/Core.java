package Core;

import Abstractions.ItemGenerator;
import Rewards.Gold.GoldGenerator;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.List;

public class Core {
    public void run() {
        List<ItemGenerator> generatorList = new ArrayList<>();
        generatorList.add(new GoldGenerator());
        //generatorList.add(new SilverGenerator());
        ItemGenerator myGenerator = generatorList.get(0);
        System.out.println(myGenerator.openReward());
    }
}
