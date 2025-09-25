package com.example.mapas;

import android.os.Bundle;
import org.osmdroid.config.Configuration;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import org.osmdroid.util.GeoPoint;
import org.osmdroid.views.MapView;
import org.osmdroid.views.overlay.Marker;

public class MainActivity extends AppCompatActivity {

    private MapView map;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        Configuration.getInstance().setUserAgentValue(getPackageCodePath());
        setContentView(R.layout.activity_main);
        map = findViewById(R.id.map);
        map.setMultiTouchControls(true);

        //CDMX
        GeoPoint startPoint = new GeoPoint(19.4326, -99.1332);
        map.getController().setCenter(startPoint);
        map.getController().setZoom(17);

        //Marcador
      Marker marker = new Marker(map);
      marker.setPosition(startPoint);
      marker.setAnchor(Marker.ANCHOR_CENTER, Marker.ANCHOR_BOTTOM);
      marker.setTitle("CDMX");
      map.getOverlays().add(marker);

    }
}
