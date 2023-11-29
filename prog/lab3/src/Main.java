import character.Incognito;
import character.Kozlik;
import character.Neznaika;
import enums.Emotions;

import static output.StoryOutput.output;

public class Main {
    public static void main(String[] args) {
        Neznaika neznaika = new Neznaika("Незнайка");
        Kozlik kozlik = new Kozlik("Козлик");
        Incognito incognito = new Incognito("Незнакомый коротышка");

        output("Незнайка и Козлик сидят");
        output(neznaika.talk("Привет"));
        output(kozlik.talk("Как дела"));

        output(incognito.walk());
        output(neznaika.lookAt(incognito, "наряд"));

        output(incognito.describeDress());
        neznaika.emote(Emotions.SMILE);
        output(neznaika);

        output(neznaika.lookAt(incognito, "лицо"));
        output(incognito.describeEmotions());

        neznaika.emote(Emotions.SAD);
        output(neznaika);

        output("Нет, Незнайка не мог смеяться, встретившись с взглядом этих печальных глаз, да и никто бы не смог смеяться.");
    }
}
