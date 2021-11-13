import io.quarkus.hibernate.orm.panache.kotlin.PanacheEntity
import io.quarkus.hibernate.orm.panache.kotlin.PanacheRepository
import io.quarkus.hibernate.orm.panache.kotlin.PanacheRepositoryBase
import java.util.UUID
import javax.enterprise.context.ApplicationScoped
import javax.persistence.Entity
import javax.persistence.Id

@Entity
class TestEntity(
        var foo: String,
        @Id
        var id: UUID = UUID.randomUUID(),
//        var uncommentToTriggerBug: String = "default",
) {

    fun doSomething(): String {
        return "test"
    }
}

@ApplicationScoped
class TestEntityRepository : PanacheRepositoryBase<TestEntity, UUID> {

}