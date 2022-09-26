package ni.edu.uca.affirmations

import android.content.Context
import ni.edu.uca.affirmations.adapter.ItemAdapter
import ni.edu.uca.affirmations.model.Affirmation
import org.junit.Assert.assertEquals
import org.junit.Test
import org.mockito.Mockito.mock

class AffirmationsAdapterTests {

    private val context = mock(Context::class.java)

    @Test
    fun adapter_size() {
        val data = listOf(
            Affirmation(R.string.affirmation1, R.drawable.ic_launcher_foreground),
            Affirmation(R.string.affirmation2, R.drawable.ic_launcher_foreground)
        )
        val adapter = ItemAdapter(context, data)
        assertEquals("ItemAdapter is not the correct size", data.size, adapter.itemCount)
    }
}