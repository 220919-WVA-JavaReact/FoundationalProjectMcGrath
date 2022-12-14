package com.revature.dao;

import com.revature.models.Request;

import java.util.List;

public interface RequestDAO {
    Request createRequest(String username, String title, int amount, String type, String location);

    List<Request> getAllRequest();

    List<Request> getRequestByType(String username, String Type);

    List<Request> getRequestByApproval(String approval);

    boolean updateRequest(int reimbursement_id, String approval_status);

    List<Request> getAllPending();

    List<Request> getRequestByUsername(String username);

    Request getRequestById(int reimbursement_id);
    List<Request> getAllManager(String approval);

    List<Request> getAllUser(String username, String approval);

}
