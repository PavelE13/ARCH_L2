package Rewards.Oil;

import Abstractions.IGameItem;
import Abstractions.ItemGenerator;

public class OilGenerator extends ItemGenerator {
    @Override
    public IGameItem createItem() {

        return new OilRevards();
    }
}
