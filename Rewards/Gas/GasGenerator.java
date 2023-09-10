package Rewards.Gas;

import Abstractions.IGameItem;
import Abstractions.ItemGenerator;

public class GasGenerator extends ItemGenerator {
    @Override
    public IGameItem createItem() {
        return new GasRevards();
    }
}
