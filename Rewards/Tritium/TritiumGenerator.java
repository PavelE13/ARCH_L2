package Rewards.Tritium;

import Abstractions.IGameItem;
import Abstractions.ItemGenerator;

public class TritiumGenerator extends ItemGenerator {
    @Override
    public IGameItem createItem() {

        return new TritiumRevards();
    }
}
