package game.color.ivan.gamecolor;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int width;
    int height;
    View rectange[][] = new View[10][10];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.field_game);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        Display display = ((WindowManager) getSystemService(WINDOW_SERVICE)).getDefaultDisplay();
        width = display.getWidth();
        Log.d("My: ",width+"");
        rectange[0][0] = this.findViewById(R.id.rect_00);
        rectange[0][1] = this.findViewById(R.id.rect_01);
        rectange[0][2] = this.findViewById(R.id.rect_02);
        rectange[0][3] = this.findViewById(R.id.rect_03);
        rectange[0][4] = this.findViewById(R.id.rect_04);
        rectange[0][5] = this.findViewById(R.id.rect_05);
        rectange[0][6] = this.findViewById(R.id.rect_06);
        rectange[0][7] = this.findViewById(R.id.rect_07);
        rectange[0][8] = this.findViewById(R.id.rect_08);
        rectange[0][9] = this.findViewById(R.id.rect_09);

        rectange[1][0] = this.findViewById(R.id.rect_10);
        rectange[1][1] = this.findViewById(R.id.rect_11);
        rectange[1][2] = this.findViewById(R.id.rect_12);
        rectange[1][3] = this.findViewById(R.id.rect_13);
        rectange[1][4] = this.findViewById(R.id.rect_14);
        rectange[1][5] = this.findViewById(R.id.rect_15);
        rectange[1][6] = this.findViewById(R.id.rect_16);
        rectange[1][7] = this.findViewById(R.id.rect_17);
        rectange[1][8] = this.findViewById(R.id.rect_18);
        rectange[1][9] = this.findViewById(R.id.rect_19);

        rectange[2][0] = this.findViewById(R.id.rect_20);
        rectange[2][1] = this.findViewById(R.id.rect_21);
        rectange[2][2] = this.findViewById(R.id.rect_22);
        rectange[2][3] = this.findViewById(R.id.rect_23);
        rectange[2][4] = this.findViewById(R.id.rect_24);
        rectange[2][5] = this.findViewById(R.id.rect_25);
        rectange[2][6] = this.findViewById(R.id.rect_26);
        rectange[2][7] = this.findViewById(R.id.rect_27);
        rectange[2][8] = this.findViewById(R.id.rect_28);
        rectange[2][9] = this.findViewById(R.id.rect_29);


        rectange[3][0] = this.findViewById(R.id.rect_30);
        rectange[3][1] = this.findViewById(R.id.rect_31);
        rectange[3][2] = this.findViewById(R.id.rect_32);
        rectange[3][3] = this.findViewById(R.id.rect_33);
        rectange[3][4] = this.findViewById(R.id.rect_34);
        rectange[3][5] = this.findViewById(R.id.rect_35);
        rectange[3][6] = this.findViewById(R.id.rect_36);
        rectange[3][7] = this.findViewById(R.id.rect_37);
        rectange[3][8] = this.findViewById(R.id.rect_38);
        rectange[3][9] = this.findViewById(R.id.rect_39);

        rectange[4][0] = this.findViewById(R.id.rect_40);
        rectange[4][1] = this.findViewById(R.id.rect_41);
        rectange[4][2] = this.findViewById(R.id.rect_42);
        rectange[4][3] = this.findViewById(R.id.rect_43);
        rectange[4][4] = this.findViewById(R.id.rect_44);
        rectange[4][5] = this.findViewById(R.id.rect_45);
        rectange[4][6] = this.findViewById(R.id.rect_46);
        rectange[4][7] = this.findViewById(R.id.rect_47);
        rectange[4][8] = this.findViewById(R.id.rect_48);
        rectange[4][9] = this.findViewById(R.id.rect_49);

        rectange[5][0] = this.findViewById(R.id.rect_50);
        rectange[5][1] = this.findViewById(R.id.rect_51);
        rectange[5][2] = this.findViewById(R.id.rect_52);
        rectange[5][3] = this.findViewById(R.id.rect_53);
        rectange[5][4] = this.findViewById(R.id.rect_54);
        rectange[5][5] = this.findViewById(R.id.rect_55);
        rectange[5][6] = this.findViewById(R.id.rect_56);
        rectange[5][7] = this.findViewById(R.id.rect_57);
        rectange[5][8] = this.findViewById(R.id.rect_58);
        rectange[5][9] = this.findViewById(R.id.rect_59);

        rectange[6][0] = this.findViewById(R.id.rect_60);
        rectange[6][1] = this.findViewById(R.id.rect_61);
        rectange[6][2] = this.findViewById(R.id.rect_62);
        rectange[6][3] = this.findViewById(R.id.rect_63);
        rectange[6][4] = this.findViewById(R.id.rect_64);
        rectange[6][5] = this.findViewById(R.id.rect_65);
        rectange[6][6] = this.findViewById(R.id.rect_66);
        rectange[6][7] = this.findViewById(R.id.rect_67);
        rectange[6][8] = this.findViewById(R.id.rect_68);
        rectange[6][9] = this.findViewById(R.id.rect_69);


        rectange[7][0] = this.findViewById(R.id.rect_70);
        rectange[7][1] = this.findViewById(R.id.rect_71);
        rectange[7][2] = this.findViewById(R.id.rect_72);
        rectange[7][3] = this.findViewById(R.id.rect_73);
        rectange[7][4] = this.findViewById(R.id.rect_74);
        rectange[7][5] = this.findViewById(R.id.rect_75);
        rectange[7][6] = this.findViewById(R.id.rect_76);
        rectange[7][7] = this.findViewById(R.id.rect_77);
        rectange[7][8] = this.findViewById(R.id.rect_78);
        rectange[7][9] = this.findViewById(R.id.rect_79);

        rectange[8][0] = this.findViewById(R.id.rect_80);
        rectange[8][1] = this.findViewById(R.id.rect_81);
        rectange[8][2] = this.findViewById(R.id.rect_82);
        rectange[8][3] = this.findViewById(R.id.rect_83);
        rectange[8][4] = this.findViewById(R.id.rect_84);
        rectange[8][5] = this.findViewById(R.id.rect_85);
        rectange[8][6] = this.findViewById(R.id.rect_86);
        rectange[8][7] = this.findViewById(R.id.rect_87);
        rectange[8][8] = this.findViewById(R.id.rect_88);
        rectange[8][9] = this.findViewById(R.id.rect_89);


        rectange[9][0] = this.findViewById(R.id.rect_90);
        rectange[9][1] = this.findViewById(R.id.rect_91);
        rectange[9][2] = this.findViewById(R.id.rect_92);
        rectange[9][3] = this.findViewById(R.id.rect_93);
        rectange[9][4] = this.findViewById(R.id.rect_94);
        rectange[9][5] = this.findViewById(R.id.rect_95);
        rectange[9][6] = this.findViewById(R.id.rect_96);
        rectange[9][7] = this.findViewById(R.id.rect_97);
        rectange[9][8] = this.findViewById(R.id.rect_98);
        rectange[9][9] = this.findViewById(R.id.rect_99);

        for(int i=0; i<10; i++){
            for(int j=0; j<10; j++){
                int rand = 0;//(int) Math.abs(Math.abs((Math.random()*10))-7);
                Random random = new Random();
                rand = random.nextInt(4);
                Log.d("My: ",rand+"");
                switch(rand){
                    case 0:{
                        rectange[i][j].setBackgroundResource(R.drawable.rect_b);
                        break;
                    }
                    case 1:{
                        rectange[i][j].setBackgroundResource(R.drawable.rect_g);
                        break;
                    }
                    case 2:{
                        rectange[i][j].setBackgroundResource(R.drawable.rect_r);
                        break;
                    }
                    case 3:{
                        rectange[i][j].setBackgroundResource(R.drawable.main_rectangle);
                        break;
                    }
                    default:{

                        break;
                    }
                }
            }
        }

        View B_B = (View)this.findViewById(R.id.blue_button);
        B_B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("My: ","I'm blue button");
            }
        });

    }


}
