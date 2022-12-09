package com.nest.complaintappbackend.dao;

import com.nest.complaintappbackend.model.Complaint;
import org.springframework.data.repository.CrudRepository;

public interface ComplaintDao extends CrudRepository<Complaint,Integer> {
}
