package com.example.appbanco;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.appbanco.databinding.ActivityOperadoraBinding;
import com.example.appbanco.databinding.ActivityRecargaBinding;

public class Recarga extends AppCompatActivity {

    private ActivityRecargaBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recarga);

        binding = ActivityRecargaBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnProximo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Recarga.this,RecargaPagamento.class);
                startActivity(intent);
            }
        });
    }
}