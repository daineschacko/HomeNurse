package com.sgcreatives.a0003;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class Registration extends AppCompatActivity {


    EditText name, email, password,account_no,address,phone_no,confirm;
    TextView name_text,account_text,phone_text,address_text,email_text, password_text,confirm_text, login_title;

    LinearLayout already_have_account_layout;
    CardView register_card;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        name = findViewById(R.id.name);
        name_text = findViewById(R.id.name_text);
        account_no=findViewById(R.id.account_no);
        account_text=findViewById(R.id.account_text);
        phone_no=findViewById(R.id.phone_no);
        phone_text=findViewById(R.id.phone_text);
        address=findViewById(R.id.address);
        address_text=findViewById(R.id.address_text);
        email = findViewById(R.id.email);
        email_text = findViewById(R.id.email_text);
        password = findViewById(R.id.password);
        password_text = findViewById(R.id.password_text);
        confirm=findViewById(R.id.confirm);
        confirm_text=findViewById(R.id.confirm_text);

        login_title = findViewById(R.id.registration_title);
        already_have_account_layout = findViewById(R.id.already_have_account_text);
        register_card = findViewById(R.id.register_card);



        Animation editText_anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.edittext_anim);
        name.startAnimation(editText_anim);
        email.startAnimation(editText_anim);
        password.startAnimation(editText_anim);
        phone_no.startAnimation(editText_anim);
        account_no.startAnimation(editText_anim);
        address.startAnimation(editText_anim);
        confirm.startAnimation(editText_anim);

        Animation field_name_anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.field_name_anim);
        name_text.startAnimation(field_name_anim);
        email_text.startAnimation(field_name_anim);
        password_text.startAnimation(field_name_anim);
        phone_text.startAnimation(field_name_anim);
        address_text.startAnimation(field_name_anim);
        confirm_text.startAnimation(field_name_anim);
        account_text.startAnimation(field_name_anim);

        login_title.startAnimation(field_name_anim);

        Animation center_reveal_anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.center_reveal_anim);
        register_card.startAnimation(center_reveal_anim);

        Animation new_user_anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.down_top);
        already_have_account_layout.startAnimation(new_user_anim);

    }

    public void login(View view) {
        finish();
    }
    public void registerButton(View view) {
        Toast.makeText(this,"Register Clicked",Toast.LENGTH_SHORT).show();
    }
}
