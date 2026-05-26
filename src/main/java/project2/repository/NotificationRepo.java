package project2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import project2.entity.Notification;

public interface NotificationRepo extends JpaRepository<Notification, Integer> {
}
