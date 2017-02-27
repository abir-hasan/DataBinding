package com.abir.databinding;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.abir.databinding.databinding.ActivityTestObservableBinding;
import com.abir.databinding.models.DummyModel;

public class ObservableTestActivity extends AppCompatActivity {

    ActivityTestObservableBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_test_observable);

        observableFieldExample();
    }

    private void observableFieldExample() {
        final DummyModel model = new DummyModel();
        model.setName("");
        model.setAge("250");
        binding.setModel(model);
    }
}
