package com.example.myapplication1.ui.gallery;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.example.myapplication1.databinding.ActivityMaps2Binding;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.example.myapplication1.R;

public class MapsActivity2 extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private ActivityMaps2Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMaps2Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng clinic = new LatLng(13.035191, 77.575915);
        mMap.addMarker(new MarkerOptions()
                .position(clinic)
                .title("Touch to Cure Ayurvedic Clinic"));

        LatLng clinic1 = new LatLng(13.036275630295389, 77.5733401613067);
        mMap.addMarker(new MarkerOptions()
                .position(clinic1)
                .title("Touch to Cure Ayurvedic Clinic"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(clinic1));

        LatLng clinic2 = new LatLng(13.037762949904483, 77.5656882712769);
        mMap.addMarker(new MarkerOptions()
                .position(clinic2)
                .title("Touch to Cure Ayurvedic Clinic"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(clinic2));

        LatLng clinic3= new LatLng(13.030779987241813, 77.58090828662336);
        mMap.addMarker(new MarkerOptions()
                .position(clinic3)
                .title("Touch to Cure Ayurvedic Clinic"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(clinic3));
    }
}