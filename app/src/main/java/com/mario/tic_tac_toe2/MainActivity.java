package com.mario.tic_tac_toe2;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AlertDialogLayout;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn00, btn01,btn02,btn10,btn11,btn12,btn20,btn21,btn22;
    int turn;
    private Button alertdialog;
    TextView ganador;
    int Draw = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        alertdialog = (Button) findViewById(R.id.btnReintentar);
        btn00 = (Button) findViewById(R.id.bt00);
        btn01 = (Button) findViewById(R.id.bt01);
        btn02 = (Button) findViewById(R.id.bt02);
        btn10 = (Button) findViewById(R.id.bt10);
        btn11 = (Button) findViewById(R.id.bt11);
        btn12 = (Button) findViewById(R.id.bt12);
        btn20 = (Button) findViewById(R.id.btn20);
        btn21 = (Button) findViewById(R.id.bt21);
        btn22 = (Button) findViewById(R.id.bt22);
        ganador = findViewById(R.id.textganador);
        turn = 1;
        //AlertDialog para el boton de reseteo del juego
        alertdialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alerta = new AlertDialog.Builder(MainActivity.this );
                alerta.setMessage("¿seguro que quiere reiniciar el juego?")
                        .setCancelable(false).setPositiveButton("si", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        turn = 1;
                        btn00.setText("-");
                        btn01.setText("-");
                        btn02.setText("-");
                        btn10.setText("-");
                        btn11.setText("-");
                        btn12.setText("-");
                        btn20.setText("-");
                        btn21.setText("-");
                        btn22.setText("-");
                        ganador.setText("");
                        btn00.setEnabled(true);
                        btn01.setEnabled(true);
                        btn02.setEnabled(true);
                        btn10.setEnabled(true);
                        btn11.setEnabled(true);
                        btn12.setEnabled(true);
                        btn20.setEnabled(true);
                        btn21.setEnabled(true);
                        btn22.setEnabled(true);
                        Draw = 0;
                    }

                })
                .setNegativeButton("no", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                AlertDialog titulo = alerta.create();
                titulo.setTitle("Reintentar");
                titulo.show();
            }
        });
        //onClickListener de cada boton
        btn00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (btn00.getText().toString().equals("-")) {
                    if (turn == 1) {
                        turn = 2;
                        btn00.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        btn00.setText("O");
                    }

                }
                Draw++;
                endgame();

            }

        });
        btn01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (btn01.getText().toString().equals("-")) {
                    if (turn == 1) {
                        turn = 2;
                        btn01.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        btn01.setText("O");
                    }

                }
                Draw++;
                endgame();

            }
        });
        btn02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (btn02.getText().toString().equals("-")) {
                    if (turn == 1) {
                        turn = 2;
                        btn02.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        btn02.setText("O");
                    }

                }
                Draw++;
                endgame();

            }
        });
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (btn10.getText().toString().equals("-")) {
                    if (turn == 1) {
                        turn = 2;
                        btn10.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        btn10.setText("O");
                    }

                }
                Draw++;
                endgame();

            }
        });
        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (btn11.getText().toString().equals("-")) {
                    if (turn == 1) {
                        turn = 2;
                        btn11.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        btn11.setText("O");
                    }

                }
                Draw++;
                endgame();

            }
        });
        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (btn12.getText().toString().equals("-")) {
                    if (turn == 1) {
                        turn = 2;
                        btn12.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        btn12.setText("O");
                    }

                }
                Draw++;
                endgame();

            }
        });
        btn20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (btn20.getText().toString().equals("-")) {
                    if (turn == 1) {
                        turn = 2;
                        btn20.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        btn20.setText("O");
                    }

                }
                Draw++;
                endgame();

            }
        });
        btn21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (btn21.getText().toString().equals("-")) {
                    if (turn == 1) {
                        turn = 2;
                        btn21.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        btn21.setText("O");
                    }

                }
                Draw++;
                endgame();

            }
            });
        btn22 .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (btn22.getText().toString().equals("-")) {
                    if (turn == 1) {
                        turn = 2;
                        btn22.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        btn22.setText("O");
                    }

                }
                Draw++;
                endgame();

            }
        });
    }
    //checador de quien gano el juego
    private void endgame() {
        boolean end = false;
        String a,b,c,d,e,f,g,h,i;
        a = btn00.getText().toString();
        b = btn01.getText().toString();
        c = btn02.getText().toString();

        d = btn10.getText().toString();
        e = btn11.getText().toString();
        f = btn12.getText().toString();

        g = btn20.getText().toString();
        h = btn21.getText().toString();
        i = btn22.getText().toString();

        //para el jugadror 1
        if (Draw >= 9){
            ganador.setText("Empate");
        }

        if (a.equals("X") && b.equals("X") && c.equals("X")) {
                ganador.setText("Gana X");
            end = true;
            }

        if (d.equals("X") && e.equals("X") && f.equals("X")) {
                ganador.setText("Gana X");
            end = true;
            }
        if (g.equals("X") && h.equals("X") && i.equals("X")) {
                ganador.setText("Gana X");
            end = true;
            }
            //verticales
        if (a.equals("X") && d.equals("X") && g.equals("X")) {
                ganador.setText("Gana X");
            end = true;
            }
        if (b.equals("X") && e.equals("X") && h.equals("X")) {
                ganador.setText("Gana X");
            end = true;
            }
        if (c.equals("X") && f.equals("X") && i.equals("X")) {
                ganador.setText("Gana X");
            end = true;
            }
            //diagonales
        if (a.equals("X") && e.equals("X") && i.equals("X")) {
                ganador.setText("Gana X");
            end = true;
            }
        if (c.equals("X") && e.equals("X") && g.equals("X")) {
                ganador.setText("Gana X");
            end = true;
            }
            //jugador 2
        if (a.equals("O") && b.equals("O") && c.equals("O")) {

                ganador.setText("Gana O");
            end = true;

            }

        if (d.equals("O") && e.equals("O") && f.equals("O")) {
                ganador.setText("Gana O");
            end = true;
            }
        if (g.equals("O") && h.equals("O") && i.equals("O")) {
                ganador.setText("Gana O");
            end = true;
            }
            //verticales
        if (a.equals("O") && d.equals("O") && g.equals("O")) {
                ganador.setText("Gana O");
            end = true;
            }
        if (b.equals("O") && e.equals("O") && h.equals("O")) {
                ganador.setText("Gana O");
            end = true;
            }
        if (c.equals("O") && f.equals("O") && i.equals("O")) {
                ganador.setText("Gana O");
            end = true;
            }
            //diagonales
        if (a.equals("O") && e.equals("O") && i.equals("O")) {
                ganador.setText("Gana O");
            end = true;
            }
        if (c.equals("O") && e.equals("O") && g.equals("O")) {
                ganador.setText("Gana O");
            end = true;
            }
        if (end) {
            btn00.setEnabled(false);
            btn01.setEnabled(false);
            btn02.setEnabled(false);
            btn10.setEnabled(false);
            btn11.setEnabled(false);
            btn12.setEnabled(false);
            btn20.setEnabled(false);
            btn21.setEnabled(false);
            btn22.setEnabled(false);
        }

    }
}
