package id.ac.ui.cs.mobileprogramming.edricklainardi.quoties.ui

import androidx.lifecycle.ViewModel
import id.ac.ui.cs.mobileprogramming.edricklainardi.quoties.data.Quote
import id.ac.ui.cs.mobileprogramming.edricklainardi.quoties.data.QuoteRepository

class QuotesViewModel(private val quoteRepository: QuoteRepository)
    : ViewModel() {

    fun getQuotes() = quoteRepository.getQuotes()

    fun addQuote(quote: Quote) = quoteRepository.addQuote(quote)
}