package id.ac.ui.cs.mobileprogramming.edricklainardi.quoties.ui

/*import id.ac.ui.cs.mobileprogramming.edricklainardi.quoties.api.QodAdapter
import id.ac.ui.cs.mobileprogramming.edricklainardi.quoties.api.QodResponse
import id.ac.ui.cs.mobileprogramming.edricklainardi.quoties.api.RetrofitClient*/

import android.app.AlarmManager
import android.app.DatePickerDialog
import android.app.DatePickerDialog.OnDateSetListener
import android.app.Notification
import android.app.PendingIntent
import android.content.Intent
import android.os.Bundle
//import android.support.v4.app.NotificationCompat
//import android.support.v7.app.AppCompatActivity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.core.app.NotificationCompat
import androidx.core.content.ContextCompat.getSystemService
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.fragment.findNavController
import id.ac.ui.cs.mobileprogramming.edricklainardi.quoties.R
import id.ac.ui.cs.mobileprogramming.edricklainardi.quoties.data.Quote
//import id.ac.ui.cs.mobileprogramming.edricklainardi.quoties.notif.NotificationPublisher
import id.ac.ui.cs.mobileprogramming.edricklainardi.quoties.utilities.InjectorUtils
import kotlinx.android.synthetic.main.fragment_first.*
import java.text.SimpleDateFormat
import java.util.*


/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment() {

    val notificationChannelId = "10001"
    private val defaultNotificationChannelId = "default"
    var btnDate: Button? = null
    val myCalendar: Calendar = Calendar.getInstance()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.button_first).setOnClickListener {
            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)
        }

        // Get the QuotesViewModelFactory with all of it's dependencies constructed
        val factory = InjectorUtils.provideQuotesViewModelFactory()
        // Use ViewModelProviders class to create / get already created QuotesViewModel
        // for this view (activity)
        val viewModel = ViewModelProviders.of(this, factory)
            .get(QuotesViewModel::class.java)

        // When button is clicked, instantiate a Quote and add it to DB through the ViewModel
        button_add_quote.setOnClickListener {
            val quote = Quote(editText_quote.text.toString(), editText_author.text.toString())
            viewModel.addQuote(quote)
            editText_quote.setText("")
            editText_author.setText("")
        }

        //btnDate = findViewById(R.id.btnDate)

    }

/*    private fun scheduleNotification(notification: Notification, delay: Long) {
        val notificationIntent = Intent(this, NotificationPublisher::class.java)
        notificationIntent.putExtra(NotificationPublisher.NOTIFICATION_ID, 1)
        notificationIntent.putExtra(NotificationPublisher.NOTIFICATION, notification)
        val pendingIntent = PendingIntent.getBroadcast(
            this,
            0,
            notificationIntent,
            PendingIntent.FLAG_UPDATE_CURRENT
        )
        val alarmManager = (getSystemService<Any>(Context.ALARM_SERVICE) as AlarmManager?)!!
        alarmManager[AlarmManager.ELAPSED_REALTIME_WAKEUP, delay] = pendingIntent
    }

    private fun getNotification(content: String): Notification? {
        val builder = NotificationCompat.Builder(this, default_notification_channel_id)
        builder.setContentTitle("Scheduled Notification")
        builder.setContentText(content)
        builder.setSmallIcon(R.drawable.ic_launcher_foreground)
        builder.setAutoCancel(true)
        builder.setChannelId(notificationChannelId)
        return builder.build()
    }

    var date =
        OnDateSetListener { view, year, monthOfYear, dayOfMonth ->
            myCalendar[Calendar.YEAR] = year
            myCalendar[Calendar.MONTH] = monthOfYear
            myCalendar[Calendar.DAY_OF_MONTH] = dayOfMonth
            updateLabel()
        }

    fun setDate(view: View?) {
        DatePickerDialog(
            this.MainActivity, date,
            myCalendar[Calendar.YEAR],
            myCalendar[Calendar.MONTH],
            myCalendar[Calendar.DAY_OF_MONTH]
        ).show()
    }

    private fun updateLabel() {
        val myFormat = "dd/MM/yy" //In which you need put here
        val sdf = SimpleDateFormat(myFormat, Locale.getDefault())
        val date = myCalendar.time
        btnDate.setText(sdf.format(date))
        scheduleNotification(getNotification(btnDate!!.text.toString()), date.time)
    }*/
}