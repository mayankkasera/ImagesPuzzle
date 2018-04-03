package com.example.mayank.imagespuzzle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ImagePuzleActivity extends AppCompatActivity {

    int ab_location[] = {0, 0, 0, 0, 0, 1, 0, 0, 0};
    int im_location[] = {2, 3, 6, 1, 4, 9, 7, 5, 8};
    int start = 0,flag=1;
    TextView t, t2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_puzle);

        t = (TextView) findViewById(R.id.t);
        t2 = (TextView) findViewById(R.id.t2);

        init1();
    }

    public void click1(View v) {
        ImageView i = (ImageView) findViewById(R.id.i1);
        if (ab_location[1] == 1) {
            ImageView i1 = (ImageView) findViewById(R.id.i2);
            img_swap(2, 1, i, i1);
            swap(1, 0);

        }
        if (ab_location[3] == 1) {
            ImageView i1 = (ImageView) findViewById(R.id.i4);
            img_swap(4, 1, i, i1);
            swap(3, 0);

        }

        checkWin();
    }

    public void click2(View v) {
        ImageView i = (ImageView) findViewById(R.id.i2);
        if (ab_location[0] == 1) {
            ImageView i1 = (ImageView) findViewById(R.id.i1);
            img_swap(1, 2, i, i1);
            swap(0, 1);

        }
        if (ab_location[2] == 1) {
            ImageView i1 = (ImageView) findViewById(R.id.i3);
            img_swap(3, 2, i, i1);
            swap(2, 1);

        }
        if (ab_location[4] == 1) {
            ImageView i1 = (ImageView) findViewById(R.id.i5);
            img_swap(5, 2, i, i1);
            swap(4, 1);

        }

        checkWin();

    }

    public void click3(View v) {
        ImageView i = (ImageView) findViewById(R.id.i3);
        if (ab_location[1] == 1) {
            ImageView i1 = (ImageView) findViewById(R.id.i2);
            img_swap(2, 3, i, i1);
            swap(1, 2);

        }
        if (ab_location[5] == 1) {
            ImageView i1 = (ImageView) findViewById(R.id.i6);
            img_swap(6, 3, i, i1);
            swap(5, 2);

        }

        checkWin();
    }

    public void click4(View v) {
        ImageView i = (ImageView) findViewById(R.id.i4);
        if (ab_location[0] == 1) {
            ImageView i1 = (ImageView) findViewById(R.id.i1);
            img_swap(1, 4, i, i1);
            swap(0, 3);

        }
        if (ab_location[4] == 1) {
            ImageView i1 = (ImageView) findViewById(R.id.i5);
            img_swap(5, 4, i, i1);
            swap(4, 3);

        }
        if (ab_location[6] == 1) {
            ImageView i1 = (ImageView) findViewById(R.id.i7);
            img_swap(7, 4, i, i1);
            swap(6, 3);

        }


        checkWin();
    }

    public void click5(View v) {
        ImageView i = (ImageView) findViewById(R.id.i5);
        if (ab_location[1] == 1) {
            ImageView i1 = (ImageView) findViewById(R.id.i2);
            img_swap(2, 5, i, i1);
            swap(1, 4);

        }
        if (ab_location[3] == 1) {
            ImageView i1 = (ImageView) findViewById(R.id.i4);
            img_swap(4, 5, i, i1);
            swap(3, 4);

        }
        if (ab_location[5] == 1) {
            ImageView i1 = (ImageView) findViewById(R.id.i6);
            img_swap(6, 5, i, i1);
            swap(5, 4);

        }
        if (ab_location[7] == 1) {
            ImageView i1 = (ImageView) findViewById(R.id.i8);
            img_swap(8, 5, i, i1);
            swap(7, 4);

        }

        checkWin();
    }

    public void click6(View v) {
        ImageView i = (ImageView) findViewById(R.id.i6);
        if (ab_location[8] == 1) {
            ImageView i1 = (ImageView) findViewById(R.id.i9);
            img_swap(9, 6, i, i1);
            swap(8, 5);



        }
        if (ab_location[4] == 1) {
            ImageView i1 = (ImageView) findViewById(R.id.i5);
            img_swap(5, 6, i, i1);
            swap(4, 5);

        }
        if (ab_location[2] == 1) {
            ImageView i1 = (ImageView) findViewById(R.id.i3);
            img_swap(3, 6, i, i1);
            swap(2, 5);

        }

        checkWin();

    }

    public void click7(View v) {
        ImageView i = (ImageView) findViewById(R.id.i7);
        if (ab_location[3] == 1) {
            ImageView i1 = (ImageView) findViewById(R.id.i4);
            img_swap(4, 7, i, i1);
            swap(3, 6);

        }
        if (ab_location[7] == 1) {
            ImageView i1 = (ImageView) findViewById(R.id.i8);
            img_swap(8, 7, i, i1);
            swap(7, 6);

        }

        checkWin();
    }

    public void click8(View v) {
        ImageView i = (ImageView) findViewById(R.id.i8);
        if (ab_location[6] == 1) {
            ImageView i1 = (ImageView) findViewById(R.id.i7);
            img_swap(7, 8, i, i1);
            swap(6, 7);

        }
        if (ab_location[4] == 1) {
            ImageView i1 = (ImageView) findViewById(R.id.i5);
            img_swap(5, 8, i, i1);
            swap(4, 7);

        }
        if (ab_location[8] == 1) {
            ImageView i1 = (ImageView) findViewById(R.id.i9);
            img_swap(9, 8, i, i1);
            swap(8, 7);

        }

        checkWin();

    }

    public void click9(View v) {
        ImageView i = (ImageView) findViewById(R.id.i9);
        if (ab_location[5] == 1) {
            ImageView i1 = (ImageView) findViewById(R.id.i6);
            img_swap(6, 9, i, i1);
            swap(5, 8);

        }
        if (ab_location[7] == 1) {
            ImageView i1 = (ImageView) findViewById(R.id.i8);
            img_swap(8, 9, i, i1);
            swap(7, 8);

        }

        checkWin();
    }

    public void playagain(View v) {
        t2.setText("");
        if(flag==0) {
            init1();
        }
        else
        {
            init();
        }
    }

    void init1() {
        ab_location[5] = 1;
        ab_location[7] = 0;
        ab_location[0] = 0;
        ab_location[1] = 0;
        ab_location[2] = 0;
        ab_location[3] = 0;
        ab_location[4] = 0;
        ab_location[8] = 0;
        ab_location[6] = 0;

        im_location[0] = 4;
        im_location[1] = 5;
        im_location[2] = 1;
        im_location[3] = 7;
        im_location[4] = 3;
        im_location[5] = 9;
        im_location[6] = 8;
        im_location[7] = 2;
        im_location[8] = 6;


        ImageView i[] = new ImageView[9];
        i[0] = (ImageView) findViewById(R.id.i1);
        i[0].setImageResource(R.drawable.f4);
        i[1] = (ImageView) findViewById(R.id.i2);
        i[1].setImageResource(R.drawable.f5);
        i[2] = (ImageView) findViewById(R.id.i3);
        i[2].setImageResource(R.drawable.f1);
        i[3] = (ImageView) findViewById(R.id.i4);
        i[3].setImageResource(R.drawable.f7);
        i[4] = (ImageView) findViewById(R.id.i5);
        i[4].setImageResource(R.drawable.f3);
        i[5] = (ImageView) findViewById(R.id.i6);
        i[5].setImageResource(R.drawable.untitled3);
        i[6] = (ImageView) findViewById(R.id.i7);
        i[6].setImageResource(R.drawable.f8);
        i[7] = (ImageView) findViewById(R.id.i8);
        i[7].setImageResource(R.drawable.f2);
        i[8] = (ImageView) findViewById(R.id.i9);
        i[8].setImageResource(R.drawable.f6);
        flag=1;

    }

    void init() {
        ab_location[5] = 1;
        ab_location[7] = 0;
        ab_location[0] = 0;
        ab_location[1] = 0;
        ab_location[2] = 0;
        ab_location[3] = 0;
        ab_location[4] = 0;
        ab_location[8] = 0;
        ab_location[6] = 0;

        im_location[0] = 2;
        im_location[1] = 3;
        im_location[2] = 6;
        im_location[3] = 1;
        im_location[4] = 4;
        im_location[5] = 9;
        im_location[6] = 7;
        im_location[7] = 5;
        im_location[8] = 8;


        ImageView i[] = new ImageView[9];
        i[0] = (ImageView) findViewById(R.id.i1);
        i[0].setImageResource(R.drawable.f2);
        i[1] = (ImageView) findViewById(R.id.i2);
        i[1].setImageResource(R.drawable.f3);
        i[2] = (ImageView) findViewById(R.id.i3);
        i[2].setImageResource(R.drawable.f6);
        i[3] = (ImageView) findViewById(R.id.i4);
        i[3].setImageResource(R.drawable.f1);
        i[4] = (ImageView) findViewById(R.id.i5);
        i[4].setImageResource(R.drawable.f4);
        i[5] = (ImageView) findViewById(R.id.i6);
        i[5].setImageResource(R.drawable.untitled3);
        i[6] = (ImageView) findViewById(R.id.i7);
        i[6].setImageResource(R.drawable.f7);
        i[7] = (ImageView) findViewById(R.id.i8);
        i[7].setImageResource(R.drawable.f5);
        i[8] = (ImageView) findViewById(R.id.i9);
        i[8].setImageResource(R.drawable.f8);
        flag=0;
    }

    void img_swap(int x, int y, ImageView i, ImageView i1) {

        String mDrawableName = checkImageName(x);
        int resID = getResources().getIdentifier(mDrawableName, "drawable", getPackageName());
        i.setImageResource(resID);

        mDrawableName = checkImageName(y);
        resID = getResources().getIdentifier(mDrawableName, "drawable", getPackageName());
        i1.setImageResource(resID);
    }

    void swap(int x, int y) {
        start = 1;
        int temp = im_location[x];
        im_location[x] = im_location[y];
        im_location[y] = temp;
        temp = ab_location[x];
        ab_location[x] = ab_location[y];
        ab_location[y] = temp;
    }

    public void checkWin() {
        if (start == 1 && im_location[0] == 1 && im_location[1] == 2 && im_location[2] == 3 && im_location[3] == 4 && im_location[4] == 5 && im_location[5] == 6 && im_location[6] == 7 && im_location[7] == 8 && im_location[8] == 9) {
            t2.setText("Win!!!!");
        }
    }

    String checkImageName(int index) {
        int x = im_location[index - 1];

        switch (x) {
            case 1:
                return "f1";
            case 2:
                return "f2";
            case 3:
                return "f3";
            case 4:
                return "f4";
            case 5:
                return "f5";
            case 6:
                return "f6";
            case 7:
                return "f7";
            case 8:
                return "f8";
            case 9:
                return "untitled";

        }

        return null;
    }

}
