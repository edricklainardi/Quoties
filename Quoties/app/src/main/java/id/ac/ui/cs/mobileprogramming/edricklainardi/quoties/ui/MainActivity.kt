package id.ac.ui.cs.mobileprogramming.edricklainardi.quoties.ui

import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import id.ac.ui.cs.mobileprogramming.edricklainardi.quoties.R
/*import id.ac.ui.cs.mobileprogramming.edricklainardi.quoties.api.QodAdapter
import id.ac.ui.cs.mobileprogramming.edricklainardi.quoties.api.QodResponse
import id.ac.ui.cs.mobileprogramming.edricklainardi.quoties.api.RetrofitClient*/
import kotlinx.android.synthetic.main.fragment_first.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    //private val list = ArrayList<QodResponse>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.toolbar))

        findViewById<FloatingActionButton>(R.id.fab).setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }

        /*rvQod.setHasFixedSize(true)
        rvQod.layoutManager = LinearLayoutManager(this)

        RetrofitClient.instance.getQod().enqueue(object: Callback<ArrayList<QodResponse>> {
            override fun onResponse(
                call: Call<ArrayList<QodResponse>>,
                response: Response<ArrayList<QodResponse>>
            ) {
                response.body()?.let { list.addAll(it)}
                val adapter = QodAdapter(list)
                rvQod.adapter = adapter
            }

            override fun onFailure(call: Call<ArrayList<QodResponse>>, t: Throwable) {

            }

        })*/

    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }
}