package master93.tresenraya;

import android.support.v7.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.Toast;

class Jugador
{
    String sello;
    int numeroDelJugador;
    public Jugador(String sello,int numeroDelJugador)
    {
        this.sello=sello;
        this.numeroDelJugador=numeroDelJugador;
    }
}

public class TresEnRaya extends AppCompatActivity implements OnClickListener
{
    boolean turno=true;//
    int[] gato=new int[9];
    ImageView uno,dos,tres,cuatro,cinco,seis,siete,ocho,nueve;
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tresenraya);//here I show main activity

        uno=(ImageView)findViewById(R.id.uno);
        dos=(ImageView)findViewById(R.id.dos);
        tres=(ImageView)findViewById(R.id.tres);
        cuatro=(ImageView)findViewById(R.id.cuatro);
        cinco=(ImageView)findViewById(R.id.cinco);
        seis=(ImageView)findViewById(R.id.seis);
        siete=(ImageView)findViewById(R.id.siete);
        ocho=(ImageView)findViewById(R.id.ocho);
        nueve=(ImageView)findViewById(R.id.nueve);

        uno.setOnClickListener(this);
        dos.setOnClickListener(this);
        tres.setOnClickListener(this);
        cuatro.setOnClickListener(this);
        cinco.setOnClickListener(this);
        seis.setOnClickListener(this);
        siete.setOnClickListener(this);
        ocho.setOnClickListener(this);
        nueve.setOnClickListener(this);

        for(int i:gato)
        {
            gato[i]=0;
        }
    }

    @Override
    public void onClick(View v)
    {
        Jugador jug1=new Jugador("o",1);
        Jugador jug2=new Jugador("x",2);
        Jugador jugadorEnTurno;
        if(turno==true)
        {
            jugadorEnTurno=jug1;
        }
        else
        {
            jugadorEnTurno=jug2;
        }

        switch(v.getId())
        {
            case R.id.uno:
                if (gato[0]==0)
                {
                    if(jugadorEnTurno.numeroDelJugador==1)
                    {
                        uno.setImageResource(R.drawable.x);//.sello seria "o" o "x"
                    }
                    else
                    {
                        uno.setImageResource(R.drawable.o);
                    }
                    gato[0]=jugadorEnTurno.numeroDelJugador;
                    ChecarSiGana(jugadorEnTurno.numeroDelJugador);
                    turno=cambiaTurno(turno);
                }
                break;
            case R.id.dos:
                if (gato[1]==0)
                {
                    if(jugadorEnTurno.numeroDelJugador==1)
                    {
                        dos.setImageResource(R.drawable.x);//.sello seria "o" o "x"
                    }
                    else
                    {
                        dos.setImageResource(R.drawable.o);
                    }
                    gato[1]=jugadorEnTurno.numeroDelJugador;
                    ChecarSiGana(jugadorEnTurno.numeroDelJugador);
                    turno=cambiaTurno(turno);
                }
                break;
            case R.id.tres:
                if (gato[2]==0)
                {
                    if(jugadorEnTurno.numeroDelJugador==1)
                    {
                        tres.setImageResource(R.drawable.x);//.sello seria "o" o "x"
                    }
                    else
                    {
                        tres.setImageResource(R.drawable.o);
                    }
                    gato[2]=jugadorEnTurno.numeroDelJugador;
                    ChecarSiGana(jugadorEnTurno.numeroDelJugador);
                    turno=cambiaTurno(turno);
                }
                break;
            case R.id.cuatro:
                if (gato[3]==0)
                {
                    if(jugadorEnTurno.numeroDelJugador==1)
                    {
                        cuatro.setImageResource(R.drawable.x);//.sello seria "o" o "x"
                    }
                    else
                    {
                        cuatro.setImageResource(R.drawable.o);
                    }
                    gato[3]=jugadorEnTurno.numeroDelJugador;
                    ChecarSiGana(jugadorEnTurno.numeroDelJugador);
                    turno=cambiaTurno(turno);
                }
                break;
            case R.id.cinco:
                if (gato[4]==0)
                {
                    if(jugadorEnTurno.numeroDelJugador==1)
                    {
                        cinco.setImageResource(R.drawable.x);//.sello seria "o" o "x"
                    }
                    else
                    {
                        cinco.setImageResource(R.drawable.o);
                    }//.sello seria "o" o "x"
                    gato[4]=jugadorEnTurno.numeroDelJugador;
                    ChecarSiGana(jugadorEnTurno.numeroDelJugador);
                    turno=cambiaTurno(turno);
                }
                break;
            case R.id.seis:
                if (gato[5]==0)
                {
                    if(jugadorEnTurno.numeroDelJugador==1)
                    {
                        seis.setImageResource(R.drawable.x);//.sello seria "o" o "x"
                    }
                    else
                    {
                        seis.setImageResource(R.drawable.o);
                    }
                    gato[5]=jugadorEnTurno.numeroDelJugador;
                    ChecarSiGana(jugadorEnTurno.numeroDelJugador);
                    turno=cambiaTurno(turno);
                }
                break;
            case R.id.siete:
                if (gato[6]==0)
                {
                    if(jugadorEnTurno.numeroDelJugador==1)
                    {
                        siete.setImageResource(R.drawable.x);//.sello seria "o" o "x"
                    }
                    else
                    {
                        siete.setImageResource(R.drawable.o);
                    }
                    gato[6]=jugadorEnTurno.numeroDelJugador;
                    ChecarSiGana(jugadorEnTurno.numeroDelJugador);
                    turno=cambiaTurno(turno);
                }
                break;
            case R.id.ocho:
                if (gato[7]==0)
                {
                    if(jugadorEnTurno.numeroDelJugador==1)
                    {
                        ocho.setImageResource(R.drawable.x);//.sello seria "o" o "x"
                    }
                    else
                    {
                        ocho.setImageResource(R.drawable.o);
                    }
                    gato[7]=jugadorEnTurno.numeroDelJugador;
                    ChecarSiGana(jugadorEnTurno.numeroDelJugador);
                    turno=cambiaTurno(turno);
                }
                break;
            case R.id.nueve:
                if (gato[8]==0)
                {
                    if(jugadorEnTurno.numeroDelJugador==1)
                    {
                        nueve.setImageResource(R.drawable.x);//.sello seria "o" o "x"
                    }
                    else
                    {
                        nueve.setImageResource(R.drawable.o);
                    }
                    gato[8]=jugadorEnTurno.numeroDelJugador;
                    ChecarSiGana(jugadorEnTurno.numeroDelJugador);
                    turno=cambiaTurno(turno);
                }
                break;
        }
    }

    public boolean cambiaTurno(boolean turno)
    {
        boolean turnoCambiado;
        if(turno)
        {
            turnoCambiado=false;
        }
        else
        {
            turnoCambiado=true;
        }

        return turnoCambiado;
    }



    public void ChecarSiGana(int ficha)
    {
        boolean userGano=false;
        int f=ficha;

        if(gato[0]==f && gato[1]==f && gato[2]==f) userGano=true;
        if(gato[3]==f && gato[4]==f && gato[5]==f) userGano=true;
        if(gato[6]==f && gato[7]==f && gato[8]==f) userGano=true;
        if(gato[0]==f && gato[3]==f && gato[6]==f) userGano=true;
        if(gato[1]==f && gato[4]==f && gato[7]==f) userGano=true;
        if(gato[2]==f && gato[5]==f && gato[8]==f) userGano=true;
        if(gato[0]==f && gato[4]==f && gato[8]==f) userGano=true;
        if(gato[2]==f && gato[4]==f && gato[6]==f) userGano=true;

        if(userGano==true)//pilas flaquito
        {
            Toast m=Toast.makeText(this,"Gano el jugador:"+ficha,Toast.LENGTH_SHORT);
            m.show();
            borrar();//pilas
        }
    }


    public void borrar()//pilas mi tio ojo al piojo
    {
        Handler handler= new Handler();
        handler.postDelayed(new Runnable()
        {
            public void run()
            {
                uno.setImageDrawable(null);
                dos.setImageDrawable(null);
                tres.setImageDrawable(null);
                cuatro.setImageDrawable(null);
                cinco.setImageDrawable(null);
                seis.setImageDrawable(null);
                siete.setImageDrawable(null);
                ocho.setImageDrawable(null);
                nueve.setImageDrawable(null);

                turno=true;

                for(int i:gato)
                {
                    gato[i]=0;
                }
            }
        },20);
    }

    public void reiniciar(View v)
    {
        //Button restart=(Button)findViewById(R.id.b);

        borrar();

    }
}
