package com.example.gpsapp
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import org.osmdroid.config.Configuration
import org.osmdroid.util.GeoPoint
import org.osmdroid.views.MapView

class MapActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Configuration.getInstance().userAgentValue = "UzkGpsApp/1.0 (https://github.com/uzakihana-uwu/GPSapp)"
        setContentView(R.layout.activity_map)

        val map = findViewById<MapView>(R.id.map)
        map.setMultiTouchControls(true)
        map.controller.setZoom(15.0)
        map.controller.setCenter(GeoPoint(35.0116, 135.7681)) // 京都付
    }
}