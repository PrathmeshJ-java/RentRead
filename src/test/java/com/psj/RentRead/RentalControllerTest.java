package com.psj.RentRead;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

public class RentalControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private RentalService rentalService;

    @Test
    void testRentBook() throws Exception {
        Long bookId = 1L;
        Long userId = 1L;

        doNothing().when(rentalService).rentBook(userId, bookId);

        mockMvc.perform(post("/books/1/rent")
                        .header("userId", "1"))
                .andExpect(status().isOk());
    }
}
