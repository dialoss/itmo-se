package interfaces;

import enums.Emotions;

public interface IEmotional {
    void emote(Emotions emotion);
    String describeEmotions();
}