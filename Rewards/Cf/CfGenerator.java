package Rewards.Cf;

import Abstractions.IGameItem;
import Abstractions.ItemGenerator;

public class CfGenerator extends ItemGenerator {
    @Override
    public IGameItem createItem() {
        return new CfRevards();
    }
}
