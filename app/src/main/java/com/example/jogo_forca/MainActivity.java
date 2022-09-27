package com.example.jogo_forca;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Element;

public class MainActivity extends AppCompatActivity {

    ImageView imgCabeca;
    ImageView imgCorpo;
    ImageView imgPerna;
    ImageView img1;
    ImageView img2;
    ImageView img3;
    TextView txtResposta;
    TextView txtResultado;
    Button btnVerifica;

    String resposta = "RUA";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img1 = findViewById(R.id.img1);
        img2 = findViewById(R.id.img2);
        img3 = findViewById(R.id.img3);

        txtResposta = findViewById(R.id.textResposta);
        txtResultado = findViewById(R.id.txtResultado);
        btnVerifica = findViewById(R.id.btnVerifica);

        btnVerifica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String comparacao = txtResposta.getText().toString();
                comparacao = comparacao.toUpperCase();

                String letra1 = comparacao.charAt(0)+"";
                String letra2 = comparacao.charAt(1)+"";
                String letra3 = comparacao.charAt(2)+"";

                String l1 = "R";
                String l2 = "U";
                String l3 = "A";

                if(letra1.equals(l1)){
                    img1.setImageResource(R.drawable.branco);
                }else{
                    img1.setImageResource(R.drawable.cabeca);
                    txtResultado.setText("Errou");
                }

                if(letra2.equals(l2)){
                    img2.setImageResource(R.drawable.branco);
                }else{
                    img2.setImageResource(R.drawable.peito);
                    txtResultado.setText("Errou");
                }

                if(letra1.equals(l3)){
                    img3.setImageResource(R.drawable.branco);
                }else{
                    img3.setImageResource(R.drawable.perna);
                    txtResultado.setText("Errou");
                }

                if(letra1.equals(l1) && letra2.equals(l2) && letra3.equals(l3)){
                    txtResultado.setText("Ganhou");
                    img1.setImageResource(R.drawable.branco);
                    img2.setImageResource(R.drawable.branco);
                    img3.setImageResource(R.drawable.branco);
                }

            }
        });
    }
}