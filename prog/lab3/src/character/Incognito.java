package character;

import enums.ClothingCondition;
import enums.ClothingTypes;
import enums.Emotions;
import objects.Clothing;
import objects.Defect;

public class Incognito extends Character {
    public Incognito(String name) {
        super(name);
        Defect[] dressDefects = new Defect[]{
                new Defect(ClothingTypes.OLD, ClothingCondition.WHITE, "на локтях"),
        };
        Clothing dress = new Clothing(ClothingTypes.DRESS, ClothingCondition.OLD, dressDefects);

        Defect[] pantsDefects = new Defect[]{
                new Defect(ClothingTypes.MACHRI, ClothingCondition.DEFAULT, "внизу"),
                new Defect(ClothingTypes.SQUARES, ClothingCondition.BLACK, "на коленках"),
        };
        Clothing pants = new Clothing(ClothingTypes.PANTS, ClothingCondition.DIRT, pantsDefects);

        Defect[] hatDefects = new Defect[]{
                new Defect(ClothingTypes.HOLE, ClothingCondition.DEFAULT, "на самом видном месте"),
                new Defect(ClothingTypes.FIELDS, ClothingCondition.DAMAGED, "по краям"),
        };
        Clothing hat = new Clothing(ClothingTypes.HAT, ClothingCondition.OLD, hatDefects);

        clothes = new Clothing[]{dress, pants, hat};
        moodState = new Emotions[]{
                Emotions.THIN, Emotions.DRIED, Emotions.SMUG, Emotions.STRICT, Emotions.HURT,
        };
    }
}
