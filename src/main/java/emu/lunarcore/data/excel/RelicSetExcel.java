package emu.lunarcore.data.excel;

import emu.lunarcore.data.GameDepot;
import emu.lunarcore.data.GameResource;
import emu.lunarcore.data.ResourceType;
import emu.lunarcore.data.ResourceType.LoadPriority;
import emu.lunarcore.game.enums.AvatarPropertyType;
import lombok.Getter;

@Getter
@ResourceType(name = {"RelicSetConfig.json"}, loadPriority = LoadPriority.NORMAL)
public class RelicSetExcel extends GameResource {
    private int SetID;

    @Override
    public int getId() {
        return SetID;
    }
}
