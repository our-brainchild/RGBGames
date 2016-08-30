package game.color.ivan.gamecolor;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ArrayList<Rectangle> ar = new ArrayList<>();
    TextView tx;
    TextView mx;
    int range;
    int now_range;
    int max_range;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.field_game);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        tx = (TextView) this.findViewById(R.id.score);
        mx = (TextView) this.findViewById(R.id.hardScore);
        tx.setText(0+"");
        mx.setText(0+"");
        mx.refreshDrawableState();
        tx.refreshDrawableState();
        max_range=0;
        range=0;

        for(int i=0; i<10; i++){
            for(int j=0; j<10; j++){
                ar.add(new Rectangle(0,this.findViewById(getResources().getIdentifier("rect_"+i+""+j,"id",getPackageName()))));
            }
        }
        new_game();
        View B_B = (View)this.findViewById(R.id.blue_button);
        B_B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                repaint(1);
            }
        });
        View B_R = (View)this.findViewById(R.id.red_button);
        B_R.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                repaint(3);
            }
        });
        View B_G = (View)this.findViewById(R.id.grean_button);
        B_G.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                repaint(2);
            }
        });
        View B_Y = (View)this.findViewById(R.id.yellow_button);
        B_Y.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                repaint(4);
            }
        });
    }

    private int create_menu() {
        return 1;
    }

    public void repaint(int color){
        for(int i=1; i<100; i++){
            range += (now_range*2)*now_range;
            if(range > max_range){
                max_range=range;
                mx.setText(max_range+"");
                mx.refreshDrawableState();
            }
            tx.setText(range+"");
            tx.refreshDrawableState();
            now_range=0;
            if((ar.get(i-1).getColor() == 0 && ar.get(i).getColor() == color)){
                ar.get(i).getRect().setBackgroundResource(R.drawable.main_rectangle);
                ar.get(i).setColor(0);
                now_range++;
                rec_repaint(i, color);
            }
            if(i<98 && ar.get(i+1).getColor() == 0 && ar.get(i).getColor() == color && (i%10)!=9){
                ar.get(i).getRect().setBackgroundResource(R.drawable.main_rectangle);
                ar.get(i).setColor(0);
                now_range++;
                rec_repaint(i, color);
            }
            if(i>9 && ar.get(i-10).getColor() == 0 && ar.get(i).getColor() == color){
                ar.get(i).getRect().setBackgroundResource(R.drawable.main_rectangle);
                ar.get(i).setColor(0);
                now_range++;
                rec_repaint(i, color);
            }
            if(i<89 && ar.get(i+10).getColor() == 0 && ar.get(i).getColor() == color){
                ar.get(i).getRect().setBackgroundResource(R.drawable.main_rectangle);
                ar.get(i).setColor(0);
                now_range++;
                rec_repaint(i, color);
            }
            if(end_game()){
                new_game();
                range = 0;
                now_range=0;
                tx.setText(0+"");
                tx.refreshDrawableState();
            }
        }
    }

    private void rec_repaint(int i, int color) {
        if(i<99 &&ar.get(i).getColor() == 0 && ar.get(i+1).getColor() == color && ((i)%10)!=9){
            ar.get(i+1).getRect().setBackgroundResource(R.drawable.main_rectangle);
            ar.get(i+1).setColor(0);
            now_range++;
            rec_repaint(i+1, color);
        }
        if(i>10 && ar.get(i).getColor() == 0 && ar.get(i-10).getColor() == color && ((i-10)%10)!=9){
            ar.get(i-10).getRect().setBackgroundResource(R.drawable.main_rectangle);
            ar.get(i-10).setColor(0);
            now_range++;
            rec_repaint(i-10, color);
        }
        if(i<89 && ar.get(i).getColor() == 0 && ar.get(i+10).getColor() == color&& ((i+10)%10)!=9){
            ar.get(i+10).getRect().setBackgroundResource(R.drawable.main_rectangle);
            ar.get(i+10).setColor(0);
            now_range++;
            rec_repaint(i+10, color);
        }
        if(i>1 && ar.get(i).getColor() == 0 && ar.get(i-1).getColor() == color && ((i-1)%10)!=9){
            ar.get(i-1).getRect().setBackgroundResource(R.drawable.main_rectangle);
            ar.get(i-1).setColor(0);
            now_range++;
            rec_repaint(i-1, color);
        }
        return;
    }

    public boolean end_game(){
        for(int i=0; i<100; i++){
            if(ar.get(i).getColor() != 0){
                return false;
            }
        }
        return true;
    }

    public void new_game(){
        for(int k=1; k<100; k++){
            int rand = 0;
            Random random = new Random();
            rand = random.nextInt(4);
            switch(rand){
                case 0:{
                    ar.get(k).getRect().setBackgroundResource(R.drawable.rect_b);
                    ar.get(k).setColor(1);
                    break;
                }
                case 1:{
                    ar.get(k).getRect().setBackgroundResource(R.drawable.rect_g);
                    ar.get(k).setColor(2);
                    break;
                }
                case 2:{
                    ar.get(k).getRect().setBackgroundResource(R.drawable.rect_r);
                    ar.get(k).setColor(3);
                    break;
                }
                case 3:{
                    ar.get(k).getRect().setBackgroundResource(R.drawable.rect_y);
                    ar.get(k).setColor(4);
                    break;
                }
                default:{

                    break;
                }
            }
        }
    }
}
class Rectangle{
    private View rect;
    private int color;

    Rectangle(int color, View rect){
        this.color = color;
        this.rect = rect;
    }

    public int getColor() {
        return color;
    }

    public View getRect() {
        return rect;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public void setRect(View rect) {
        this.rect = rect;
    }
}