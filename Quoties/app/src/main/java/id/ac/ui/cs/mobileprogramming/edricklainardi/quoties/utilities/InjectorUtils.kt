package id.ac.ui.cs.mobileprogramming.edricklainardi.quoties.utilities

import id.ac.ui.cs.mobileprogramming.edricklainardi.quoties.data.FakeDatabase
import id.ac.ui.cs.mobileprogramming.edricklainardi.quoties.data.QuoteRepository
import id.ac.ui.cs.mobileprogramming.edricklainardi.quoties.ui.QuotesViewModelFactory

object InjectorUtils {

    // This will be called from QuotesActivity
    fun provideQuotesViewModelFactory(): QuotesViewModelFactory {
        // ViewModelFactory needs a repository, which in turn needs a DAO from a database
        // The whole dependency tree is constructed right here, in one place
        val quoteRepository = QuoteRepository.getInstance(FakeDatabase.getInstance().quoteDao)
        return QuotesViewModelFactory(quoteRepository)
    }
}