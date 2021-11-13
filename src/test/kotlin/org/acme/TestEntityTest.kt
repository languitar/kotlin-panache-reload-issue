import io.quarkus.test.TestTransaction
import io.quarkus.test.junit.QuarkusTest
import org.junit.jupiter.api.Test
import javax.inject.Inject

@QuarkusTest
internal class TestEntityTest {

    @Inject
    lateinit var repo: TestEntityRepository

    @Test
    fun `it does something`() {
        TestEntity("something").doSomething()
    }

    @Test
    @TestTransaction
    fun `it can be persisted and retrieved`() {
        val entity = TestEntity("something")
        repo.persist(entity)
        repo.findById(entity.id)
    }
}
