package org.ldv.keskia

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.status
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.view

@SpringBootTest
@AutoConfigureMockMvc
class KesklAControllerTest {

    @Autowired
    private lateinit var mockMvc: MockMvc

    @Test
    fun testHomePage() {
        mockMvc.perform(get("/"))
            .andExpect(status().isOk())
            .andExpect(view().name("base"))
    }

    @Test
    fun testLoginPage() {
        mockMvc.perform(get("/login"))
            .andExpect(status().isOk())
            .andExpect(view().name("base"))
    }
}