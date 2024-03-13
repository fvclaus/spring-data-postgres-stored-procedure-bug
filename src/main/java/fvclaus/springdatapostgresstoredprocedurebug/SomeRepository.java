package fvclaus.springdatapostgresstoredprocedurebug;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface SomeRepository extends JpaRepository<MyEntity, String> {

    @Procedure("some_procedure")
    public void someProcedure(@Param("some_id") String id);
    
    
}
