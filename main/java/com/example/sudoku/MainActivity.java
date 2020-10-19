package com.example.sudoku;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    int tablica[][] = new int[9][9];
    List<EditText> lista;

    EditText pole_0_0;
    EditText pole_0_2;
    EditText pole_0_3;
    EditText pole_0_4;
    EditText pole_0_5;
    EditText pole_0_7;
    EditText pole_0_8;

    EditText pole_1_0;
    EditText pole_1_1;
    EditText pole_1_2;
    EditText pole_1_3;
    EditText pole_1_6;
    EditText pole_1_8;

    EditText pole_2_0;
    EditText pole_2_1;
    EditText pole_2_5;
    EditText pole_2_6;
    EditText pole_2_8;

    EditText pole_3_0;
    EditText pole_3_3;
    EditText pole_3_4;
    EditText pole_3_5;
    EditText pole_3_6;
    EditText pole_3_8;

    EditText pole_4_1;
    EditText pole_4_2;
    EditText pole_4_4;
    EditText pole_4_6;
    EditText pole_4_7;

    EditText pole_5_0;
    EditText pole_5_2;
    EditText pole_5_3;
    EditText pole_5_4;
    EditText pole_5_5;
    EditText pole_5_8;

    EditText pole_6_0;
    EditText pole_6_2;
    EditText pole_6_3;
    EditText pole_6_7;

    EditText pole_7_0;
    EditText pole_7_2;
    EditText pole_7_5;
    EditText pole_7_6;
    EditText pole_7_7;
    EditText pole_7_8;

    EditText pole_8_0;
    EditText pole_8_1;
    EditText pole_8_3;
    EditText pole_8_4;
    EditText pole_8_5;
    EditText pole_8_6;
    EditText pole_8_8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        wypelnijTablice();

        pole_0_0 = (EditText)findViewById(R.id.textView_0_0);
        pole_0_2 = (EditText)findViewById(R.id.textView_0_2);
        pole_0_3 = (EditText)findViewById(R.id.textView_0_3);
        pole_0_4 = (EditText)findViewById(R.id.textView_0_4);
        pole_0_5 = (EditText)findViewById(R.id.textView_0_5);
        pole_0_7 = (EditText)findViewById(R.id.textView_0_7);
        pole_0_8 = (EditText)findViewById(R.id.textView_0_8);

        pole_1_0 = (EditText)findViewById(R.id.textView_1_0);
        pole_1_1 = (EditText)findViewById(R.id.textView_1_1);
        pole_1_2 = (EditText)findViewById(R.id.textView_1_2);
        pole_1_3 = (EditText)findViewById(R.id.textView_1_3);
        pole_1_6 = (EditText)findViewById(R.id.textView_1_6);
        pole_1_8 = (EditText)findViewById(R.id.textView_1_8);

        pole_2_0 = (EditText)findViewById(R.id.textView_2_0);
        pole_2_1 = (EditText)findViewById(R.id.textView_2_1);
        pole_2_5 = (EditText)findViewById(R.id.textView_2_5);
        pole_2_6 = (EditText)findViewById(R.id.textView_2_6);
        pole_2_8 = (EditText)findViewById(R.id.textView_2_8);

        pole_3_0 = (EditText)findViewById(R.id.textView_3_0);
        pole_3_3 = (EditText)findViewById(R.id.textView_3_3);
        pole_3_4 = (EditText)findViewById(R.id.textView_3_4);
        pole_3_5 = (EditText)findViewById(R.id.textView_3_5);
        pole_3_6 = (EditText)findViewById(R.id.textView_3_6);
        pole_3_8 = (EditText)findViewById(R.id.textView_3_8);

        pole_4_1 = (EditText)findViewById(R.id.textView_4_1);
        pole_4_2 = (EditText)findViewById(R.id.textView_4_2);
        pole_4_4 = (EditText)findViewById(R.id.textView_4_4);
        pole_4_6 = (EditText)findViewById(R.id.textView_4_6);
        pole_4_7 = (EditText)findViewById(R.id.textView_4_7);

        pole_5_0 = (EditText)findViewById(R.id.textView_5_0);
        pole_5_2 = (EditText)findViewById(R.id.textView_5_2);
        pole_5_3 = (EditText)findViewById(R.id.textView_5_3);
        pole_5_4 = (EditText)findViewById(R.id.textView_5_4);
        pole_5_5 = (EditText)findViewById(R.id.textView_5_5);
        pole_5_8 = (EditText)findViewById(R.id.textView_5_8);

        pole_6_0 = (EditText)findViewById(R.id.textView_6_0);
        pole_6_2 = (EditText)findViewById(R.id.textView_6_2);
        pole_6_3 = (EditText)findViewById(R.id.textView_6_3);
        pole_6_7 = (EditText)findViewById(R.id.textView_6_7);

        pole_7_0 = (EditText)findViewById(R.id.textView_7_0);
        pole_7_2 = (EditText)findViewById(R.id.textView_7_2);
        pole_7_5 = (EditText)findViewById(R.id.textView_7_5);
        pole_7_6 = (EditText)findViewById(R.id.textView_7_6);
        pole_7_7 = (EditText)findViewById(R.id.textView_7_7);
        pole_7_8 = (EditText)findViewById(R.id.textView_7_8);

        pole_8_0 = (EditText)findViewById(R.id.textView_8_0);
        pole_8_1 = (EditText)findViewById(R.id.textView_8_1);
        pole_8_3 = (EditText)findViewById(R.id.textView_8_3);
        pole_8_4 = (EditText)findViewById(R.id.textView_8_4);
        pole_8_5 = (EditText)findViewById(R.id.textView_8_5);
        pole_8_6 = (EditText)findViewById(R.id.textView_8_6);
        pole_8_8 = (EditText)findViewById(R.id.textView_8_8);

        wypelnijListePolTekstowych();

        Button przyciskSprawdz = (Button)findViewById(R.id.buttonSprawdz);
        Button przyciskWyczysc = (Button)findViewById(R.id.buttonWyczysc);

        przyciskSprawdz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                uzupelnijTabliceKoniec();

                if(!czyWszystkoWypelnione())
                {
                    System.out.println("nie wypelniles wszytskiego!!");
                    System.out.println("\n");
                    okienkoNieWypelnione();
                }
                else
                {
                    if(czyDobrzeWypelnione())
                    {
                        System.out.println("Jeeeeeeej");
                        okienkoDobrzeWypelnione();
                    }
                    else
                    {
                        System.out.println("Nie poprawne");
                        okienkoZleWypelnione();
                    }
                }
            }
        });

        przyciskWyczysc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                wyczyscPolaTekstowe();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public boolean czyWszystkoWypelnione()
    {
        for(int i=0; i<9; i++)
        {
            for(int j=0;j<9;j++)
            {
                if(tablica[i][j]==0)
                {
                    return false;
                }

            }
        }
        return true;
    }

    //wpisuje do tablicy wartości początkowe, z kwadratów, które mają domyślne wartości
    public void wypelnijTablice()
    {

        tablica[0][1] = 8;
        tablica[0][6] = 2;
        tablica[1][4] = 8;
        tablica[1][5] = 4;
        tablica[1][7] = 9;
        tablica[2][2] = 6;
        tablica[2][3] = 3;
        tablica[2][4] = 2;
        tablica[2][7] = 1;

        tablica[3][1] = 9;
        tablica[3][2] = 7;
        tablica[3][7] = 8;
        tablica[4][0] = 8;
        tablica[4][3] = 9;
        tablica[4][5] = 3;
        tablica[4][8] = 2;
        tablica[5][1] = 1;
        tablica[5][6] = 9;
        tablica[5][7] = 5;

        tablica[6][1] = 7;
        tablica[6][4] = 4;
        tablica[6][5] = 5;
        tablica[6][6] = 8;
        tablica[6][8] = 3;
        tablica[7][1] = 3;
        tablica[7][3] = 7;
        tablica[7][4] = 1;
        tablica[8][2] = 8;
        tablica[8][7] = 4;
    }

    public void wyczyscTablice()
    {
        for(int i=0; i<9; i++)
        {
            for(int j=0; j<9; j++)
            {
                tablica[i][j]=0;
            }
        }
    }

    public void uzupelnijTabliceKoniec()
    {
        tablica[0][0] = pole_0_0.getText().toString().isEmpty()?0: Integer.parseInt(pole_0_0.getText().toString());
        tablica[0][2] = pole_0_2.getText().toString().isEmpty()?0: Integer.parseInt(pole_0_2.getText().toString());
        tablica[0][3] = pole_0_3.getText().toString().isEmpty()?0: Integer.parseInt(pole_0_3.getText().toString());
        tablica[0][4] = pole_0_4.getText().toString().isEmpty()?0: Integer.parseInt(pole_0_4.getText().toString());
        tablica[0][5] = pole_0_5.getText().toString().isEmpty()?0: Integer.parseInt(pole_0_5.getText().toString());
        tablica[0][7] = pole_0_7.getText().toString().isEmpty()?0: Integer.parseInt(pole_0_7.getText().toString());
        tablica[0][8] = pole_0_8.getText().toString().isEmpty()?0: Integer.parseInt(pole_0_8.getText().toString());

        tablica[1][0] = pole_1_0.getText().toString().isEmpty()?0: Integer.parseInt(pole_1_0.getText().toString());
        tablica[1][1] = pole_1_1.getText().toString().isEmpty()?0: Integer.parseInt(pole_1_1.getText().toString());
        tablica[1][2] = pole_1_2.getText().toString().isEmpty()?0: Integer.parseInt(pole_1_2.getText().toString());
        tablica[1][3] = pole_1_3.getText().toString().isEmpty()?0: Integer.parseInt(pole_1_3.getText().toString());
        tablica[1][6] = pole_1_6.getText().toString().isEmpty()?0: Integer.parseInt(pole_1_6.getText().toString());
        tablica[1][8] = pole_1_8.getText().toString().isEmpty()?0: Integer.parseInt(pole_1_8.getText().toString());

        tablica[2][0] = pole_2_0.getText().toString().isEmpty()?0: Integer.parseInt(pole_2_0.getText().toString());
        tablica[2][1] = pole_2_1.getText().toString().isEmpty()?0: Integer.parseInt(pole_2_1.getText().toString());
        tablica[2][5] = pole_2_5.getText().toString().isEmpty()?0: Integer.parseInt(pole_2_5.getText().toString());
        tablica[2][6] = pole_2_6.getText().toString().isEmpty()?0: Integer.parseInt(pole_2_6.getText().toString());
        tablica[2][8] = pole_2_8.getText().toString().isEmpty()?0: Integer.parseInt(pole_2_8.getText().toString());

        tablica[3][0] = pole_3_0.getText().toString().isEmpty()?0: Integer.parseInt(pole_3_0.getText().toString());
        tablica[3][3] = pole_3_3.getText().toString().isEmpty()?0: Integer.parseInt(pole_3_3.getText().toString());
        tablica[3][4] = pole_3_4.getText().toString().isEmpty()?0: Integer.parseInt(pole_3_4.getText().toString());
        tablica[3][5] = pole_3_5.getText().toString().isEmpty()?0: Integer.parseInt(pole_3_5.getText().toString());
        tablica[3][6] = pole_3_6.getText().toString().isEmpty()?0: Integer.parseInt(pole_3_6.getText().toString());
        tablica[3][8] = pole_3_8.getText().toString().isEmpty()?0: Integer.parseInt(pole_3_8.getText().toString());

        tablica[4][1] = pole_4_1.getText().toString().isEmpty()?0: Integer.parseInt(pole_4_1.getText().toString());
        tablica[4][2] = pole_4_2.getText().toString().isEmpty()?0: Integer.parseInt(pole_4_2.getText().toString());
        tablica[4][4] = pole_4_4.getText().toString().isEmpty()?0: Integer.parseInt(pole_4_4.getText().toString());
        tablica[4][6] = pole_4_6.getText().toString().isEmpty()?0: Integer.parseInt(pole_4_6.getText().toString());
        tablica[4][7] = pole_4_7.getText().toString().isEmpty()?0: Integer.parseInt(pole_4_7.getText().toString());

        tablica[5][0] = pole_5_0.getText().toString().isEmpty()?0: Integer.parseInt(pole_5_0.getText().toString());
        tablica[5][2] = pole_5_2.getText().toString().isEmpty()?0: Integer.parseInt(pole_5_2.getText().toString());
        tablica[5][3] = pole_5_3.getText().toString().isEmpty()?0: Integer.parseInt(pole_5_3.getText().toString());
        tablica[5][4] = pole_5_4.getText().toString().isEmpty()?0: Integer.parseInt(pole_5_4.getText().toString());
        tablica[5][5] = pole_5_5.getText().toString().isEmpty()?0: Integer.parseInt(pole_5_5.getText().toString());
        tablica[5][8] = pole_5_8.getText().toString().isEmpty()?0: Integer.parseInt(pole_5_8.getText().toString());

        tablica[6][0] = pole_6_0.getText().toString().isEmpty()?0: Integer.parseInt(pole_6_0.getText().toString());
        tablica[6][2] = pole_6_2.getText().toString().isEmpty()?0: Integer.parseInt(pole_6_2.getText().toString());
        tablica[6][3] = pole_6_3.getText().toString().isEmpty()?0: Integer.parseInt(pole_6_3.getText().toString());
        tablica[6][7] = pole_6_7.getText().toString().isEmpty()?0: Integer.parseInt(pole_6_7.getText().toString());

        tablica[7][0] = pole_7_0.getText().toString().isEmpty()?0: Integer.parseInt(pole_7_0.getText().toString());
        tablica[7][2] = pole_7_2.getText().toString().isEmpty()?0: Integer.parseInt(pole_7_2.getText().toString());
        tablica[7][5] = pole_7_5.getText().toString().isEmpty()?0: Integer.parseInt(pole_7_5.getText().toString());
        tablica[7][6] = pole_7_6.getText().toString().isEmpty()?0: Integer.parseInt(pole_7_6.getText().toString());
        tablica[7][7] = pole_7_7.getText().toString().isEmpty()?0: Integer.parseInt(pole_7_7.getText().toString());
        tablica[7][8] = pole_7_8.getText().toString().isEmpty()?0: Integer.parseInt(pole_7_8.getText().toString());

        tablica[8][0] = pole_8_0.getText().toString().isEmpty()?0: Integer.parseInt(pole_8_0.getText().toString());
        tablica[8][1] = pole_8_1.getText().toString().isEmpty()?0: Integer.parseInt(pole_8_1.getText().toString());
        tablica[8][3] = pole_8_3.getText().toString().isEmpty()?0: Integer.parseInt(pole_8_3.getText().toString());
        tablica[8][4] = pole_8_4.getText().toString().isEmpty()?0: Integer.parseInt(pole_8_4.getText().toString());
        tablica[8][5] = pole_8_5.getText().toString().isEmpty()?0: Integer.parseInt(pole_8_5.getText().toString());
        tablica[8][6] = pole_8_6.getText().toString().isEmpty()?0: Integer.parseInt(pole_8_6.getText().toString());
        tablica[8][8] = pole_8_8.getText().toString().isEmpty()?0: Integer.parseInt(pole_8_8.getText().toString());

    }

    public boolean czyKolumnyPoprawne()
    {
        int n=1;
        boolean znalezione=false;

        for(int i=0;i<9;i++)
        {
            while(n<=9)
            {
                for (int j=0; j<9; j++)
                {
                    if (tablica[i][j] == n)
                    {
                        znalezione = true;
                    }
                }
                if(!znalezione)
                {
                    System.out.println("liczba "+n+", wiersz "+i+"\n");
                    return false;
                }
                else
                {
                    n++;
                    znalezione=false;
                }
            }
            n=1;
        }
        return true;
    }

    public boolean czyWierszePoprawne()
    {
        int n=1;
        boolean znalezione=false;

        for(int j=0;j<9;j++)
        {
            while(n<=9)
            {
                for (int i = 0; i < 9; i++)
                {
                    if (tablica[i][j] == n)
                    {
                        znalezione = true;
                    }
                }
                if(!znalezione)
                {
                    return false;
                }
                else
                {
                    n++;
                    znalezione=false;
                }
            }
            n=1;
        }
        return true;
    }

    public boolean czyKwadratyPoprawne()
    {

        int n=1;
        boolean znalezione=false;

        for(int w=0; w<9; w=w+3)
        {
            for(int k=0; k<9; k=k+3)
            {
                while(n<=9)
                {
                    for (int i = 0; i < 3; i++)
                    {
                        for (int j = 0; j < 3; j++)
                        {
                            if (tablica[i+w][j+k] == n)
                            {
                                znalezione = true;
                            }
                        }
                    }
                    if(!znalezione)
                    {
                        return false;
                    }
                    else
                    {
                        n++;
                        znalezione=false;
                    }

                }
                n=1;
            }
        }
        return true;
    }

    public boolean czyDobrzeWypelnione()
    {
        if(!czyKolumnyPoprawne()||!czyWierszePoprawne()||!czyKwadratyPoprawne())
        {
            System.out.println("czy kolumny poprawne"+czyKolumnyPoprawne()+"\n");
            System.out.println("czy wiersz poprawne"+czyWierszePoprawne()+"\n");
            System.out.println("czy kwadraty poprawne"+czyKwadratyPoprawne()+"\n");
            return false;
        }
        else
        {
            return true;
        }
    }

    public void wypelnijListePolTekstowych()
    {
        lista = new ArrayList<EditText>();

        lista.add(pole_0_0);
        lista.add(pole_0_2);
        lista.add(pole_0_3);
        lista.add(pole_0_4);
        lista.add(pole_0_5);
        lista.add(pole_0_7);
        lista.add(pole_0_8);

        lista.add(pole_1_0);
        lista.add(pole_1_1);
        lista.add(pole_1_2);
        lista.add(pole_1_3);
        lista.add(pole_1_6);
        lista.add(pole_1_8);

        lista.add(pole_2_0);
        lista.add(pole_2_1);
        lista.add(pole_2_5);
        lista.add(pole_2_6);
        lista.add(pole_2_8);

        lista.add(pole_3_0);
        lista.add(pole_3_3);
        lista.add(pole_3_4);
        lista.add(pole_3_5);
        lista.add(pole_3_6);
        lista.add(pole_3_8);

        lista.add(pole_4_1);
        lista.add(pole_4_2);
        lista.add(pole_4_4);
        lista.add(pole_4_6);
        lista.add(pole_4_7);

        lista.add(pole_5_0);
        lista.add(pole_5_2);
        lista.add(pole_5_3);
        lista.add(pole_5_4);
        lista.add(pole_5_5);
        lista.add(pole_5_8);

        lista.add(pole_6_0);
        lista.add(pole_6_2);
        lista.add(pole_6_3);
        lista.add(pole_6_7);

        lista.add(pole_7_0);
        lista.add(pole_7_2);
        lista.add(pole_7_5);
        lista.add(pole_7_6);
        lista.add(pole_7_7);
        lista.add(pole_7_8);

        lista.add(pole_8_0);
        lista.add(pole_8_1);
        lista.add(pole_8_3);
        lista.add(pole_8_4);
        lista.add(pole_8_5);
        lista.add(pole_8_6);
        lista.add(pole_8_8);
    }

    public void wyczyscPolaTekstowe()
    {
        for (int i = 0; i < lista.size(); i++)
        {
            lista.get(i).setText("");
        }
        wyczyscTablice();
        wypelnijTablice();
    }

    public void okienkoNieWypelnione()
    {
        OkienkoNieWypelnione okienkoNieWypelnione = new OkienkoNieWypelnione();
        okienkoNieWypelnione.show(getSupportFragmentManager(), "okienko nie wypelnione");
    }

    public void okienkoZleWypelnione()
    {
        OkienkoZleWypelnione okienkoZleWypelnione = new OkienkoZleWypelnione();
        okienkoZleWypelnione.show(getSupportFragmentManager(), "okienko zle wypelnione");
    }

    public void okienkoDobrzeWypelnione()
    {
        OkienkoDobrzeWypelnione okienkoDobrzeWypelnione = new OkienkoDobrzeWypelnione();
        okienkoDobrzeWypelnione.show(getSupportFragmentManager(), "okienko dobrze wypelnione");
    }

}
