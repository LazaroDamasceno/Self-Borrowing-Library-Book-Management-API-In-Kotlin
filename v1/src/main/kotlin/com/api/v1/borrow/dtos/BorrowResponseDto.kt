package com.api.v1.borrow.dtos

import com.api.v1.book.domain.Book
import com.api.v1.book.dtos.BookResponseDto
import com.api.v1.borrower.domain.Borrower
import com.api.v1.borrower.dtos.BorrowerResponseDto

data class BorrowResponseDto(
    val borrowerDto: BorrowerResponseDto,
    val bookDto: BookResponseDto,
    val borrowedDate: String,
    val dueDate: String,
    val extendedDueDate: String,
    val returnedDate: String
)
