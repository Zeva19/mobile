
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Membuka Website
        Button btnWebsite = findViewById(R.id.btnwebsite);
        btnWebsite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri webpage = Uri.parse("https://www.google.com");
                Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
                startActivity(intent);
            }
        });

        // Menelepon Nomor
        Button btnCall = findViewById(R.id.btncall);
        btnCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri phoneNumber = Uri.parse("tel:08123456789");
                Intent intent = new Intent(Intent.ACTION_DIAL, phoneNumber);
                startActivity(intent);
            }
        });

        // Mengirim Email
        Button btnEmail = findViewById(R.id.btnemail);
        btnEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SENDTO);
                intent.setData(Uri.parse("mailto:example@gmail.com"));
                intent.putExtra(Intent.EXTRA_SUBJECT, "Judul Email");
                intent.putExtra(Intent.EXTRA_TEXT, "Isi Email");
                startActivity(intent);
            }
        });

        // Membuka Lokasi di Google Maps
        Button btnMaps = findViewById(R.id.btnmaps);
        btnMaps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri location = Uri.parse("geo:-7.797068,110.370529?q=Yogyakarta");
                Intent intent = new Intent(Intent.ACTION_VIEW, location);
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);
            }
        });

        // Membuka Kamera
        Button btnCamera = findViewById(R.id.btncamera);
        btnCamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
                startActivity(intent);
            }
        });
    }
}