package com.example.pharma;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsAct extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
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
        LatLng ph1 = new LatLng(34.04307, -6.81226);
        LatLng ph2 = new LatLng(34.04138, -6.81453);
        LatLng ph3 = new LatLng(34.04104, -6.81023);
        LatLng ph4 = new LatLng(34.04073, -6.81296);
        LatLng ph5 = new LatLng(34.00673, -6.85084);
        LatLng ph6 = new LatLng(34.01066, -6.85662);
        LatLng ph7 = new LatLng(34.01685, -6.85684);
        LatLng ph8 = new LatLng(34.01369, -6.86105);
        LatLng ph9 = new LatLng(33.99564, -6.85573);
        LatLng ph10 = new LatLng(33.99494, -6.85075);
        LatLng ph11 = new LatLng(34.02159, -6.83919);
        LatLng ph12 = new LatLng(33.97140, -6.88605);
        LatLng ph13 = new LatLng(33.97332, -6.89122);
        LatLng ph14 = new LatLng(33.98629, -6.81507);
        LatLng ph15 = new LatLng(33.95087, -6.85963);
        LatLng ph16 = new LatLng(34.02169, -6.83641);

        LatLng ph17 = new LatLng(34.02538272885775, -6.833827369888176);
        LatLng ph18 = new LatLng(34.02673429450548, -6.845242849986517);
        LatLng ph19 = new LatLng(34.024436308055456, -6.84978783192672);
        LatLng ph20 = new LatLng(34.01945661478988, -6.849873661549764);
        LatLng ph21 = new LatLng(34.016184085802834, -6.839101910665306);
        LatLng ph22 = new LatLng(34.020096877397144, -6.837127804747242);
        LatLng ph23 = new LatLng(34.0397648151609, -6.800006033515455);
        LatLng ph24 = new LatLng(34.03574624014813, -6.821163296761823);
        LatLng ph25 = new LatLng(34.037844457932515, -6.8221932649523165);
        LatLng ph26 = new LatLng(34.03329232639146, -6.820948720055471);
        LatLng ph27 = new LatLng(34.036706447948, -6.823909878603138);
        LatLng ph28 = new LatLng(34.03696666431002, -6.812731936878448);


        mMap.addMarker(new MarkerOptions().position(ph1).title("Pharmacie Ibn Rochd").draggable(true).icon(BitmapDescriptorFactory.fromResource(R.drawable.pin)));
        mMap.addMarker(new MarkerOptions().position(ph2).title("Pharmacie Dyar").draggable(true).icon(BitmapDescriptorFactory.fromResource(R.drawable.pin)));
        mMap.addMarker(new MarkerOptions().position(ph3).title("Pharmacie Ibtissam").draggable(true).icon(BitmapDescriptorFactory.fromResource(R.drawable.pin)));
        mMap.addMarker(new MarkerOptions().position(ph4).title("Pharmacie Zniber").draggable(true).icon(BitmapDescriptorFactory.fromResource(R.drawable.pin)));
        mMap.addMarker(new MarkerOptions().position(ph5).title("Pharmacie BIN EL OUIDANE").draggable(true).icon(BitmapDescriptorFactory.fromResource(R.drawable.pin)));
        mMap.addMarker(new MarkerOptions().position(ph6).title("Pharmacie Al Faraj").draggable(true).icon(BitmapDescriptorFactory.fromResource(R.drawable.pin)));
        mMap.addMarker(new MarkerOptions().position(ph7).title("Pharmacie AYA").draggable(true).icon(BitmapDescriptorFactory.fromResource(R.drawable.pin)));
        mMap.addMarker(new MarkerOptions().position(ph8).title("Pharmacie CHAMS").draggable(true).icon(BitmapDescriptorFactory.fromResource(R.drawable.pin)));
        mMap.addMarker(new MarkerOptions().position(ph9).title("Pharmacie LES MINISTRES D'AGDAL ").draggable(true).icon(BitmapDescriptorFactory.fromResource(R.drawable.pin)));
        mMap.addMarker(new MarkerOptions().position(ph10).title("PHARMACIE MICHLIFEN").draggable(true).icon(BitmapDescriptorFactory.fromResource(R.drawable.pin)));
        mMap.addMarker(new MarkerOptions().position(ph11).title("Pharmacie Centrale ").draggable(true).icon(BitmapDescriptorFactory.fromResource(R.drawable.pin)));
        mMap.addMarker(new MarkerOptions().position(ph12).title("Pharmacie l'AVENIR").draggable(true).icon(BitmapDescriptorFactory.fromResource(R.drawable.pin)));
        mMap.addMarker(new MarkerOptions().position(ph13).title("Pharmacie Al Massira").draggable(true).icon(BitmapDescriptorFactory.fromResource(R.drawable.pin)));
        mMap.addMarker(new MarkerOptions().position(ph14).title("Pharmacie ENNAJAH").draggable(true).icon(BitmapDescriptorFactory.fromResource(R.drawable.pin)));
        mMap.addMarker(new MarkerOptions().position(ph15).title("Pharmacie Ghayt").draggable(true).icon(BitmapDescriptorFactory.fromResource(R.drawable.pin)));
        mMap.addMarker(new MarkerOptions().position(ph16).title("Pharmacie Guedira").draggable(true).icon(BitmapDescriptorFactory.fromResource(R.drawable.pin)));

        mMap.addMarker(new MarkerOptions().position(ph17).title("Pharmacie El medina").draggable(true).icon(BitmapDescriptorFactory.fromResource(R.drawable.pin)));
        mMap.addMarker(new MarkerOptions().position(ph18).title("Pharmacie Gharbia").draggable(true).icon(BitmapDescriptorFactory.fromResource(R.drawable.pin)));
        mMap.addMarker(new MarkerOptions().position(ph19).title("Pharmacie Napoli").draggable(true).icon(BitmapDescriptorFactory.fromResource(R.drawable.pin)));
        mMap.addMarker(new MarkerOptions().position(ph20).title("Pharmacie Fellat").draggable(true).icon(BitmapDescriptorFactory.fromResource(R.drawable.pin)));
        mMap.addMarker(new MarkerOptions().position(ph21).title("Pharmacie Ibn Tumart").draggable(true).icon(BitmapDescriptorFactory.fromResource(R.drawable.pin)));
        mMap.addMarker(new MarkerOptions().position(ph22).title("Pharmacie La Renaissance").draggable(true).icon(BitmapDescriptorFactory.fromResource(R.drawable.pin)));
        mMap.addMarker(new MarkerOptions().position(ph23).title("Pharmacie Annaim").draggable(true).icon(BitmapDescriptorFactory.fromResource(R.drawable.pin)));
        mMap.addMarker(new MarkerOptions().position(ph24).title("Pharmacie Ryad Sale").draggable(true).icon(BitmapDescriptorFactory.fromResource(R.drawable.pin)));
        mMap.addMarker(new MarkerOptions().position(ph25).title("Pharmacie L.Oasis").draggable(true).icon(BitmapDescriptorFactory.fromResource(R.drawable.pin)));
        mMap.addMarker(new MarkerOptions().position(ph26).title("Pharmacie Al Ahad").draggable(true).icon(BitmapDescriptorFactory.fromResource(R.drawable.pin)));
        mMap.addMarker(new MarkerOptions().position(ph27).title("Pharmacie de l'Union").draggable(true).icon(BitmapDescriptorFactory.fromResource(R.drawable.pin)));
        mMap.addMarker(new MarkerOptions().position(ph28).title("PHARMACIE DES HÔPITAUX").draggable(true).icon(BitmapDescriptorFactory.fromResource(R.drawable.pin)));

        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(ph11, 15f));
    }
}