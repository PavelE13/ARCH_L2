package Core;

import Abstractions.ItemGenerator;
import Rewards.Cf.CfGenerator;
import Rewards.Gas.GasGenerator;
import Rewards.Gold.GoldGenerator;
import Rewards.Oil.OilGenerator;
import Rewards.Tritium.TritiumGenerator;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Core {
    public void run() {
        List<ItemGenerator> generatorList = new ArrayList<>();
        generatorList.add(new GoldGenerator());
        generatorList.add(new CfGenerator());
        generatorList.add(new GasGenerator());
        generatorList.add(new OilGenerator());
        generatorList.add(new TritiumGenerator());

        Random random = new Random();

        for (int i = 1; i <= 6; i++) {
            int index = random.nextInt(generatorList.size());
            ItemGenerator myGenerator = generatorList.get(index);
            System.out.println(myGenerator.openReward());
        }
    }
}
