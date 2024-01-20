import character.Animal;
import character.Incognito;
import character.Neznaika;
import enums.Emotions;
import enums.ItemTypes;
import exceptions.CharacterHasNoClothesException;
import exceptions.CharacterItemNotFound;
import output.StoryParagraph;

public class Main {
    private static class StoryOutput<T> {
        public static <T> void print(T text) {
            System.out.println(text);
        }
    }
    public static void main(String[] args) {

        StoryParagraph introduction = new StoryParagraph("introduction") {
            @Override
            public void compose() {
                this.heading = "вступление";
                this.text = "Однажды Незнайка и Козлик сидели и разговаривали, как обычно";
            }
        };
        StoryParagraph climax = new StoryParagraph("climax") {
            @Override
            public void compose() {
                this.heading = "кульминация";
                this.text = "Нет, Незнайка не мог смеяться, встретившись с взглядом этих печальных глаз," +
                        " да и никто бы не смог смеяться.";
            }
        };
        StoryParagraph ending = new StoryParagraph("ending") {
            @Override
            public void compose() {
                this.heading = "конец";
                this.text = "Таких историй Козлик рассказывал множество. " +
                        "Жизнь его была богата разными приключениями. " +
                        "Незнайка с интересом слушал его, и ему не приходилось скучать.";
            }
        };

        introduction.compose();
        climax.compose();
        ending.compose();

        Neznaika neznaika = new Neznaika("Незнайка");
        Animal kozlik = new Animal("Козлик");
        Incognito incognito = new Incognito("Незнакомый коротышка");

        StoryOutput.print(introduction);
        StoryOutput.print(neznaika.talk("Привет"));
        StoryOutput.print(kozlik.talk("Как дела"));

        StoryOutput.print(incognito.walk());
        StoryOutput.print(neznaika.lookAt(incognito, "наряд"));

        try {
            StoryOutput.print(incognito.describeDress());
        } catch (CharacterHasNoClothesException e) {
            System.out.println(e);
        }
        neznaika.emote(Emotions.SMILE);
        StoryOutput.print(neznaika);

        StoryOutput.print(neznaika.lookAt(incognito, "лицо"));
        StoryOutput.print(incognito.describeEmotions());

        neznaika.emote(Emotions.SAD);
        StoryOutput.print(neznaika);
        try {
            StoryOutput.print(neznaika.describeDress());
        } catch (CharacterHasNoClothesException e) {
            System.out.println(e);
        }

        StoryOutput.print(climax);

        StoryOutput.print(incognito.greeting(neznaika));
        StoryOutput.print(incognito.greeting(kozlik));
        try {
            StoryOutput.print(incognito.itemAction("поставил в угол", ItemTypes.STICK));
            StoryOutput.print(incognito.itemAction("достал из кармана", ItemTypes.PAPER));
        } catch (CharacterItemNotFound e) {
            System.out.println(e);
        }
        StoryOutput.print(incognito.ask("Это у вас?"));
        StoryOutput.print(neznaika.lookAt(incognito, "газету"));
        StoryOutput.print(neznaika.talk("У нас"));

        StoryOutput.print(ending);
    }
}
