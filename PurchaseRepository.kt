package com.desperate.gromov_clo_bot.repository

import com.desperate.gromov_clo_bot.model.Purchase
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface PurchaseRepository : JpaRepository<Purchase, Int> {

    //@Query(nativeQuery = true, value = "SELECT *  FROM java_quiz ORDER BY random() LIMIT 1")
    //fun getRandomQuestion(): Question

    @Query(nativeQuery = true, value = "SELECT * FROM purchase WHERE chat_id = :chatId AND is_bag = true")
    fun getBagByChatId(chatId: Int) : Purchase?

}