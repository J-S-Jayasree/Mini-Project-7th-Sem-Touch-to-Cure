package com.example.myapplication1.ui.home;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider;

import com.example.myapplication1.R;
import com.example.myapplication1.databinding.FragmentHomeBinding;


public class HomeFragment extends Fragment {
    int flag=0;

    EditText t1,t2;
    private HomeViewModel homeViewModel;
    private FragmentHomeBinding binding;


    @RequiresApi(api = Build.VERSION_CODES.M)
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        /*final TextView textView = binding.textHome;
        homeViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });*/

        Button myButton = (Button) root.findViewById(R.id.sign_in);
        Button myButton1 = (Button) root.findViewById(R.id.register);

        t1=(EditText)root.findViewById(R.id.email);
        Animation animation = AnimationUtils.loadAnimation(getContext(),
               R.anim.fui_slide_in_right);
        //t1.startAnimation(animation);
        String email=t1.getText().toString();
        t2=(EditText)root.findViewById(R.id.password);
        String pass=t2.getText().toString();

        //SQLiteDatabase db = DB.getReadableDatabase();
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Email = t1.getText().toString();
                String pass = t2.getText().toString();
                System.out.println(Email+" "+pass);
                if(Email.isEmpty()||pass.isEmpty()) {
                    Message.message(getActivity(),"Enter Both Email and Password");
                }
                else  if (Email.equals("jayasreesankar789@gmail.com")  && pass.equals("sree")) {
                    Message.message(getActivity(), "Successful");
                    Intent intent = new Intent(view.getContext(), Activity2.class);
                    startActivity(intent);

                }
                else
                {

                    Message.message(getActivity(), "Unsuccessful");
                }
                //Cursor res=DB.getdata();
                // if(res.getCount()==0) {

                //return;
                // }
                //StringBuffer buffer=new StringBuffer();
                //while(res.moveToNext()){
                //if(res.getString(0)==email && res.getString(1)==pass)
                //{
                //   flag=1;
                //  break;
                //}

                // }
                //if(flag==1) {
                    // }
                }

        });
        myButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              Intent i1=new Intent(view.getContext(),Register.class);
              startActivity(i1);
            }
        });
        return root;
    }


}