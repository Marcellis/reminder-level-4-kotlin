package nl.hva.reminder.repository

import android.content.Context
import nl.hva.reminder.ReminderRoomDatabase
import nl.hva.reminder.dao.ReminderDao
import nl.hva.reminder.model.Reminder

public class ReminderRepository(context: Context) {

    private var reminderDao: ReminderDao

    init {
        val reminderRoomDatabase =
            ReminderRoomDatabase.getDatabase(context)
        reminderDao = reminderRoomDatabase!!.reminderDao()
    }


    suspend fun getAllReminders(): List<Reminder> {
        return reminderDao.getAllReminders()
    }

    suspend fun insertReminder(reminder: Reminder) {
        reminderDao.insertReminder(reminder)
    }

    suspend fun deleteReminder(reminder: Reminder) {
        reminderDao.deleteReminder(reminder)
    }

    suspend fun updateReminder(reminder: Reminder) {
        reminderDao.updateReminder(reminder)
    }

}
