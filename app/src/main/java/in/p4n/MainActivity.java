package in.p4n;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn_clr;
    int flag=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1=(Button)findViewById(R.id.btn01);
        btn2=(Button)findViewById(R.id.btn02);
        btn3=(Button)findViewById(R.id.btn03);
        btn4=(Button)findViewById(R.id.btn04);
        btn5=(Button)findViewById(R.id.btn05);
        btn6=(Button)findViewById(R.id.btn06);
        btn7=(Button)findViewById(R.id.btn07);
        btn8=(Button)findViewById(R.id.btn08);
        btn9=(Button)findViewById(R.id.btn09);
        btn_clr=(Button)findViewById(R.id.btn_clear);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(flag==0)
                {
                    btn1.setText("X");
                    flag=1;
                }
                else
                {
                    btn1.setText("O");
                    flag=0;
                }
                btn1.setEnabled(false);
                Result();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(flag==0)
                {
                    btn2.setText("X");
                    flag=1;
                }
                else
                {
                    btn2.setText("O");
                    flag=0;
                }
                btn2.setEnabled(false);
                Result();
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(flag==0)
                {
                    btn3.setText("X");
                    flag=1;
                }
                else
                {
                    btn3.setText("O");
                    flag=0;
                }
                btn3.setEnabled(false);
                Result();
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(flag==0)
                {
                    btn4.setText("X");
                    flag=1;
                }
                else
                {
                    btn4.setText("O");
                    flag=0;
                }
                btn4.setEnabled(false);
                Result();
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(flag==0)
                {
                    btn5.setText("X");
                    flag=1;
                }
                else
                {
                    btn5.setText("O");
                    flag=0;
                }
                btn5.setEnabled(false);
                Result();
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(flag==0)
                {
                    btn6.setText("X");
                    flag=1;
                }
                else
                {
                    btn6.setText("O");
                    flag=0;
                }
                btn6.setEnabled(false);
                Result();
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(flag==0)
                {
                    btn7.setText("X");
                    flag=1;
                }
                else
                {
                    btn7.setText("O");
                    flag=0;
                }
                btn7.setEnabled(false);
                Result();
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(flag==0)
                {
                    btn8.setText("X");
                    flag=1;
                }
                else
                {
                    btn8.setText("O");
                    flag=0;
                }
                btn8.setEnabled(false);
                Result();
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(flag==0)
                {
                    btn9.setText("X");
                    flag=1;
                }
                else
                {
                    btn9.setText("O");
                    flag=0;
                }
                btn9.setEnabled(false);
                Result();
            }
        });

        btn_clr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn9.setText(" ");
                btn8.setText(" ");
                btn7.setText(" ");
                btn6.setText(" ");
                btn5.setText(" ");
                btn4.setText(" ");
                btn3.setText(" ");
                btn2.setText(" ");
                btn1.setText(" ");
                btn9.setEnabled(true);
                btn8.setEnabled(true);
                btn7.setEnabled(true);
                btn6.setEnabled(true);
                btn5.setEnabled(true);
                btn4.setEnabled(true);
                btn3.setEnabled(true);
                btn2.setEnabled(true);
                btn1.setEnabled(true);
            }
        });

    }

    public void Result()
    {
        String s1=btn1.getText().toString();
        String s2=btn2.getText().toString();
        String s3=btn3.getText().toString();
        String s4=btn4.getText().toString();
        String s5=btn5.getText().toString();
        String s6=btn6.getText().toString();
        String s7=btn7.getText().toString();
        String s8=btn8.getText().toString();
        String s9=btn9.getText().toString();
        if(s1.equals(s2) && s2.equals(s3)&& !s3.equals(" "))
        {
            Toast.makeText(getApplicationContext(), "Bingo!! "+ s1+" Wins", Toast.LENGTH_LONG).show();
            btn1.setEnabled(false);
            btn2.setEnabled(false);
            btn3.setEnabled(false);
            btn4.setEnabled(false);
            btn5.setEnabled(false);
            btn6.setEnabled(false);
            btn7.setEnabled(false);
            btn8.setEnabled(false);
            btn9.setEnabled(false);

        }

        else if(s4.equals(s5) && s5.equals(s6)&& !s6.equals(" "))
        {
            Toast.makeText(getApplicationContext(), "Bingo!! "+ s4+" Wins", Toast.LENGTH_LONG).show();
            btn1.setEnabled(false);
            btn2.setEnabled(false);
            btn3.setEnabled(false);
            btn4.setEnabled(false);
            btn5.setEnabled(false);
            btn6.setEnabled(false);
            btn7.setEnabled(false);
            btn8.setEnabled(false);
            btn9.setEnabled(false);
        }
        else if(s7.equals(s8) && s8.equals(s9)&& !s9.equals(" "))
        {
            Toast.makeText(getApplicationContext(), "Bingo!! "+ s7+" Wins", Toast.LENGTH_LONG).show();
            btn1.setEnabled(false);
            btn2.setEnabled(false);
            btn3.setEnabled(false);
            btn4.setEnabled(false);
            btn5.setEnabled(false);
            btn6.setEnabled(false);
            btn7.setEnabled(false);
            btn8.setEnabled(false);
            btn9.setEnabled(false);
        }
        else if(s1.equals(s4) && s4.equals(s7)&& !s7.equals(" "))
        {
            Toast.makeText(getApplicationContext(), "Bingo!! "+ s1+" Wins", Toast.LENGTH_LONG).show();
            btn1.setEnabled(false);
            btn2.setEnabled(false);
            btn3.setEnabled(false);
            btn4.setEnabled(false);
            btn5.setEnabled(false);
            btn6.setEnabled(false);
            btn7.setEnabled(false);
            btn8.setEnabled(false);
            btn9.setEnabled(false);
        }
        else if(s2.equals(s5) && s5.equals(s8)&& !s8.equals(" "))
        {
            Toast.makeText(getApplicationContext(), "Bingo!! "+ s2+" Wins", Toast.LENGTH_LONG).show();
            btn1.setEnabled(false);
            btn2.setEnabled(false);
            btn3.setEnabled(false);
            btn4.setEnabled(false);
            btn5.setEnabled(false);
            btn6.setEnabled(false);
            btn7.setEnabled(false);
            btn8.setEnabled(false);
            btn9.setEnabled(false);
        }
        else if(s3.equals(s6) && s6.equals(s9)&& !s9.equals(" "))
        {
            Toast.makeText(getApplicationContext(), "Bingo!! "+ s3+" Wins", Toast.LENGTH_LONG).show();
            btn1.setEnabled(false);
            btn2.setEnabled(false);
            btn3.setEnabled(false);
            btn4.setEnabled(false);
            btn5.setEnabled(false);
            btn6.setEnabled(false);
            btn7.setEnabled(false);
            btn8.setEnabled(false);
            btn9.setEnabled(false);
        }
        else if(s1.equals(s5) && s5.equals(s9)&& !s9.equals(" "))
        {
            Toast.makeText(getApplicationContext(), "Bingo!! "+ s1+" Wins", Toast.LENGTH_LONG).show();
            btn1.setEnabled(false);
            btn2.setEnabled(false);
            btn3.setEnabled(false);
            btn4.setEnabled(false);
            btn5.setEnabled(false);
            btn6.setEnabled(false);
            btn7.setEnabled(false);
            btn8.setEnabled(false);
            btn9.setEnabled(false);
        }
        else if(s3.equals(s5) && s5.equals(s7)&& !s7.equals(" "))
        {
            Toast.makeText(getApplicationContext(), "Bingo!! "+ s3+" Wins", Toast.LENGTH_LONG).show();
            btn1.setEnabled(false);
            btn2.setEnabled(false);
            btn3.setEnabled(false);
            btn4.setEnabled(false);
            btn5.setEnabled(false);
            btn6.setEnabled(false);
            btn7.setEnabled(false);
            btn8.setEnabled(false);
            btn9.setEnabled(false);
        }


    }
}
