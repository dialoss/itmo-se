import character.Incognito;
import character.Kozlik;
import character.Neznaika;
import enums.Emotions;
import enums.ItemTypes;
import exceptions.CharacterHasNoClothesException;
import exceptions.CharacterItemNotFound;
import output.StoryParagraph;

import static output.StoryOutput.output;

public class Main {
    public static void main(String[] args) {

        StoryParagraph introduction = new StoryParagraph() {
            @Override
            public void create() {
                this.text = "Однажды Незнайка и Козлик сидели и разговаривали, как обычно";
            }
        };
        StoryParagraph climax = new StoryParagraph() {
            @Override
            public void create() {
                this.text = "Нет, Незнайка не мог смеяться, встретившись с взглядом этих печальных глаз," +
                        " да и никто бы не смог смеяться.";
            }
        };
        StoryParagraph ending = new StoryParagraph() {
            @Override
            public void create() {
                this.text = "Таких историй Козлик рассказывал множество. " +
                        "Жизнь его была богата разными приключениями. " +
                        "Незнайка с интересом слушал его, и ему не приходилось скучать.";
            }
        };

        introduction.create();
        climax.create();
        ending.create();

        Neznaika neznaika = new Neznaika("Незнайка");
        Kozlik kozlik = new Kozlik("Козлик");
        Incognito incognito = new Incognito("Незнакомый коротышка");

        output(introduction);
        output(neznaika.talk("Привет"));
        output(kozlik.talk("Как дела"));

        output(incognito.walk());
        output(neznaika.lookAt(incognito, "наряд"));

        try {
            output(incognito.describeDress());
        } catch (CharacterHasNoClothesException e) {
            System.out.println(e);
        }
        neznaika.emote(Emotions.SMILE);
        output(neznaika);

        output(neznaika.lookAt(incognito, "лицо"));
        output(incognito.describeEmotions());

        neznaika.emote(Emotions.SAD);
        output(neznaika);
        try {
            output(neznaika.describeDress());
        } catch (CharacterHasNoClothesException e) {
            System.out.println(e);
        }

        output(climax);

        output(incognito.greeting(neznaika));
        output(incognito.greeting(kozlik));
        try {
            output(incognito.itemAction("поставил в угол", ItemTypes.STICK));
            output(incognito.itemAction("достал из кармана", ItemTypes.PAPER));
        } catch (CharacterItemNotFound e) {
            System.out.println(e);
        }
        output(incognito.ask("Это у вас?"));
        output(neznaika.lookAt(incognito, "газету"));
        output(neznaika.talk("У нас"));

        output(ending);
    }
}
