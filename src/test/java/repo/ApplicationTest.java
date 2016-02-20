package repo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
public class ApplicationTest {

    @Autowired
    PeopleRepository repo;

    @Test
    public void test() {
        Person c = new Person("Joe", "Bloggs");
        repo.save(c);

        for (Person person : repo.findAll()) {
            System.out.println(person.toString());
        }
        System.out.println("#######################: " + repo.count());
    }

}