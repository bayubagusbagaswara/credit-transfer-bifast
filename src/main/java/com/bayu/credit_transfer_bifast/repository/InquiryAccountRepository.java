package com.bayu.credit_transfer_bifast.repository;

import com.bayu.credit_transfer_bifast.model.InquiryAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InquiryAccountRepository extends JpaRepository<InquiryAccount, Long> {
}
