package com.example.myapplication1.ui.home;
import android.app.DatePickerDialog;
import android.content.Intent;
import android.icu.util.Calendar;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import com.example.myapplication1.R;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;

public class ChooseSlot extends AppCompatActivity implements DatePickerDialog.OnDateSetListener {

    public String booked;

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.choose_slot);

        SimpleDateFormat dtf = new SimpleDateFormat("dd/MM/yyyy");
        Calendar calendar = Calendar.getInstance();
        Date dateObj = calendar.getTime();
        String formattedDate = dtf.format(dateObj);



        RadioButton tt1,tt2,tt3,tt4,tt5,tt6,tt7,tt8,tt9,tt10,tt11,tt12;
        TextView t1;
        Button b1;
        b1=findViewById(R.id.button5);
        t1=findViewById(R.id.textView10);
        tt1=findViewById(R.id.time1);
        tt2=findViewById(R.id.time2);
        tt3=findViewById(R.id.time3);
        tt4=findViewById(R.id.time4);
        tt5=findViewById(R.id.time5);
        tt6=findViewById(R.id.time6);
        tt7=findViewById(R.id.time7);
        tt8=findViewById(R.id.time8);
        tt9=findViewById(R.id.time9);
        tt10=findViewById(R.id.time10);
        tt11=findViewById(R.id.time11);
        tt12=findViewById(R.id.time12);
        final int[] bflag = {0};
        String arr[]=formattedDate.split("/");
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
showDatePickerDialog();
bflag[0] =1;
            }
        });
        String n1="Today's Date   :  "+formattedDate;
        t1.setText(n1);
        Button check;
        check=findViewById(R.id.button4);
        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AtomicInteger flag= new AtomicInteger();
                flag.set(0);
                if(bflag[0] ==1)
                {
                    if(tt1.isChecked()&&tt2.isChecked()==false&&tt3.isChecked()==false&&tt4.isChecked()==false&&tt5.isChecked()==false&&
                tt5.isChecked()==false&&tt6.isChecked()==false&&tt7.isChecked()==false&&tt8.isChecked()==false&&tt9.isChecked()==false&&tt10.isChecked()==false&&
                tt11.isChecked()==false&&tt12.isChecked()==false)
                    {
                        flag.set(1);
                    }
                    else if(tt1.isChecked()==false&&tt2.isChecked()&&tt3.isChecked()==false&&tt4.isChecked()==false&&tt5.isChecked()==false&&
                            tt5.isChecked()==false&&tt6.isChecked()==false&&tt7.isChecked()==false&&tt8.isChecked()==false&&tt9.isChecked()==false&&tt10.isChecked()==false&&
                            tt11.isChecked()==false&&tt12.isChecked()==false)
                    {
                     flag.set(1);
                    }
                    else if(tt1.isChecked()==false&&tt2.isChecked()==false&&tt3.isChecked()&&tt4.isChecked()==false&&tt5.isChecked()==false&&
                            tt5.isChecked()==false&&tt6.isChecked()==false&&tt7.isChecked()==false&&tt8.isChecked()==false&&tt9.isChecked()==false&&tt10.isChecked()==false&&
                            tt11.isChecked()==false&&tt12.isChecked()==false)
                    {
                        flag.set(1);
                    }
                    else if(tt1.isChecked()==false&&tt2.isChecked()==false&&tt3.isChecked()==false&&tt4.isChecked()&&tt5.isChecked()==false&&
                            tt5.isChecked()==false&&tt6.isChecked()==false&&tt7.isChecked()==false&&tt8.isChecked()==false&&tt9.isChecked()==false&&tt10.isChecked()==false&&
                            tt11.isChecked()==false&&tt12.isChecked()==false)
                    {
                        flag.set(1);
                    }
                    else if(tt1.isChecked()==false&&tt2.isChecked()==false&&tt3.isChecked()==false&&tt4.isChecked()==false&&tt5.isChecked()&&
                            tt5.isChecked()==false&&tt6.isChecked()==false&&tt7.isChecked()==false&&tt8.isChecked()==false&&tt9.isChecked()==false&&tt10.isChecked()==false&&
                            tt11.isChecked()==false&&tt12.isChecked()==false)
                    {
                        flag.set(1);
                    }
                    else if(tt1.isChecked()==false&&tt2.isChecked()==false&&tt3.isChecked()==false&&tt4.isChecked()==false&&tt5.isChecked()==false&&
                            tt5.isChecked()==false&&tt6.isChecked()&&tt7.isChecked()==false&&tt8.isChecked()==false&&tt9.isChecked()==false&&tt10.isChecked()==false&&
                                    tt11.isChecked()==false&&tt12.isChecked()==false)
                    {
                        flag.set(1);
                    }
                    else if(tt1.isChecked()==false&&tt2.isChecked()==false&&tt3.isChecked()==false&&tt4.isChecked()==false&&tt5.isChecked()==false&&
                            tt5.isChecked()==false&&tt6.isChecked()==false&&tt7.isChecked()&&tt8.isChecked()==false&&tt9.isChecked()==false&&tt10.isChecked()==false&&
                            tt11.isChecked()==false&&tt12.isChecked()==false)
                    {
                        flag.set(1);
                    }
                    else if(tt1.isChecked()==false&&tt2.isChecked()==false&&tt3.isChecked()==false&&tt4.isChecked()==false&&tt5.isChecked()==false&&
                            tt5.isChecked()==false&&tt6.isChecked()==false&&tt7.isChecked()==false&&tt8.isChecked()&&tt9.isChecked()==false&&tt10.isChecked()==false&&
                            tt11.isChecked()==false&&tt12.isChecked()==false)
                    {
                        flag.set(1);
                    }
                    else if(tt1.isChecked()==false&&tt2.isChecked()==false&&tt3.isChecked()==false&&tt4.isChecked()==false&&tt5.isChecked()==false&&
                            tt5.isChecked()==false&&tt6.isChecked()==false&&tt7.isChecked()==false&&tt8.isChecked()==false&&tt9.isChecked()&&tt10.isChecked()==false&&
                            tt11.isChecked()==false&&tt12.isChecked()==false)
                    {
                        flag.set(1);
                    }
                    else if(tt1.isChecked()==false&&tt2.isChecked()==false&&tt3.isChecked()==false&&tt4.isChecked()==false&&tt5.isChecked()==false&&
                            tt5.isChecked()==false&&tt6.isChecked()==false&&tt7.isChecked()==false&&tt8.isChecked()==false&&tt9.isChecked()==false&&tt10.isChecked()&&
                            tt11.isChecked()==false&&tt12.isChecked()==false)
                    {
                        flag.set(1);
                    }
                    else if(tt1.isChecked()==false&&tt2.isChecked()==false&&tt3.isChecked()==false&&tt4.isChecked()==false&&tt5.isChecked()==false&&
                            tt5.isChecked()==false&&tt6.isChecked()==false&&tt7.isChecked()==false&&tt8.isChecked()==false&&tt9.isChecked()==false&&tt10.isChecked()==false&&
                            tt11.isChecked()&&tt12.isChecked()==false)
                    {
                        flag.set(1);
                    }
                    else if(tt1.isChecked()==false&&tt2.isChecked()==false&&tt3.isChecked()==false&&tt4.isChecked()==false&&tt5.isChecked()==false&&
                            tt5.isChecked()==false&&tt6.isChecked()==false&&tt7.isChecked()==false&&tt8.isChecked()==false&&tt9.isChecked()==false&&tt10.isChecked()==false&&
                            tt11.isChecked()==false&&tt12.isChecked())
                    {
                        flag.set(1);
                    }
                    if(flag.get() ==1)
                    {
                        Intent i1=new Intent(view.getContext(),BookConfirm.class);
                        startActivity(i1);
                    }
                    else
                    {
                        Message.message1(view.getContext(),"Please Select One Slot only");
                    }

                }
                else
                {
                    Message.message1(view.getContext(),"Please Select Date");
                }


            }
        });
        getSupportActionBar().setTitle("Touch to Cure");
    }
    private void showDatePickerDialog(){
        DatePickerDialog datePickerDialog=new DatePickerDialog(this,this,java.util.Calendar.getInstance().get(Calendar.YEAR),
                java.util.Calendar.getInstance().get(Calendar.MONTH),
                java.util.Calendar.getInstance().get(Calendar.DAY_OF_MONTH));
        datePickerDialog.getDatePicker().setMinDate(System.currentTimeMillis() - 1000);
        datePickerDialog.getDatePicker().setMaxDate((System.currentTimeMillis() - 1000)+(1000*60*60*24*7));
        datePickerDialog.show();
    }
    @Override
    public void onDateSet(DatePicker datePicker, int year, int month, int dayofmonth) {
            booked=dayofmonth+"/"+month+"/"+year;
    }
}
