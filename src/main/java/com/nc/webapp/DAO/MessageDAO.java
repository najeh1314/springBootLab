package com.nc.webapp.DAO;

import com.nc.webapp.mdel.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface MessageDAO extends JpaRepository<Message, Integer> {
}
