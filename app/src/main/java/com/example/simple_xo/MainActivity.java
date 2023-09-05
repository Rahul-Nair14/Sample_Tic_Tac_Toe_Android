package com.example.simple_xo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    boolean turnX = true;

    ImageView i0,i1,i2,i3,i4,i5,i6,i7,i8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        i0 = (ImageView) findViewById(R.id.zeroZero);
        i1 = (ImageView) findViewById(R.id.zeroOne);
        i2 = (ImageView) findViewById(R.id.zeroTwo);
        i3 = (ImageView) findViewById(R.id.oneZero);
        i4 = (ImageView) findViewById(R.id.oneOne);
        i5 = (ImageView) findViewById(R.id.oneTwo);
        i6 = (ImageView) findViewById(R.id.twoZero);
        i7 = (ImageView) findViewById(R.id.twoOne);
        i8 = (ImageView) findViewById(R.id.twotwo);

        i0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (i0.getDrawable() == null) {
                    if (turnX) {
                        i0.setImageResource(R.drawable.thin_letter_x_black_png_7);
                        turnX = false;
                    } else {
                        i0.setImageResource(R.drawable.alphabet_o_png_hd_quality);
                        turnX = true;
                    }
                }
            }
        });

        i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (i1.getDrawable() == null) {
                    if (turnX) {
                        i1.setImageResource(R.drawable.thin_letter_x_black_png_7);
                        turnX = false;
                    } else {
                        i1.setImageResource(R.drawable.alphabet_o_png_hd_quality);
                        turnX = true;
                    }
                }
            }
        });

        i2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (i2.getDrawable() == null) {
                    if (turnX) {
                        i2.setImageResource(R.drawable.thin_letter_x_black_png_7);
                        turnX = false;
                    } else {
                        i2.setImageResource(R.drawable.alphabet_o_png_hd_quality);
                        turnX = true;
                    }
                }
            }
        });

        i3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (i3.getDrawable() == null) {
                    if (turnX) {
                        i3.setImageResource(R.drawable.thin_letter_x_black_png_7);
                        turnX = false;
                    } else {
                        i3.setImageResource(R.drawable.alphabet_o_png_hd_quality);
                        turnX = true;
                    }
                }
            }
        });

        i4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (i4.getDrawable() == null) {
                    if (turnX) {
                        i4.setImageResource(R.drawable.thin_letter_x_black_png_7);
                        turnX = false;
                    } else {
                        i4.setImageResource(R.drawable.alphabet_o_png_hd_quality);
                        turnX = true;
                    }
                }
            }
        });

        i5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (i5.getDrawable() == null) {
                    if (turnX) {
                        i5.setImageResource(R.drawable.thin_letter_x_black_png_7);
                        turnX = false;
                    } else {
                        i5.setImageResource(R.drawable.alphabet_o_png_hd_quality);
                        turnX = true;
                    }
                }
            }
        });

        i6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (i6.getDrawable() == null) {
                    if (turnX) {
                        i6.setImageResource(R.drawable.thin_letter_x_black_png_7);
                        turnX = false;
                    } else {
                        i6.setImageResource(R.drawable.alphabet_o_png_hd_quality);
                        turnX = true;
                    }
                }
            }
        });

        i7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (i7.getDrawable() == null) {
                    if (turnX) {
                        i7.setImageResource(R.drawable.thin_letter_x_black_png_7);
                        turnX = false;
                    } else {
                        i7.setImageResource(R.drawable.alphabet_o_png_hd_quality);
                        turnX = true;
                    }
                }
            }
        });

        i8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (i8.getDrawable() == null) {
                    if (turnX) {
                        i8.setImageResource(R.drawable.thin_letter_x_black_png_7);
                        turnX = false;
                    } else {
                        i8.setImageResource(R.drawable.alphabet_o_png_hd_quality);
                        turnX = true;
                    }
                }
            }
        });
    }
}
