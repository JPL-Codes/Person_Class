import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class PersonTest2 {
    Person p1, p2, p3, p4, p5, p6;

    @BeforeEach
    void setUp() {

        p1 = new Person("Greg", "Nord", "000004", "Sr", 1988);


    }
    @Test
        void setIDSeed() {
       p1.setIDSeed(1);
        assertEquals(1,p1.getIDSeed());
        }

        @Test
        void setFirstName() {
        p1.setFirstName("Bob");
        assertEquals("Bob",p1.getFirstName());
        }

        @Test
        void setLastName() {
        p1.setLastName("Harper");
        assertEquals("Harper",p1.getLastName());
        }

        @Test
        void setID() {
        p1.setID("000002");
        assertEquals("000002",p1.getID());
        }

        @Test
        void setTitle() {
        p1.setTitle("Sr.");
        assertEquals("Sr.",p1.getTitle());
        }

        @Test
        void setYob() {
        p1.setYob(1988);
        assertEquals(1988,p1.getYob());
        }

        @Test
        void testToString() {
        assertEquals("Person{firstName='Greg', lastName='Nord', ID='000004', title='Sr', yob=1988}",p1.toString());
        }

        @Test
        void toCSVRecord() {
        assertEquals("Greg,Nord,000004,Sr,1988",p1.toCSVRecord());
        }
    }
