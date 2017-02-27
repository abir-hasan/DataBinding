package com.abir.databinding;

import android.databinding.BindingAdapter;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.abir.databinding.databinding.ActivityMainBinding;
import com.abir.databinding.models.Student;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        firstExample();
        secondExample();
        thirdExample();
        fourthExample();
        fifthExample();
        sixthExample();
    }

    private void sixthExample() {
        Student student = new Student();
        student.setName("abir");
        student.setAge(25);

        List<Student> studentList = new ArrayList<>();
        studentList.add(student);

        Map<String, Integer> nameVsAge = new HashMap<>();
        nameVsAge.put(student.getName(), student.getAge());

        binding.setStudentsList(studentList);
        binding.setNameAndAge(nameVsAge);
    }

    private void fifthExample() {
        binding.setBtnHandler(new EventHandler(this));
    }

    private void fourthExample() {
        binding.setBtnHandler(new EventHandler(this));
    }

    private void thirdExample() {
        Student student = new Student();
        student.setName(null);
        //student.setName("Abir");
        student.setAge(25);
        student.setImageUrl("https://lh3.googleusercontent.com/6fNqc2ejbE3aPanog5SEvOUikdtxnoWxLB96Gtzyv7Iz7ktkrGxUlMlbf1vutB3lGT01-SX9=w176-h176-n-o-rw");

        binding.setMStudent(student);
    }

    private void secondExample() {
        binding.setTextOne("One");
        binding.setTextTwo("Two");
        binding.setTextThree("Three");
    }

    private void firstExample() {
        binding.tvOne.setText("Hello One!");
    }

    @BindingAdapter({"bind:imageUrl"})
    public static void loadImage(ImageView iv, String url) {
        Picasso.with(iv.getContext()).load(url).fit().into(iv);
    }
}
