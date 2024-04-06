package rocketseat.com.passin.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import rocketseat.com.passin.domain.attendee.Attendee;

import java.util.List;
import java.util.Optional;

public interface AttendeeRepository extends JpaRepository<Attendee, String> {
    public List<Attendee> findByEventId(String eventId);
    Optional<Attendee> findByEventIdAndEmail(String id, String email);

}
