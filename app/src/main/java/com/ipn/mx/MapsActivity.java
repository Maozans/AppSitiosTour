package com.ipn.mx;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    LatLng mexico = new LatLng(19.4326009, -99.1333416);
    LatLng chichen = new LatLng(20.684506, -88.567772);
    LatLng coliseo = new LatLng(41.890212, 12.492232);
    LatLng muralla = new LatLng(40.431910, 116.570375);
    LatLng machu = new LatLng(-13.163140, -72.544964);
    LatLng taj = new LatLng(27.174996, 78.042159);
    LatLng cristo = new LatLng(-22.952054, -43.210387);



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        assert mapFragment != null;
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
        mMap.addMarker(new MarkerOptions().position(mexico).title("Marker in Mexico"));
        mMap.moveCamera( CameraUpdateFactory.newLatLngZoom(mexico, 15.0f) );
    }


    public void onClick(View view) {
        mMap.clear();
        switch (view.getId()) {
            case R.id.buttonSitioUno:
                mMap.addMarker(new MarkerOptions().position(chichen).title("Marcador en Chicen Itza"));
                mMap.moveCamera( CameraUpdateFactory.newLatLngZoom(chichen, 16.0f) );
            break;
            case R.id.buttonSitioDos:
                mMap.addMarker(new MarkerOptions().position(coliseo).title("Marcador en Coliseo Romano"));
                mMap.moveCamera( CameraUpdateFactory.newLatLngZoom(coliseo, 16.0f) );
            break;
            case R.id.buttonSitioTres:
                mMap.addMarker(new MarkerOptions().position(muralla).title("Marcador en Muralla China"));
                mMap.moveCamera( CameraUpdateFactory.newLatLngZoom(muralla, 14.0f) );
            break;
            case R.id.buttonSitioCuatro:
                mMap.addMarker(new MarkerOptions().position(machu).title("Marcador en Machu Picchu"));
                mMap.moveCamera( CameraUpdateFactory.newLatLngZoom(machu, 16.0f) );
            break;
            case R.id.buttonSitioCinco:
                mMap.addMarker(new MarkerOptions().position(taj).title("Marcador en Taj Mahal"));
                mMap.moveCamera( CameraUpdateFactory.newLatLngZoom(taj, 16.0f) );
            break;
            case R.id.buttonSitioSeis:
                mMap.addMarker(new MarkerOptions().position(cristo).title("Marcador en Cristo Redentor"));
                mMap.moveCamera( CameraUpdateFactory.newLatLngZoom(cristo, 16.0f) );
            break;
        }
    }
}
