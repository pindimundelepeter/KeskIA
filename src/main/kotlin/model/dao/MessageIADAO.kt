package model.dao

import model.entity.MessageIA
import org.springframework.data.jpa.repository.JpaRepository

interface MessageIADAO : JpaRepository<MessageIA, Long>