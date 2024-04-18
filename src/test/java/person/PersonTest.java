package person;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.itsjava.person.Person;

import static org.junit.jupiter.api.Assertions.*;


@DisplayName("Класс Person должен")
public class PersonTest {
    public static final String DEFAULT_NAME = "Жанна";
    public static final int DEFAULT_AGE = 34;


    @DisplayName("Корректно создаваться конструктором")
    @Test
    public void shouldBeCreatedCorrectlyByConstructor() {
        Person person = new Person(DEFAULT_NAME, DEFAULT_AGE);
        assertEquals(DEFAULT_NAME, person.getName());
        assertEquals(DEFAULT_AGE, person.getAge());

    }

    @DisplayName("Корректно прибавлять год на день рождения")
    @Test
    public  void shouldAddCorrectYearForBirthday (){
        Person person = new Person(DEFAULT_NAME, DEFAULT_AGE);
        person.birthday();
        assertEquals(DEFAULT_AGE + 1, person.getAge());

    }
    @DisplayName("Корректно проверять возраст, допустимый к алкоголю")
    @Test
    public void shouldCheckAlcoholAge (){
        Person person = new Person(DEFAULT_NAME, DEFAULT_AGE);
        assertTrue(person.takeBeer());
        person.setAge(16);
        assertFalse(person.takeBeer());
    }


}
