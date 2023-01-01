package com.uc.weacare2
import android.app.Application
import android.app.NotificationChannel
import android.app.NotificationManager
import android.os.Build

class Notification: Application() {

    companion object {
        const val CHANNEL = "NOTIFICATION_CHANNEL"
    }

    override fun onCreate() {
        super.onCreate()
        createNotificationChanel()
    }

    private fun createNotificationChanel(){
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){
            val chanel = NotificationChannel(
                CHANNEL,
                "Notification",
                NotificationManager.IMPORTANCE_HIGH
            )
            chanel.description = "Notification Description"
            val manager = getSystemService(NotificationManager::class.java)
            manager?.createNotificationChannel(chanel)
        }
    }
}