package org.mp.tracker.model;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EventRepository extends CrudRepository<Event, Long> {
    @Query("select e from Event e")
    List<Event> getAllEvents();

    @Query("select e from Event e where e.id = ?1")
    Event getEventById(Long id);
}
