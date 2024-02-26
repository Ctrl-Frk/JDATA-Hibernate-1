package baranov.viacheslav.jdatahibernate1;

import baranov.viacheslav.jdatahibernate1.entity.Person;
import baranov.viacheslav.jdatahibernate1.entity.PersonId;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

import java.util.HashSet;
import java.util.Set;

@SpringBootTest
class JdataHibernate1ApplicationTests {
    @PersistenceContext
    EntityManager testEntityManager;
    private final Set<Person> testSet = new HashSet<>();

    @Test
    @Transactional
    void contextLoads() {
        Person slava = Person.builder()
                .personId(PersonId.builder().name("Slava").surname("Java").age(28).build())
                .city("SAINT-P")
                .phoneNumber("+75555555555")
                .build();
        testSet.add(slava);
        testEntityManager.persist(slava);
        Assert.isTrue(testSet.contains(slava), "Entity not found in the set");
    }

}