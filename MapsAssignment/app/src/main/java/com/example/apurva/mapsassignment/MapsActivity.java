package com.example.apurva.mapsassignment;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

//import com.google.android.gms.cast.Cast;
//import com.google.android.gms.identity.intents.Address;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
//import com.google.android.gms.vision.barcode.Barcode;

import java.io.IOException;
import java.util.List;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    LocationManager locationmanager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
        Intent in = getIntent();
        locationmanager = (LocationManager) getSystemService(LOCATION_SERVICE);
        if (ActivityCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED &&
                ActivityCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return;
        }
        //check network provider is enabled
        if(locationmanager.isProviderEnabled(LocationManager.NETWORK_PROVIDER))
        {
            locationmanager.requestLocationUpdates(LocationManager.NETWORK_PROVIDER, 0, 0, new LocationListener() {
                @Override
                public void onLocationChanged(Location location) {
                    //get Latitude
                    double latitude=location.getLatitude();
                    //get lognitude
                    double longitude=location.getLongitude();
                    //Instantiate the class, LatLng
                    LatLng latlag=new LatLng(latitude, longitude);
                    Geocoder geocoder= new Geocoder(getApplicationContext());

                    try {
                        List<android.location.Address>addresslist = geocoder.getFromLocation(latitude, longitude,1);
                        String str= addresslist.get(0).getLocality()+",";
                        str+= addresslist.get(0).getCountryName();
                        mMap.addMarker(new MarkerOptions().position(latlag).title(str));
                        //mMap.moveCamera(CameraUpdateFactory.newLatLng(latlag));
                        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(latlag, 18));
                        //mMap.setMapType(GoogleMap.MAP_TYPE_SATELLITE);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                }

                @Override
                public void onStatusChanged(String provider, int status, Bundle extras) {

                }

                @Override
                public void onProviderEnabled(String provider) {

                }

                @Override
                public void onProviderDisabled(String provider) {

                }
            });
        }
        //else use GPS provider
        else if(locationmanager.isProviderEnabled(LocationManager.GPS_PROVIDER))
        {
            locationmanager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 0, 0, new LocationListener() {
                @Override
                public void onLocationChanged(Location location) {
                    //get Latitude
                    double latitude=location.getLatitude();
                    //get lognitude
                    double longitude=location.getLongitude();
                    //Instantiate the class, LatLng
                    LatLng latlag=new LatLng(latitude, longitude);
                    Geocoder geocoder= new Geocoder(getApplicationContext());

                    try {
                        List<android.location.Address>addresslist = geocoder.getFromLocation(latitude, longitude,1);
                        String str= addresslist.get(0).getLocality()+",";
                        str+= addresslist.get(0).getCountryName();
                        mMap.addMarker(new MarkerOptions().position(latlag).title(str));
                        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(latlag, 18));
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }

                @Override
                public void onStatusChanged(String provider, int status, Bundle extras) {

                }

                @Override
                public void onProviderEnabled(String provider) {

                }

                @Override
                public void onProviderDisabled(String provider) {

                }
            });
        }


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
//        LatLng sydney = new LatLng(-34, 151);
//        mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney"));
//        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
        //mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(sydney,1.0f));  //zoom in
    }


}
